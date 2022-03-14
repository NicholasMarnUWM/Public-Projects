//Exercise based on javatpoint.com, as a demonstration of implementation of original code
//Subsequent implementation of additional code on top is to show competence in Java
// As such, I do not claim ownership of the code taken from javatpoint.com

import java.awt.*;
public class MainAWT extends Frame {
  MainAWT() {
    Button button1 = new Button("Hello!");
    button1.setBounds(30, 100, 80, 30);
    add(button1);
    setSize(400,400);
    setTitle("Nick Marn Implementation AWT Button!");
    setVisible(true);
    setLayout(null);
    
  }
  public static void main(String[] args) {
    MainAWT a = new MainAWT();

  }

}
