import java.util.Scanner;

public class SLE {
	
	public static void main(String[] args) {
		int a,b;
		
		
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		if(a>=-1000 && b <=1000) {
			
			if(a>b) {
				System.out.println("a > b");
				
			}
			else if(a<b) {
				System.out.println("a < b");
				
			}
			else if(a==b) {
				System.out.println("a == b");
				
			}

		}
		
		
	}
	
	

}
