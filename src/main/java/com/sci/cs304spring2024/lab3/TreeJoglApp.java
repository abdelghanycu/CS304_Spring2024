package com.sci.cs304spring2024.lab3;

import java.awt.BorderLayout;
import javax.media.opengl.GLCanvas;
import javax.swing.JFrame;

public class TreeJoglApp extends JFrame {

  public static void main(String[] args) {
    new TreeJoglApp();
  }

  public TreeJoglApp() {
    super("Tree Application");

    GLCanvas glcanvas = new GLCanvas();
    glcanvas.addGLEventListener(new TreeGLEventListener());
    add(glcanvas, BorderLayout.CENTER);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(900, 900);
    setLocationRelativeTo(this);
    setVisible(true);
  }
}
