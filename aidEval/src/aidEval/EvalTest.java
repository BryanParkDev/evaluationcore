package aidEval;

//Test Class For Grades

public class EvalTest {
	
	public static void main(String[] args) {
		
		//TODO: DB-> Grade Array (JSON, OR DIRECT PASS)
		//temp grade array
		int[] gradeArray = {2,3,3,1,1};
		
		User user1 = new User(gradeArray);
		user1.showGrades();
		user1.showFinalGrade();
		
		user1.processTest();
	}
}
