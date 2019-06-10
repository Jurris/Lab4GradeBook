package classesAndObjects;

public class AccountHolderOjects {

	public static void main(String[] args) throws Exception {
		AccountHolder john = new AccountHolder();
		AccountHolder hamid = new AccountHolder();
		AccountHolder tracy = new AccountHolder();
		AccountHolder albert = new AccountHolder();
		AccountHolder ana = new AccountHolder();
		FileReadIntoArray names1 = new FileReadIntoArray();
		
		

		john.fname = "John";
		john.gradepoints = 308;
		john.testForLetterGradeEarned();
		System.out.println(john.fname + " earned a " + john.letterGrade + ".");
		
		System.out.println(FileReadIntoArray.class);

		//john.fname = FileReadIntoArray.names[2];
		//john.gradepoints = 308;
		//john.testForLetterGradeEarned();
	//	System.out.println(john.fname + " earned a " + john.letterGrade + ".");

		hamid.fname = "Hamid";
		hamid.gradepoints = 370;
		hamid.testForLetterGradeEarned();
		System.out.println(hamid.fname + " earned a " + hamid.letterGrade + ".");

		tracy.fname = "Tracy";
		tracy.gradepoints = 331;
		tracy.testForLetterGradeEarned();
		System.out.println(tracy.fname + " earned a " + tracy.letterGrade + ".");

		albert.fname = "Albert";
		albert.gradepoints = 336;
		albert.testForLetterGradeEarned();
		System.out.println(albert.fname + " earned a " + albert.letterGrade + ".");

		ana.fname = "Ana";
		ana.gradepoints = 321;
		ana.testForLetterGradeEarned();
		System.out.println(ana.fname + " earned a " + ana.letterGrade + ".");

		System.out.println("The average grade in the class is "
				+ (john.gradepoints + hamid.gradepoints + tracy.gradepoints + albert.gradepoints + ana.gradepoints) / 5
				+ " points, and the average grade is B-.");
		
		
	 /**
		
		
		**/
		

	}

}
