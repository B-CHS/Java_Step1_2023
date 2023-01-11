package chapter07;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p = new Person();
		System.out.println(p.name="김유신");
		System.out.println(p.height=180f);
		System.out.println(p.weight=80f);
		
		Person p2 = new Person("강감찬");
		System.out.println(p2.name);
		System.out.println(p2.height=175f);
		System.out.println(p2.weight=75f);
		
		Person p3 = new Person("이순신",170, 70);
		System.out.println(p3.name);
		System.out.println(p3.height);
		System.out.println(p3.weight);
	}

}
