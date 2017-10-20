import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class userInputListener {
	
	JTextField userInput = new JTextField("");
	
	public class txtInputListener implements ActionListener
	{
	    public void actionPerformed(ActionEvent event)
	    {
	        String input = userInput.getText();   //receive input from text field
	        System.out.println(input);
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}

}
