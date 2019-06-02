import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class quests {

	public static void main(String[] args) {
		//Create a list with the numbers 0 - 10 in it
		ArrayList<Integer> tenList= new ArrayList<Integer>();
		Countto10(tenList);
		System.out.println(tenList);
		check(tenList, 0);
		System.out.println(check(tenList,0));
		ArrayList<String> stringList = new ArrayList<String>();
		question3(stringList);
		System.out.println(stringList);
		System.out.println(question3b(stringList, "Bert"));
		System.out.println(tenList);



		
		}
		
		public static void Countto10(ArrayList<Integer> tenList) {
		
		for (int i=0; i<11; i++) {
			tenList.add(i);
			
		}	

	}
		//- Create a method that looks through a list of numbers and checks for a specific number

		public static boolean check(ArrayList<Integer> tenList, int i) {
			if (tenList.contains(i)){
			}
			 return true;
		}

		//Create a method that looks through a list of numbers and checks for a specific number
//- As above but with Strings
		
		public static void question3(ArrayList<String> stringList) {
			for (int i = 0; i < 11; i++) {
				stringList.add("Num" + i);}
		}
		public static boolean question3b(ArrayList<String> stringList, String input) {
			return stringList.contains(input);}
		
		// Create a method that multiples each number divisble by 5 by 10 in a list of numbers
		
		public static List<Integer> divi(ArrayList<Integer> tenList) 
		{
					return tenList.stream().map(i -> i *= (i % 5 == 0) ? 10 : 1).collect(Collectors.toList());

		}
		
		
//		Create a method that checks for a specific word in a list of Strings and returns the
//
//		number of times that word occurs.
//		
//		public static int question6(ArrayList<String> stringList, String input) {
//			return (int) stringList.stream().filter(s->s.equals(input).count());
//		}
		
		
}


		

