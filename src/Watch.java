import java.util.Scanner;

public class Watch {
	
	public static void main(String[] args) {
		int s = 0;
		int h = 0,m = 0,sec=0;
		
		Scanner sc = new Scanner(System.in);
		s = sc.nextInt();
		if(s>=0 && s<=86400) {
		h = s /3600;
		m= (s % 3600)/60;
		sec= (s % 3600)%60;
		}
		
		System.out.println(h+":"+m+":"+sec);
	}
	

}
