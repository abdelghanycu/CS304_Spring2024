package com.sci.cs304spring2024.lab1;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Counter extends JFrame implements ActionListener {

  private JButton counterButton = new JButton();
  private JLabel jLabel1 = new JLabel();
  private JTextField counterTextField = new JTextField();

  public Counter() {

    setLayout(null);

    counterButton.setText("Counter");
    counterButton.setBounds(new Rectangle(210, 65, 80, 30));
    counterButton.addActionListener(this);

    jLabel1.setText("Counter");
    jLabel1.setBounds(new Rectangle(65, 20, 85, 30));

    counterTextField.setBounds(new Rectangle(60, 65, 100, 30));

    this.add(counterTextField, null);
    this.add(jLabel1, null);
    this.add(counterButton, null);

    setTitle("Counter Application");
    this.setSize(new Dimension(326, 170));
    setLocationRelativeTo(this);
    setVisible(true);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
  }
}
