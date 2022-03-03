// Created by Nicholas Marn, with help from Oracle Docs
// https://docs.oracle.com/javase/tutorial/uiswing/components/menu.html
// Copyleft, all wrongs reserved. 


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Display {
  public static void main (String[] args) {
    System.out.println("Check!");
  JFrame display = new JFrame ("clock");
  display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  JLabel emptyLabel = new JLabel ("");
  emptyLabel.setPreferredSize(new Dimension (200, 200));
  display.getContentPane().add(emptyLabel, BorderLayout.CENTER);
  JMenuBar menubar = new JMenuBar();
  JMenu menu1 = new JMenu("Marn Clock Menu");
  JMenu menu2 = new JMenu("Adjust TIme zone");
  JMenuItem info = new JMenuItem("About");
  menubar.add(menu1);
  menubar.add(menu2);
  menu1.add(info);
  
  display.setJMenuBar(menubar);
  display.pack();
  display.setVisible(true);
  }
  
  
}

