package com.sci.cs304spring2024.lab5;

import com.sun.opengl.util.Animator;
import java.awt.BorderLayout;
import javax.media.opengl.GLCanvas;
import javax.swing.JFrame;

public class BallApp extends JFrame {

  private Animator animator;
  private GLCanvas glcanvas;
  private BallGLEventListener listener = new BallGLEventListener();

  public static void main(String[] args) {
    new BallApp().animator.start();
  }

  public BallApp() {
    super("Ball Application");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    glcanvas = new GLCanvas();
    glcanvas.addGLEventListener(listener);
    animator = new Animator(glcanvas);

    add(glcanvas, BorderLayout.CENTER);
    setSize(700, 700);
    setLocationRelativeTo(this);
    setVisible(true);
  }
}
