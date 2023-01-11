package Ex;

import java.util.Scanner;

public class InfoGender {

	Scanner scan = new Scanner(System.in);
	Travel travel = new Travel();
	public void gender() {		
		for (int i = 0; i < travel.group.length; i++) {
			System.out.print((i + 1) + ". 성별 : ");
			travel.group[i].setGander(scan.next());
		}
	}
}
