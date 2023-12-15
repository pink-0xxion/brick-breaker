package brickBreaker;

import javax.swing.JFrame;

public class Main {
	public static void main(String args[]) {
		JFrame obj=new JFrame();
		Gameplay gamePlay=new Gameplay();
		obj.setBounds(10,10,697,600);
		obj.setTitle("Breakout Ball");
		obj.setVisible(true);
		//obj.setResizable(false);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);
	}
	

}
