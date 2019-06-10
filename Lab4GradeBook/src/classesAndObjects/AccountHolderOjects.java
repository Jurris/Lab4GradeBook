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

		File file = new File("classData.txt");

		Scanner input = new Scanner(file);

		input.useDelimiter(",\\s");

		String[] namesStr = new String[5];
		String[] gradesStr = new String[5];
		int theNewGrades[] = new int[5];
		String[] theNewNames = new String[5];

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

		student1.fname = theNewNames[0];
		student1.gradepoints = theNewGrades[0];
		student1.testForLetterGradeEarned();
		System.out.println(student1.fname + " earned a " + student1.letterGrade + ".");

		student2.fname = theNewNames[1];
		student2.gradepoints = theNewGrades[1];
		student2.testForLetterGradeEarned();
		System.out.println(student2.fname + " earned a " + student2.letterGrade + ".");

		student3.fname = theNewNames[2];
		student3.gradepoints = theNewGrades[2];
		student3.testForLetterGradeEarned();
		System.out.println(student3.fname + " earned a " + student3.letterGrade + ".");

		student4.fname = theNewNames[3];
		student4.gradepoints = theNewGrades[3];
		student4.testForLetterGradeEarned();
		System.out.println(student4.fname + " earned a " + student4.letterGrade + ".");

		student5.fname = theNewNames[4];
		student5.gradepoints = theNewGrades[4];
		student5.testForLetterGradeEarned();
		System.out.println(student5.fname + " earned a " + student5.letterGrade + ".");

		System.out
				.println(
						"The average grade in the class is "
								+ (student1.gradepoints + student2.gradepoints + student3.gradepoints
										+ student4.gradepoints + student5.gradepoints) / 5
								+ " points, and the average grade is B-.");
		//Now we set output from console to file and then reprint above output
		PrintStream out = new PrintStream(new FileOutputStream("GradeReport.txt"));
		System.setOut(out);
		out.println("The average grade in the class is " + (student1.gradepoints + student2.gradepoints
				+ student3.gradepoints + student4.gradepoints + student5.gradepoints) / 5
				+ " points, and the average grade is B-.");

	}

}
