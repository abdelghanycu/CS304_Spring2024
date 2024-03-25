package com.sci.cs304spring2024.lab2;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Factorial extends JFrame implements ActionListener {

  private JTextField nTextField = new JTextField();
  private JTextField factorialTextField = new JTextField();
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private JButton nextButton = new JButton();

  public Factorial() {
    this.getContentPane().setLayout(null);

    nTextField.setBounds(new Rectangle(85, 55, 65, 25));
    factorialTextField.setBounds(new Rectangle(245, 55, 70, 25));

    jLabel1.setText("n");
    jLabel1.setBounds(new Rectangle(25, 55, 40, 25));

    jLabel2.setText("factorial");
    jLabel2.setBounds(new Rectangle(175, 55, 50, 20));

    nextButton.setText("Next");
    nextButton.setBounds(new Rectangle(345, 55, 85, 25));
    nextButton.addActionListener(this);

    add(jLabel2, null);
    add(jLabel1, null);
    add(factorialTextField, null);
    add(nTextField, null);
    add(nextButton, null);

    // set initial value
    nTextField.setText("1");
    factorialTextField.setText("1");

    setSize(new Dimension(460, 170));
    setTitle("Counter Application");
    setLocationRelativeTo(this);
    setVisible(true);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println("here");
  }
}
