package Ex;

import java.util.Scanner;

public class Select {

	Scanner scan = new Scanner(System.in);
	Num num = new Num();
	InfoGender gender = new InfoGender();
	InfoName name = new InfoName();
	Select1 sel1 = new Select1();
	Select2 sel2 = new Select2();

	public void Sel() {
		name.name();
		gender.gender();
		int number = num.Member();
		while (true) {
			if (number == 1)
				sel1.Sel1();
			else if (number == 2)
				sel2.Sel2();
			else if (number == 3) {
				System.out.println("종료");
				break;
			}else
				System.out.println("잘못입력하셨습니다.");
		}

	}

}
