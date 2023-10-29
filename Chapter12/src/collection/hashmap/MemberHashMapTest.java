package collection.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLee = new Member(102,"이순신");
		Member memberKim = new Member(101,"김유신");
		Member memberShin = new Member(103,"신사임당");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberShin);
		
//		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(101);
		memberHashMap.showAllMember();
		
	}

}
