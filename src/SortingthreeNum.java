import java.util.Scanner;

public class SortingthreeNum {
	public static void main(String[] args) {
		
		int a=0,b=0,c=0;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a>=0 && b >=0 && c >=0 && a<=10000 && b<=10000 &&c <=10000) {
			int max = Math.max(a, Math.max(b, c));
			int min = Math.min(a, Math.min(b, c));
			int mid = a + b + c - max - min;
			System.out.println( min+" "+  mid+" "+ max);
	}
	}

}
