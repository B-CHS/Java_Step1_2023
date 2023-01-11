package chapter06.TeamMember;

public class TeamMember {
	
	//맴버변수
	public String teamName;//팀명
	public String mName;//팀장
	public String mPhone;//팀장전화번호
	public String sName;//부팀장
	public String name;//팀원
	public String gender;//팀원성별
	
	public TeamMember() {
		
	}
	
	//생성자 오버로딩(생정자를 통하여 초기화)
	public TeamMember(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	//메소드를 위한 초기화
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmPhone() {
		return mPhone;
	}

	public void setmPhone(String mPhone) {
		this.mPhone = mPhone;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	

	

}
