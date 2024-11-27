package com.org.restapidemo;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Swingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         A a=new A();
	}

}
class A extends JFrame{
	A(){
		setLayout(new FlowLayout());
		JLabel a=new JLabel("hello supriya");
		JLabel a1=new JLabel("hello jaga");
		add(a);
		add(a1);
		setVisible(true);
		setSize(400, 600);
	}
}
