package collection.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member memberLee = new Member(102,"이순신");
		Member memberKim = new Member(101,"김유신");
		Member memberShin = new Member(103,"신사임당");
		
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberKim);
		memberTreeMap.addMember(memberShin);
		
		memberTreeMap.showAllMember();
		//정렬이 되는데, 왜그러냐면 Integer객체가 이미 Comparator가 asc로 구현이 되어있음
	/*	memberTreeMap.removeMember(101);
		memberTreeMap.showAllMember();
		*/
	}

}
