package gradle_spring_lifecycle_study.di;

public class Main {
	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		MemberRegisterService regSvc = new MemberRegisterService();
		ChangePasswordService pwdSvc = new ChangePasswordService();
		pwdSvc.setMemberDao(memberDao);
	}

}
