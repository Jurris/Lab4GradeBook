package classesAndObjects;

public class AccountHolder {

	String fname;
	int gradepoints;
	String letterGrade;
	boolean letterA;
	boolean letterAPlus;
	boolean letterAMinus;
	boolean letterB;
	boolean letterBPlus;
	boolean letterBMinus;
	boolean letterC;
	boolean letterCPlus;
	boolean letterCminus;
	boolean letterD;
	boolean letterDPlus;
	boolean letterDMinus;
	boolean letterF;

	public void testForLetterGradeEarned() {

		if (gradepoints >= 388) {
			letterAPlus = true;
			letterGrade = "A+";
			// System.out.println("A+");
		} else if (gradepoints >= 372) {
			letterA = true;
			letterGrade = "A";
			// System.out.println("A");
		} else if (gradepoints >= 360) {
			letterAMinus = true;
			letterGrade = "A-";
			// System.out.println("A-");
		} else if (gradepoints >= 340) {
			letterBPlus = true;
			letterGrade = "B+";
			// System.out.println("B+");
		} else if (gradepoints >= 336) {
			letterB = true;
			letterGrade = "B";
			// System.out.println("B");
		} else if (gradepoints >= 320) {
			letterBMinus = true;
			letterGrade = "B-";
			// System.out.println("B-");
		} else if (gradepoints >= 308) {
			letterCPlus = true;
			letterGrade = "C+";
			// System.out.println("C+");
		} else if (gradepoints >= 280) {
			letterC = true;
			letterGrade = "C";
			// System.out.println("C");
		} else if (gradepoints >= 268) {
			letterCminus = true;
			letterGrade = "C-";
			// System.out.println("C-");
		} else if (gradepoints >= 252) {
			letterDPlus = true;
			letterGrade = "D+";
			// System.out.println("D+");
		} else if (gradepoints >= 240) {
			letterD = true;
			letterGrade = "D";
			// System.out.println("D");
		} else if (gradepoints >= 0) {
			letterF = true;
			letterGrade = "F";
			// System.out.println("F");

		}

	}
}
