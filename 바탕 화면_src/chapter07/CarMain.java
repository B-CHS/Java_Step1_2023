package chapter07;

public class CarMain {

	public static void main(String[] args) {
		
		Car a = new Car();
		//생성자를 통하여 초기화
		Car b = new Car("보라", 1000);
		System.out.println(b.getColor()+" "+b.getCc());
		
		//맴버변수 이용하여 하나씩 초기화
		a.cc = 2000;
		a.color = "파랑";
		System.out.println(a.getColor()+" "+a.getCc());
		
		System.out.println("------------------------------------------------");
		
		//메소드를 이용한 출력
		System.out.println(a.getColor()+" "+a.getCc());
	}

}
