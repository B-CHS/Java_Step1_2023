package Ex;

import java.util.Scanner;

public class Num {

	Scanner scan = new Scanner(System.in);
	
	public int Member() {
		System.out.print("관광객 수 : ");
		int num = scan.nextInt();
		return num;		
	}
}
