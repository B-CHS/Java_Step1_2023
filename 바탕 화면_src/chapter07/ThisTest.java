package chapter07;

public class ThisTest {

	private int Speed;
	private int Age;
	private String RobotName;
	private String RobotNumber;

	public ThisTest() {
	}

	public ThisTest(int speed, int age, String robotName, String robotNumber) {
		super();
		Speed = speed;
		Age = age;
		RobotName = robotName;
		RobotNumber = robotNumber;
	}

	public void Move() {
		Speed += 20;
		System.out.println("RobotSpeed : " + Speed);
	}

	public void Stop() {
		Speed = 0;
		System.out.println("RobotSpeed : " + Speed);
	}

	public void Age() {
		Age++;
		System.out.println("RobotAge : " + Age);
	}
	
	public void RName() {
		System.out.println("RobotName : " + RobotName);
	}

	public int getSpeed() {
		return Speed;
	}

	public int getAge() {
		return Age;
	}

	public String getRobotName() {
		return RobotName;
	}

	public String getRobotNumber() {
		return RobotNumber;
	}

	

}
