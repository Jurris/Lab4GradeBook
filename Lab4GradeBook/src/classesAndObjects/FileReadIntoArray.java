package classesAndObjects;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileReadIntoArray {
	double[] theNewGrades;
	String[] theNewNames;

	public static void main(String[] args) throws Exception, NumberFormatException, IOException {

		File file = new File("classData.txt");

		Scanner input = new Scanner(file);
		input.useDelimiter(",\\s");

		String[] names = new String[5];
		String[] numberString = new String[5];
		int theNewGrades[] = new int[5];
		String[] theNewNames = new String[5];

		for (int i = 0; i < names.length; i++) {
			names[i] = input.next();
		}

		System.out.println(Arrays.toString(names));
		// System.out.println(names[3] + " is the Test Name.");

		for (int i = 0; i < numberString.length; i++) {
			numberString[i] = input.next();
		}
		for (int i = 0; i < numberString.length; i++) {
			theNewNames[i] = (names[i]);
		}
		try {

			for (int i = 0; i < numberString.length; i++) {
				theNewGrades[i] = Integer.parseInt(numberString[i]);
			}
		} catch (NumberFormatException nfe) {
			System.out.println("NumberFormatException: " + nfe.getMessage());
		}
		for (int i = 0; i < numberString.length; i++) {
			System.out.println(theNewGrades[i]);
		}

		System.out.println(theNewGrades[4] + "," + theNewGrades[4]);
		System.out.println(theNewNames[4] + theNewNames[4]);

		// System.out.println(Arrays.toString(numberString));
		input.close();

		// getNameArray(theNewNames);

		// getGradeArray(theNewGrades);

	}

	//public String[] getNameArray() {
	//	return theNewNames;
	//}

	// public double[] getGradeArray() {
//		return theNewGrades.clone();
	// }

	//
	//

}
