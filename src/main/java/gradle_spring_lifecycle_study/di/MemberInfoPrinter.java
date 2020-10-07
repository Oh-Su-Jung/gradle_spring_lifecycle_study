package gradle_spring_lifecycle_study.di;

import org.springframework.stereotype.Component;

@Component
public class MemberInfoPrinter {
	private MemberDao memDao;
	private MemberPrinter printer;
	
	public void printMemberInfo(String email) {
		Member member = memDao.selectByEmail(email);
		if (member == null) {
			System.out.println("데이터 없음");
			return;
		}
		printer.print(member);
		System.out.println();
	}

	public void setMemDao(MemberDao memDao) {
		this.memDao = memDao;
	}

	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}
}
