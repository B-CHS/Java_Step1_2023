package chapter07;

public class KoreanMain {

	public static void main(String[] args) {
		
		Korean k1 = new Korean("박자바", "010-9999-2222");
		System.out.println("name : "+k1.name);
		System.out.println("name : "+k1.nation);
		
		Korean k2 = new Korean("박바", "010-9299-2223");
		System.out.println("name : "+k2.name);
		System.out.println("name : "+k2.nation);
				

	}

}
