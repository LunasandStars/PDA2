import java.awt.FlowLayout;	//Layout managing
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;	//Window features
import javax.swing.JLabel;	//Output text and images in your problem
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

//Shows textFields with strings
public class jFrameExample extends JFrame{	//JFram lets us create a window

		//Build a variable/item
		//private JLabel item1;	//Item we are adding
		private JTextField item1;
		private JTextField item2;
		private JTextField item3;
		private JPasswordField passwordField; //Password 
		
		public jFrameExample(){	 //constructor
			
			//~~~~~~~~~~~~~~~~~~~
			//Title of the window
			super("The Title");
			
			//Set the Layout
			setLayout(new FlowLayout()); //Default Layout
			
			//item1 = new JLabel("This is a sentencew");	//Just text
			item1 = new JTextField(10);
			add(item1);
			
			item2 = new JTextField("Enter the text here: ");
			add(item2);
			
			item3 = new JTextField("Uneditable", 20); //User cannot edit this
			item3.setEditable(false);
			add(item3);
			
			passwordField = new JPasswordField("mypass");
			add(passwordField);
			
			//add functions to your items
			//item1.setToolTipText("This is going to show up on hover");	//The hover label
			
			//add the item to the window
			//add(item1);			
			//~~~~~~~~~~~~~~~~~~~~~
			
			//Add an action listener objects
			thehandler handler = new thehandler(); //build an action listener object
			//Add this object to each of the items
			item1.addActionListener(handler);
			item2.addActionListener(handler);
			item3.addActionListener(handler);
			passwordField.addActionListener(handler);
			//**end of constructor**
		}
		
		//Build another class, the class thats inside inherits the properties of the bigger class
		private class thehandler implements ActionListener{
			//This class will handle the events
			public void actionPerformed(ActionEvent event){
				
				String string = ""; //set to empty
				
				if(event.getSource() == item1){
					string = String.format("field 1: %s", event.getActionCommand());  //get the text from that location		
				}else if(event.getSource() == item2){
					string = String.format("field 2: %s", event.getActionCommand());  //get the text from that location
				}else if(event.getSource() == item3){
					string = String.format("field 3: %s", event.getActionCommand());
				}else if(event.getSource() == passwordField){
					string = String.format("password field is: %s", event.getActionCommand());
				}
				
				//Blank window that shows the message
				JOptionPane.showMessageDialog(null, string);  //(Location/position, variable output you want in the string)
			}
			
		}

}
