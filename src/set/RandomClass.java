package set;
import java.util.*;

public class RandomClass {

	public static void main(String[] args) {
		Random obj = new Random(); //random will have seed value for generation of random value
		
	   int rdm = 	obj.nextInt();    // NEXT INT - next token of the input data
	   System.out.println("Random number without fixed Range : " +rdm);

	   int rdm2 = obj.nextInt(100);   //The values here are having Fixed Range like 100 as mentioned
	   System.out.println("Random number + Fixed value Range : " +rdm2);
	   
	   
}
}
 