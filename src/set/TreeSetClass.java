package set;
import java.util.*;
public class TreeSetClass {

	public static void main(String[] args) {
	Random rdm = new Random();
		
		TreeSet<Integer> set = new TreeSet();
		
		for(int i=1;i<=5;i++) {
			int number = rdm.nextInt(100);
			set.add(number);
			System.out.println(number);
			
		}
	System.out.println("TreeSet is "+ set);  //This stores in same order that we had given
	}
		
	}

