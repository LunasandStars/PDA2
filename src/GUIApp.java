import java.awt.*;
import javax.swing.*;

//Shows me how to add images
public class GUIApp extends JFrame{
	private JLabel label;
	private ImageIcon image;
	
	public GUIApp(){
		
		setLayout(new FlowLayout());
		image = new ImageIcon(getClass().getResource("DFA.jpg"));
		label = new JLabel(image);
		add(label);
		
		//Adding User Interface Option
		//JOptionPane.
		String promptuser = JOptionPane.showInputDialog("Enter in a string: ");
				
		//Show the message of what the user typed
		JOptionPane.showConfirmDialog(null, promptuser);
		
	}
	
	public static boolean isInVocab(char x) {
		if(vocab.indexOf(x) == -1){
		return false;
		}
		return true;
	}
	
	public static String vocab = "01";
	
	public static void main (String[] arg){
		
		GUIApp a = new GUIApp();
		a.setTitle("Window with image");
		a.setVisible(true);
		
		//a.pack(); //fit within the window
		a.setSize(650, 400);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String input = "0011";
		for (int i = 0; i < input.length(); i++) {
			if (!isInVocab(input.charAt(i))){
				System.out.println("invalid char: " + input.charAt(i));
			}
		}
		
	}

}
