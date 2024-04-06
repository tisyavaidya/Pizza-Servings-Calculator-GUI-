/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pizza;

/**
 *
 * @author tisyavaidya
 */
import java.lang.Math;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Pizza extends JFrame {

    //creating objects
    private Frame frame;
    private JPanel line2= new JPanel();
    
    //creating varaibles
    String size;
    double servings;
    
    //constructor
    Pizza(){
        //initializing frame
        frame=new JFrame();
        
        //exit when closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //JLabel title of the GUI at the center
        JLabel title=new JLabel("Pizza Servings Calculator",SwingConstants.CENTER);
        //red colour for the title
        title.setForeground(Color.red);
        //font and size of the title
        title.setFont(new Font ("Times New Roman", Font.BOLD, 24));
        
        //variable input_txt for the input values
        JLabel input_txt=new JLabel("Enter the size of the pizza in inches: ");
        //adding input_txt to line 2
        line2.add(input_txt);
        //creating object textfield(JTextField) of width 4
        final JTextField textField=new JTextField(4);
        //adding components
        line2.add(textField);
        //calculate button object with the text-"Calculate Servings"
        JButton calculate=new JButton("Calculate Servings");
        //object with no text and at the center
        final JLabel lb=new JLabel("", SwingConstants.CENTER);
        
        //calling addActionListener using the "Calculate Servings" button
        calculate.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                //size of the pizza (textfield value)
                size=textField.getText();
                //parsing it to a double value and calculating the serving size
                servings= Math.pow((Double.parseDouble(size)/8),2);
                ///setting the lb text
                lb.setText("A "+size+" inch pizza will serve "+servings+" people.");
                
            }
        });
        
        //adding components to the frame
        frame.add(title);
        frame.add(line2);
        frame.add(calculate);
        frame.add(lb);
        //grid layout of (4,1)
        frame.setLayout(new GridLayout(4,1));
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //window size
        frame.setSize(350,300);
        //window title
        frame.setTitle("Pizza Servings Calculator");
        //visibility should be true for the window to be visible
        frame.setVisible(true);
              
    }
    
    public static void main(String[] args){
        Pizza pizza=new Pizza();
    }
}
