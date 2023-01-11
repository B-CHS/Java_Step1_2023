package Ex;

public class Travel {

	Var[] group;
	static String arrival;
	
	public Travel() {
	}
	public Travel(int num) {
		arrival = "발리";
		group = new Var[num];
		for (int i = 0; i < group.length; i++) {
			group[i] = new Var();
		}
	}

}
