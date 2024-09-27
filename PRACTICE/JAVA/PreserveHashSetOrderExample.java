import java.util.LinkedHashSet; 
import java.util.Set; 

public class PreserveHashSetOrderExample { 

	public static void main(String[] args) 
	{ 

		Set<Integer> setNumbers 
			= new LinkedHashSet<Integer>(); 

		setNumbers.add(1); 
		setNumbers.add(13); 
		setNumbers.add(2); 
		setNumbers.add(4); 
		setNumbers.add(4); 

		for (Integer number : setNumbers) { 
			System.out.println(number); 
		} 
	} 
}