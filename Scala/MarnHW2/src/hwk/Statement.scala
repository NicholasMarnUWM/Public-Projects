
package hwk;

 
sealed abstract class Statement extends AbstractSyntaxTree {
  // add label to statements and add height
  def prep {
    this.setid
    this match {
    case Script(stmts) => { addHeights(stmts); stmts.foreach(s => s.prep) }
    case BlockStmt(stmts) => { addHeights(stmts); stmts.foreach(s => s.prep) }
    case VarDeclListStmt(decls) => { addHeights(decls); decls.foreach(s => s.prep) }
    case FunctionDecl(_, fun) => { fun.height = height; addHeight(fun.asInstanceOf[FunctionExpr].body) }
    case IfStmt(_, thenPart, elsePart) => { addHeights(List(thenPart, elsePart)); thenPart.prep; elsePart.prep } 
    case SwitchStmt(_, cases, defaultCase) => { 
      val d =  cases ++ (defaultCase match {case Some(c) => {c.default=true; List(c)} case None => List()})
      addHeights(d)
      d.foreach(c => c.prep)
    }
    case CaseStmt(_, body) => { addHeight(body); body.prep }
    case DoWhileStmt(_, body) => { addHeight(body); body.prep }
    case WhileStmt(_, body) => { addHeight(body); body.prep }
    case ForStmt(_, _, _, body) => {  addHeight(body); body.prep }
    case ForInStmt(_, _, body) => { addHeight(body); body.prep }
    case LabeledStmt(_, body) => { addHeight(body); body.prep }
    case _ => 
    }
  }
  
  override def toString = this match {
    case Script(stmts) => toString(stmts)
    case BlockStmt(stmts) => space + "{\n" + toString(stmts) + space + "}"
    case VarDeclListStmt(decls) => toString(decls)
    case EmptyStmt() => ""
    case ExprStmt(expr) => space + expr.toString
    case VarDeclStmt(name, expr) => { 
      val e = expr match { case EmptyExpr() => "" case _ => " = " + expr }
      space + "var " + name + e
    }
    case FunctionDecl(name, fun) =>  fun.toString
    case ReturnStmt(expr) => space + "return " + expr
    case IfStmt(cond, thenPart, elsePart) => { 
      val e = elsePart match { case EmptyStmt() => "" case _ => " else\n" + elsePart }
      space + "if (" + cond + ") " + "\n" + thenPart + e
    }
    case SwitchStmt(cond, cases, defaultCase) => {      
      val d =  cases ++ (defaultCase match {case Some(c) => List(c) case None => List()}) 
      space + "switch (" + cond + ") {\n" + d.foldRight("")((s, c) => s + "\n" + c) + space + "}"
    }
    case c@CaseStmt(expr, body) => { 
      c.default match {
        case true => space + "default :\n" + body
        case false => space + "case " + expr + " :\n" + body
      }
    }
    case BreakStmt(breakLabel) => space + "break " + breakLabel
    case ContinueStmt(continueLabel) => space + "continue " + continueLabel
    case DoWhileStmt(cond, body) => space + "do\n" + body + "while (" + cond + ")\n" 
    case WhileStmt(cond, body) =>  space + "while (" + cond + ")\n" + body  
    case ForStmt(init, cond, increment, body) => { 
      val c = cond match { case Some(x)=>x.toString case None => "" }
      val i = increment match { case Some(x)=>x.toString case None => "" }
      space + "for (" + init + "; " + c + "; " + i + ")\n" + body
    }
    case ForInStmt(init, expr, body) => space + "for (" + init + " in " + expr + ")" + body
    case LabeledStmt(label, body) => label.foldRight("")((e,c) => space + e + ":\n" + c) + body 
    case _ => ""
  }
  
  def toString(stmts: List[Statement]) = stmts.foldRight("")((s, c) =>  
    (s match { 
      case WhileStmt(_,_) => s+"\n"
      case DoWhileStmt(_,_) => s+"\n"
      case ForStmt(_,_,_,_) => s+"\n"
      case ForInStmt(_,_,_) => s+"\n"
      case FunctionDecl(_,_) => s+"\n"
      case IfStmt(_,_,_) => s+"\n"
      case SwitchStmt(_,_,_) => s+"\n" 
      case EmptyStmt() => ""
      case _ =>  s + ";\n"  
    }) + c
  )
  

  def buildGraph: Unit =   
  
  def toDotGraph = "" 
}

case class Script(stmts : List[Statement]) extends  Statement
case class BlockStmt(stmts : List[Statement]) extends Statement
case class VarDeclListStmt(decls : List[Statement]) extends Statement
case class EmptyStmt() extends Statement
case class ExprStmt(expr : Expression) extends Statement()
case class VarDeclStmt(name : IntroduceVar, expr : Expression) extends Statement
case class FunctionDecl(name : IntroduceVar, fun : Expression) extends Statement
case class ReturnStmt(expr : Expression) extends Statement
case class IfStmt(cond : Expression, thenPart : Statement, elsePart : Statement) extends Statement
case class SwitchStmt(cond : Expression, cases : List[CaseStmt], defaultCase : Option[CaseStmt]) extends Statement
case class CaseStmt(expr : Expression, body : Statement) extends Statement { var default = false }
case class BreakStmt(breakLabel : String) extends Statement
case class ContinueStmt(continueLabel : String) extends Statement
case class DoWhileStmt(cond : Expression, body : Statement) extends Statement
case class WhileStmt(cond : Expression, body : Statement) extends Statement
case class ForStmt(init : ForInit, cond : Option[Expression], increment : Option[Expression], body : Statement) extends Statement
case class ForInStmt(init : ForInInit, expr : Expression, body : Statement) extends Statement
case class LabeledStmt(label : List[String], stmt : Statement) extends Statement
case class TryStmt(body : Statement, catchClause : List[CatchStmt], finalCatch : Option[Statement]) extends Statement
case class CatchStmt(name : IntroduceVar, body : Statement) extends Statement
case class ThrowStmt(expr : Expression) extends Statement
