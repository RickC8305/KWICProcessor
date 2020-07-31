package applet;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import se4352.rsgaxqrxc.edu.Main;
public class Tes extends java.applet.Applet implements ActionListener
{
	Button button1, button2;
	Label outputlbl;
	TextField inputfld;
	
    public void init() 
    {
        
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        add(new Label("Search Item     :"));
        inputfld = new TextField(50);
        add(inputfld);
        
        outputlbl = new Label("Search Result");
        
        add(outputlbl);

         button1 = new Button("Search");
        add(button1);
        button2 = new Button("Exit");
        add(button2);
        button1.addActionListener(this);
        button2.addActionListener(this);
     }
    
    public void actionPerformed (ActionEvent e)
    {
    	if(e.getSource() ==button1)
    	{
    		System.out.println("Button 1 was pressed");
    		String data = Main.search(inputfld.getText());
    		System.out.println(data);
    	}
    	else {
    		System.exit(0);
    	}
    }
}