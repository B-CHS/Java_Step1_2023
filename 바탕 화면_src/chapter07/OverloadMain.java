package chapter07;

public class OverloadMain {

	public static void main(String[] args) {
		
		Overlaod o = new Overlaod();		
		o.Disp();
		System.out.println("---------------------------");
		Overlaod o2 = new Overlaod(20, 180.8f);
		o2.Disp();
		System.out.println("---------------------------");
		Overlaod o3 = new Overlaod(25, 170.8f, "김");
		o3.Disp();
		System.out.println("---------------------------");
		
		

	}

}
