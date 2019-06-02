import java.util.ArrayList;
import java.util.Collections;

public class Runner {

	public static void main(String[] args) {
		// Create a list with the numbers 0 - 10 in it
		ArrayList<Integer> myList = list(10);
		System.out.println(myList);
		// Create a method that looks through a list of numbers and checks for a
		// specific number
		System.out.println(matching(1, myList));
		// Create a method that goes through a list of numbers and sums the
		// values
		System.out.println(sums(myList));

		// Create a method that removes all ODD values from a list of Numbers.

		System.out.println(remove(myList));

		// Create a method that takes a list of Numbers and sort them into an
		// incremental order
		//System.out.println(ordered(myList));
	}

	public static ArrayList<Integer> list(int range) {
		ArrayList<Integer> listcheck = new ArrayList<Integer>();
		for (int i = 0; i <= range; i++) {
			listcheck.add(i);
		}
		return listcheck;
	}

	public static boolean matching(int input1, ArrayList<Integer> nums) {

		return nums.contains(input1);

	}

	public static int sums(ArrayList<Integer> yes) {
		// for num in yes and sum all the values

		int counter = 0;
		for (int i : yes) {
			counter += i;
		}
		return counter;

	}

	public static ArrayList<Integer> remove(ArrayList<Integer> nope) {
		for (int i = 0; i < nope.size(); i++) {
			if (nope.get(i) % 2 != 0) {
				nope.remove(i);

			}

		}
		return nope;
	}

	public static ArrayList<Integer> ordered(ArrayList<Integer> whatever) {
		return Collections.sort(whatever, Integer::compare);
		// return Collections.sort(whatever);
	}
}
