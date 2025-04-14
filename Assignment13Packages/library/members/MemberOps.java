package library.members;

import java.util.ArrayList;
import java.util.List;

public class MemberOps {
	
	List<Member> memberList = new ArrayList<>();
	
	public void addMember(Member member) {
		memberList.add(member);
	}
	
	public void displayMembers() {
		for(Member mem:memberList) {
			System.out.println(mem);
		}
	}

}
