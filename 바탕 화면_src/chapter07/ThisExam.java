package chapter07;

public class ThisExam {

	int day;
	int month;
	int year;

	public ThisExam() {

	}

	public ThisExam(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void printThis() {
		System.out.println(this);

	}

	// ----------------------------------------------------------------------
	public static void main(String[] args) {
		ThisExam b = new ThisExam(27, 12, 2022);
		b.printThis();
		System.out.println("생년월일 : " + b.year + "년 " + b.month + "월 " + b.day + "일");
		System.out.println("------------------------------------------------------");
		ThisExam b2 = new ThisExam(27, 12, 2022);
		b2.printThis();
		b2.setYear(2023);
		b2.setMonth(06);
		b2.setDay(27);
		System.out.println("생년월일 : " + b2.year + "년 " + b2.month + "월 " + b2.day + "일");
	}
	
	

}
