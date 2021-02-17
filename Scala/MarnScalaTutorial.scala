// Note: The following code is based off of Derek Banas's Scala Tutorial. Part of this material is my own while the rest
// is derived directly from his work found here: https://www.youtube.com/watch?v=DzFt0YkZo8M

// File should end with scala extension or .scala

// First. begin by importing library functions
import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

// In Scala, it will detect what type of data type your variable is based on input
// Much like java, variables in Scala can be changed, but rather than using protected or final variables
// like in Java, scala simply uses val, such as:

var myName = "Nick" // this CAN changed
val myBirthday = "December 17th, 1993" // This CANNOT be changed. 

// Data Types in Scala!

// Byte: -128 to 127
// Boolean: true or false
// Char: unsigned max value of 65535
// Short: -32768 to 32767
// Int: -2147483648 to 2147483647
// Long: you get the gist
// Double: Functions the same as Java and MIPS

// As we can see, using the double forward slash allows for comments in the Scala language. 
/* Similarly, one can use the forward slash star to do multiline commenting, similar to the way JavaDocs are produced
I can still type here because the comment line is still open
and I can close with this! */

// Here is an example of how we can use Scala to hold very large ints.

var bignum = BigInt("8675309867530986753098675309")


