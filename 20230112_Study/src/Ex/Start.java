package Ex;

public class Start {

	Num num = new Num();
	Travel travel = new Travel();
	Select select = new Select();
	public void S() {
		int a = num.Member();
		Travel travel = new Travel(a);
		select.Sel();
	}
	
}
