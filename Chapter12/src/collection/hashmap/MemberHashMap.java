package collection.hashmap;

import java.util.TreeMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {
	
	private TreeMap<Integer, Member> treeMap;
	
	public MemberHashMap() {
		treeMap = new TreeMap<Integer, Member>();
	};
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	};
	
	public boolean removeMember(int memberId) {
		
		if(treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		};
		System.out.println(memberId + "가 존재하지 않습니다. ");
		return false;
	};
	
	public void showAllMember() {
	Iterator<Integer> ir = treeMap.keySet().iterator();
	
		while(ir.hasNext()){
			int key = ir.next();
			
			Member member = treeMap.get(key);
			System.out.println(member);
			};
	};

}
