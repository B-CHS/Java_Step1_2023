package chapter07;

import javax.swing.JOptionPane;

public class ThisTestMain {

	public static void main(String[] args) {

		ThisTest R1 = new ThisTest();
		R1.Move();
		R1.Move();
		System.out.println("-----------------------");
		R1.Age();
		System.out.println("-----------------------");

		int R_Speed = Integer.parseInt(JOptionPane.showInputDialog("로봇 속도"));
		int R_Age = Integer.parseInt(JOptionPane.showInputDialog("로봇 나이"));
		String R_Name = JOptionPane.showInputDialog("로봇 이름");
		String R_Number = JOptionPane.showInputDialog("로봇 번호");

		ThisTest R2 = new ThisTest(R_Speed, R_Age, R_Name, R_Number);
		int Speed = R2.getSpeed();
		System.out.println("속도 : "+R2.getSpeed());
		System.out.println("나이 : "+R2.getAge());
		System.out.println("이름 : "+R2.getRobotName());
		System.out.println("번호 : "+R2.getRobotNumber());
		
		
		R2.Stop();

	}

}
