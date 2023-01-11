package Ex;

import java.util.Scanner;

public class Select2 {
	
	Scanner scan = new Scanner(System.in);
	
	public void Sel2() {
		System.out.print("어디로 변경하시겠습니까? ");
		Travel.arrival = scan.next();
		System.out.println("목적지를 "+Travel.arrival+"로 변경하였습니다.");
	}

}
