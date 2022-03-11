package week3;

public class CodingAssignment {

	public static void main(String[] args) {

		// Create an array of int called ages that contains the following values: 3, 9,
		// 23, 64, 2, 8, 28, 93.
		int[] ages = new int[8];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;

		// Programmatically subtract the value of the first element in the array from
		// the value in the last element of the array. Print the result to the console
		int lastMinusFirst = ages[ages.length - 1] - ages[0];
		System.out.println(lastMinusFirst);

		// Add a new age to your array and repeat the step above to ensure it is dynamic
		int[] ages2 = new int[9];
		ages2[0] = 3;
		ages2[1] = 9;
		ages2[2] = 23;
		ages2[3] = 64;
		ages2[4] = 2;
		ages2[5] = 8;
		ages2[6] = 28;
		ages2[7] = 93;
		ages2[8] = 103;

		int lastMinusFirst2 = ages2[ages2.length - 1] - ages2[0];
		System.out.println(lastMinusFirst2);

		// Use a loop to iterate through the array and calculate the average age. Print
		// the result to the console.
		double sum = 0;
		for (int i = 0; i < ages.length; i++) {
			sum = sum + ages[i];
		}
		double average = sum / ages.length;
		System.out.println("Average age is " + average);

		// Create an array of String called names that contains the following values:
		// “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";

		// Use a loop to iterate through the array and calculate the average number of
		// letters per name
		double letters = 0;
		for (int i = 0; i < names.length; i++) {
			letters = letters + names[i].length();
		}
		double lettersAverage = letters / names.length;
		System.out.printf("\nAverage number of letters per name is %.2f\n", lettersAverage);
		// Use a loop to iterate through the array again and concatenate all the names
		// together, separated by spaces, and print the result to the console
		String allNames = "";
		for (String name : names) {
			allNames += name + " ";
		}
		System.out.println(allNames);

		// How do you access the last element of any array?
		// How do you access the first element of any array?
		System.out.println(
				"\nAccess last element is arrayName[arrayName.length - 1] for example " + names[names.length - 1]);
		System.out.println("Access first element is (arrayName[0]) for example " + names[0]);

		// Create a new array of int called nameLengths. Write a loop to iterate over
		// the previously created names array and add the length of each name to the
		// nameLengths array.
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
			System.out.print(nameLengths[i] + " ");
		}
		// Write a loop to iterate over the nameLengths array and calculate the sum of
		// all the elements in the array. Print the result to the console.
		int totalLetters = 0;
		for (int i : nameLengths) {
			totalLetters += nameLengths[i];
		}
		System.out.println("\n" + totalLetters);

		// Proofs for methods start here
		System.out.println("Hello concatenated 3 times: " + method1("Hello", 3));
		System.out.println("Fullname " + method2("John", "Doe"));
		System.out.println("The sum of ages2 > 100: " + method3(ages2));
		double[] dArray = { 25, 28, 98, 1.5, 6 };
		double[] dArray2 = { 10, 2, 5.5, 12 };
		System.out.println("The average of dArray is " + method4(dArray));
		System.out.println("The average of dArray is greater than the average of dArray2: " + method5(dArray, dArray2));
		boolean hotOutside = true;
		double pocketMoney = 11.25;
		System.out.println("Will I buy a Drink?: " + willBuyDrink(hotOutside, pocketMoney));
		
		double moneyInSavings = 8500.89;
		int paidTimeOff = 48;
		int[] avgTemp = { 78, 85, 64, 72, 83, 66, 69};
		double costOfGas = 3.29;
		System.out.println("Is it a good time to take a vacation?\n" + vacationVariables(moneyInSavings, paidTimeOff, avgTemp, costOfGas));
		
	}

	// Write a method that takes a String, word, and an int, n, as arguments and
	// returns the word concatenated to itself n number of times. (i.e. if I pass in
	// “Hello” and 3, I would expect the method to return “HelloHelloHello”).
	public static String method1(String word, int n) {
		String words = "";
		for (int i = 0; i < n; i++) {
			words += word;
		}
		return words;
	}

	// Write a method that takes two Strings, firstName and lastName, and returns a
	// full name (the full name should be the first and the last name as a String
	// separated by a space).
	public static String method2(String firstName, String lastName) {
		return firstName + " " + lastName;
	}

	// Write a method that takes an array of int and returns true if the sum of all
	// the ints in the array is greater than 100.
	public static boolean method3(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		if (sum > 0) {
			return true;
		} else {
			return false;
		}
	}

	// Write a method that takes an array of double and returns the average of all
	// the elements in the array.
	public static double method4(double[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum / array.length;
	}

	// Write a method that takes two arrays of double and returns true if the
	// average of the elements in the first array is greater than the average of the
	// elements in the second array.
	public static boolean method5(double[] array, double[] array2) {
		int sum = 0;
		int sum2 = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		for (int x = 0; x < array2.length; x++) {
			sum2 += array2[x];
		}
		if (sum > sum2) {
			return true;
		} else {
			return false;
		}
	}

	// Write a method called willBuyDrink that takes a boolean isHotOutside, and a
	// double moneyInPocket, and returns true if it is hot outside and if
	// moneyInPocket is greater than 10.50.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside = false || moneyInPocket <= 10.50) {
			return false;
		} else {
			return true;
		}
	}
	// Create a method of your own that solves a problem. In comments, write what
	// the method does and why you created it.
	public static String vacationVariables(double savings, int pto, int[] temps, double gasPrice) {
		double sumOfTemps = 0;
		for (int i = 0; i < temps.length; i++) {
			sumOfTemps += temps[i];
		}
		double avgTemp = sumOfTemps / temps.length;
		
		if (savings > 5000 && pto >= 40 && avgTemp >= 68 && gasPrice < 3.50) {
			return "It is a good time to take a vacation!";
		} else { 
			return "Its not a good time to take a vacation :(";
		}
	}

}
