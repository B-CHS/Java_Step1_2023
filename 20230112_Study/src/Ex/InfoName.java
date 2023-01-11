package Ex;

import java.util.Scanner;

public class InfoName {

	Scanner scan = new Scanner(System.in);
	Travel travel = new Travel();
	public void name() {
		for (int i = 0; i < travel.group.length; i++) {
			System.out.print((i + 1) + ". 이름 : ");
			travel.group[i].setName(scan.next());
		}
	}
}
