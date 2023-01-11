package Ex;

public class Select1 {

	Travel travel = new Travel();
	public void Sel1() {
		for(int i = 0; i < travel.group.length; i++) {
		System.out.println((i+1)+". 이름 : "+travel.group[i].getName());
		System.out.println((i+1)+". 성별 : "+travel.group[i].getGander());
		System.out.println((i+1)+". 목적지 : "+Travel.arrival);
		}
	}
}
