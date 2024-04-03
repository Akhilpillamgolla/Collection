package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueClass {

	public static void main(String[] args) {

		Queue<Integer> Q = new PriorityQueue<>();
		System.out.println(Q.peek()); // Retrive's but don't remove First Element

		//   System.out.println(Q.element());     //throw exception if no element

		for (int i = 20; i <= 100; i++) {
			Q.offer(i);    //offer is a method that help in inserting values in Queue
		}
		System.out.println(Q);   // Sorting is done 
		
		System.out.println(Q.poll()); //Removes the head of element & return null if empty
		
		System.out.println(Q.remove()); //similar to poll but throws Exception if empty
	
		System.out.println(Q); // If order is messed [Deletion of elements] then we will not have sorting 
	}

}
