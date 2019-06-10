package classesAndObjects;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class AccountHolderOjects {

	public static void main(String[] args) throws Exception, NumberFormatException, IOException {

		AccountHolder student1 = new AccountHolder();
		AccountHolder student2 = new AccountHolder();
		AccountHolder student3 = new AccountHolder();
		AccountHolder student4 = new AccountHolder();
		AccountHolder student5 = new AccountHolder();

		String[] namesStr = new String[5];
		String[] gradesStr = new String[5];
		int theNewGrades[] = new int[5];
		String[] theNewNames = new String[5];

		File file = new File("classData.txt");
		Scanner input = new Scanner(file);
		input.useDelimiter(",\\s");
  
		
		for (int i = 0; i < namesStr.length; i++) {
			namesStr[i] = input.next();
		}
		for (int i = 0; i < gradesStr.length; i++) {
			gradesStr[i] = input.next();
		}
		for (int i = 0; i < gradesStr.length; i++) {
			theNewNames[i] = (namesStr[i]);
		}
		try {
			for (int i = 0; i < gradesStr.length; i++) {
				theNewGrades[i] = Integer.parseInt(gradesStr[i]);
			}
		} catch (NumberFormatException nfe) {
			System.out.println("NumberFormatException: " + nfe.getMessage());
		}

		input.close();

		AccountHolder[] students = { student1, student2, student3, student4, student5 };

		for (int i = 0; i < students.length; i++) {
			students[i].fname = theNewNames[i];
			students[i].gradepoints = theNewGrades[i];

		}

		for (AccountHolder s : students) {
			s.testForLetterGradeEarned();
			System.out.println(
					s.fname + " earned " + s.gradepoints + ", resulting with the letter grade " + s.letterGrade + ".");
		}
		int largest = theNewGrades[0];
		for (int i = 0; i < theNewGrades.length; i++) {
			if (theNewGrades[i] > largest) {
				largest = theNewGrades[i];
			}
		}

		for (AccountHolder s : students) {
			if (s.gradepoints == largest) {
				System.out.println(s.fname + " earned the hightest grade in class: " + s.letterGrade);
			}
		}
		// Print conclusion
		System.out
				.println(
						"The average grade in the class is "
								+ (student1.gradepoints + student2.gradepoints + student3.gradepoints
										+ student4.gradepoints + student5.gradepoints) / 5
								+ " points, and the average grade is B-.");

		// Now we set output to .txt
		// Set output to the newly created PrintStream variable out
		PrintStream out = new PrintStream(new FileOutputStream("GradeReport.txt"));
		System.setOut(out);

		// Iterate through the final output
		for (AccountHolder s : students) {
			System.out.println(
					s.fname + " earned " + s.gradepoints + ", resulting with the letter grade " + s.letterGrade + ".");
		}

		// Print conclusion to .txt
		out.println("The average grade in the class is "
				+ (student1.gradepoints + student2.gradepoints + student3.gradepoints + student4.gradepoints
						+ student5.gradepoints) / 5
				+ " points, and the average grade is B-.");
		for (AccountHolder s : students) {
			if (s.gradepoints == largest) {
				System.out.println(s.fname + " earned the highest grade in class: " + s.letterGrade);
			}
		}

	}

}
