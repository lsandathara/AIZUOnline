import java.io.*;
import java.util.Scanner;

public class Cubic {
	
	public static void main(String[] args) {
		int input;
		int output;
		
		Scanner in = new Scanner(System.in);
		input = in.nextInt();
		
		output = findCubicVal(input);
		System.out.println(output);
		
	}
	
	public static int findCubicVal(int input) {
		int output = 0;
		if(input <=100 & input >=1) {
		output = input*input*input;
		
		}
		else {
			System.out.println("Error with input number");
		}
		
		return output;
		
	}

}
