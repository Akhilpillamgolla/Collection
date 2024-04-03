package sortInCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SortingStream {

	public static void main(String[] args) {

		ArrayList<Integer> ar = new ArrayList<>();
		
		ar.add(42);
		ar.add(92);
		ar.add(33);
		ar.add(77);
		ar.add(12);
		ar.add(77);
	

		System.out.println("All Elements are :" + ar);

		Set<Integer> l = ar.stream().sorted().collect(Collectors.toSet());

		System.out.println("Acending Order Sort" + l);

	}
}
