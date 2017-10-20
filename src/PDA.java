import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class PDA {
	
	//Make a User Input
	//	1: Prompt user to input string (Done)
	//		a) Have the input loop and perform the PDA
	
	//PDA: Does this scan/pop/push 
	//	1: Scan the object by with each input
	//		a) Check for the appropriate alphabet
	//			i) If the input is in the alphabet, continue to pop/push
	//			ii) If NOT, then go to fail statement
	//	2: Make a stack that pops and push
	//		a) if "0" pop nothing, then push in a symbol "$"
	//		b) if "1" pop "$", then push nothing
	//		c) if NOT in the alphabet then go to "Reject Statement" 
	//			i) Check the stack if it is empty
	//				1) If empty then return "Accept Statement"
	//				2) If not empty return "Reject Statement"

	public static void main(String[] args) throws IOException {
		class Stack{
			int topOfStack = 0;
			char stack2[] = new char[100];
			
			//push 
			void push(char a){
				a = 0;
				stack2[topOfStack] = '$';
				System.out.print("\npush empty for 0");
				System.out.print("\tStack=>");	
				for(int i = topOfStack; i >= 0; i--){
					System.out.print(" " + stack2[i]);
				}
				topOfStack++;
			}
			
			//pop
			void pop(char b){
				b = 1;
				topOfStack--;
				System.out.print("\npop $ for 1");
				System.out.print("\tStack=>");
				for(int i = topOfStack - 1; i >= 0; i--){
					System.out.print(" " + stack2[i]);
					
				}		
			}
			
			
			void check (int n){
				int count = 0;
				for(int j = 0; j < 100; j++){
					if(stack2[j] == '0');
					count++;
				}
				if(count == (n/2)){
					System.out.print("\n\nThe string is accepted");
				}else{
					System.out.println("\n\nThe string is NOT accepted");
				}
			}
		}
		
		DataInputStream inputScan = new DataInputStream(System.in);
		System.out.println("Input a string: ");
		String input = inputScan.readLine();
		int skip = 0;
		
		char arrayOfInputs [] = input.toCharArray();
		
		Stack stack1 = new Stack();
		
		for (int i = 0; i < input.length(); i++){
			if (arrayOfInputs[i] == '0'){
				stack1.push(arrayOfInputs[i]);
			}else if(skip > 0){
				stack1.pop(arrayOfInputs[i]);
			}else{
				skip++;
				System.out.println("Skip");
			}
		}

	}
	
	
}
