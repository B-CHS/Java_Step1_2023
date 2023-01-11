package chapter06.TeamMember;

public class Main {

	public static void main(String[] args) {


		Teamgroup team = new Teamgroup();
		TeamMember t = new TeamMember();
		
		//메소드를 통해서 팀명을 초기화
		t.setTeamName("A");
		System.out.println("팀명 : "+t.getTeamName());
		
		team.init();
		team.Disp();

		System.out.println();
		t.setmPhone("01068628695");
		
		
	}

}
