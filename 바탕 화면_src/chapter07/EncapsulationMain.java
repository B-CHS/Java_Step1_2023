package chapter07;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EncapsulationMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("가로의 길이 : ");
		int a = scan.nextInt();

		System.out.print("세로의 길이 : ");
		int b = scan.nextInt();

		Encapsulation e = new Encapsulation();
		int Area = e.Cal_Area(a, b);
		System.out.println("사각형의 넓이 : " + Area);
		String str = "사각형의 넓이 : "+ Area;
		JOptionPane.showMessageDialog(null, str);

	}

}
