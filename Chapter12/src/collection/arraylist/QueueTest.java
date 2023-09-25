package collection.arraylist;

import java.util.ArrayList;

public class QueueTest {
	
	class MyQueue{
		
		private ArrayList<String> arrayQueue = new ArrayList<String>();
		
		public void enQueue(String data) {
			arrayQueue.add(data);
		}
		
		public String deQueue() {
			int len = arrayQueue.size();
			
			if(len==0) {
				System.out.println("Queue가 비었습니다.");
				return null;
			}
			return arrayQueue.remove(0);
		}
		
	};

	public static void main(String[] args) {

	}

}
