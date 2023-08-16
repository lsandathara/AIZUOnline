import java.util.Scanner;

public class Range {
	
	public static void main(String[] args) {
		
		int a,b,c;
		
		
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		if(a>=0 && b >=0 && c >=0 && a<=100 && b<=100 &&c <=100) {
			
			if(a < b && a <c && b<c && b >a && c >a && c>b) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}

}
