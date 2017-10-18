import javax.swing.JOptionPane;
import javax.swing.JFrame;


//Applies jFrameExample
class guiInterface {

	public static void main(String[] args) {
		
		jFrameExample bucky = new jFrameExample();
		bucky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Want to exit the program
		bucky.setSize(350, 100);  //Window Size
		bucky.setVisible(true);   
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~
		//GUI is a graphic user interface
		
		//Set two variables
		//String firstnum = JOptionPane.showInputDialog("Enter the first number: ");
		//String secondnum = JOptionPane.showInputDialog("Enter second number: ");
		
		//Convert the numbers to integers
		//int num1 = Integer.parseInt(firstnum);
		//int num2 = Integer.parseInt(secondnum);
		
		//int sum = num1 + num2;
		
		//Show the message of the dialog
		//JOptionPane.showMessageDialog(null, "The answer is " + sum, "Answer", JOptionPane.PLAIN_MESSAGE);
		//~~~~~~~~~~~~~~~~~~~~~~~~
		
	}

}
