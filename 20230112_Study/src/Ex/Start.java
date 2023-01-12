package Ex;

public class Start {

	Num num = new Num();
	static int a;
	Travel travel = new Travel();
	Select select = new Select();
	public void S() {
		a = num.Member();
		Travel travel = new Travel(a);
		select.Sel();
	}
	
}
