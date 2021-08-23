package applet;

import java.applet.Applet;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class RunApplet {
	/**
	* Main function for the Applet Runner - Loads and Initializes the Applet class
	* @param args
	*/
	public static void main(String[] args )
	{
	Applet appletClass = new Tes(); // Create a new Instance of our derived Applet class
	
	JFrame frame = new JFrame(); // Create a new Instance of the JFrame class
	frame.setLayout(new GridLayout(1, 1)); // Choose a Gridlayout
	frame.add(appletClass ); // Add the Applet instance
	   frame.setSize(600,400); // // Set the initial Frame size
	
	
	// Call applet methods
	appletClass .init(); // Initialize the applet
	appletClass .start(); // Start the appllet
	
	frame.setVisible(true); // Set the frame to be visible and Show the applet
	}

}




