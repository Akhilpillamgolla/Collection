package sortInCollection;

import java.util.TreeMap;


public class SortUsingTreeMapLamda {

	public static void main(String[] args) {
		
		TreeMap <Integer,String> tr = new TreeMap<>();
		tr.put(100,"Akhil");
		tr.put(200,"Babu");
		tr.put(300,"Pillamgolla");
		tr.put(400,"JAVA");
		tr.put(500,"Developer");
		
		System.out.println(tr);
		
		TreeMap <Integer,String> trr = new TreeMap<>((I1,I2)->(I1>I2)?-1:(I1<I2)?+1:0);
		trr.put(100,"Akhil");
		trr.put(200,"Babu");
		trr.put(300,"Pillamgolla");
		trr.put(400,"JAVA");
		trr.put(500,"Developer");
		System.out.println(trr);
		
		

		
	}
	
	
}
