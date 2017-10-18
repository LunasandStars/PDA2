import javax.swing.JFrame;	//Basic windows features

class jFrameExample2 {
	public static void main(String[] args){
		
		jFrameExample test1 = new jFrameExample();
		test1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	//How the program will exit the window
		test1.setSize(500,500);
		test1.setVisible(true);
		
	}
}
