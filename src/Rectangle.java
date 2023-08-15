import java.util.Scanner;

public class Rectangle {
	
	public static void main(String[] args) {
		
		int a,b;
		int area = 0;
		int perimeter = 0;
		//System.out.println("Enter length: ");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		
//		System.out.println("Enter breadth: ");
//		Scanner b_in = new Scanner(System.in);
//		b = b_in.nextInt();
		
		area = findArea(a,b);
		perimeter = findPerimeter(a,b);
		
		System.out.println(area +" " +perimeter);
		
		
		
	}

	public static int findArea(int a,int b) {
		int area=0;
		if(a>=1 & b<=100) {
		 area= a*b;
		}
		return area;
		
		
	}
	
	public static int findPerimeter(int a,int b) {
		int perimeter=0;
		if(a>=1 & b<=100) {
		perimeter = 2*(a+b);
		}
		return perimeter;
		
	}
}
