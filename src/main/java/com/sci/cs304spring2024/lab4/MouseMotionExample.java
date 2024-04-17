package com.sci.cs304spring2024.lab4;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class MouseMotionExample extends JFrame implements MouseListener, MouseMotionListener {

  private final JLabel coordinatesLabel;

  public MouseMotionExample() {

    setLayout(new FlowLayout());

    coordinatesLabel = new JLabel("");
    add(coordinatesLabel);

    // Add both mouse listener and mouse motion listener to the frame
    addMouseListener(this);
    addMouseMotionListener(this);

    setTitle("Mouse Motion Example");
    setSize(400, 400);
    setLocationRelativeTo(this);
    setVisible(true);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
  }

  // MouseListener methods
  @Override
  public void mouseClicked(MouseEvent e) {
    // Handle mouse click event
    int x = e.getX();
    int y = e.getY();
    coordinatesLabel.setText("Mouse clicked at: (" + x + ", " + y + ")");
  }

  @Override
  public void mousePressed(MouseEvent e) {
    // Handle mouse button press event
  }

  @Override
  public void mouseReleased(MouseEvent e) {
    // Handle mouse button release event
  }

  @Override
  public void mouseEntered(MouseEvent e) {
    // Handle mouse enter event
  }

  @Override
  public void mouseExited(MouseEvent e) {
    // Handle mouse exit event
  }

  @Override
  public void mouseDragged(MouseEvent e) {
    // Update the coordinates label with the current mouse position during dragging
    int x = e.getX();
    int y = e.getY();
    coordinatesLabel.setText("Mouse Dragged at: (" + x + ", " + y + ")");
  }

  @Override
  public void mouseMoved(MouseEvent e) {
    // Update the coordinates label with the current mouse position during movement
    int x = e.getX();
    int y = e.getY();
    coordinatesLabel.setText("Mouse Moved at: (" + x + ", " + y + ")");
  }

  public static void main(String[] args) {
    new MouseMotionExample();
  }
}
