package chapter06.TeamMember;

public class Teamgroup {

	private TeamMember[] member = new TeamMember[6];

	public void init() {
		member[0] = new TeamMember("조현수", "남자");
		member[1] = new TeamMember("신진혁", "남자");
		member[2] = new TeamMember("정하영", "남자");
		member[3] = new TeamMember("이진학", "남자");
		member[4] = new TeamMember("신화진", "여자");
		member[5] = new TeamMember("윤혜경", "여자");
	}

	// 출력 메소드
	public void Disp() {
		System.out.println("팀원 명단");
		for (int i = 0; i < member.length; i++) {
			System.out.println("이름 : " + member[i].getname() + " | 성별 : " + member[i].getGender());
		}
	}
}
