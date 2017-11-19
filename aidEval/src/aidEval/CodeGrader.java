package aidEval;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeGrader extends JsonCodeParser{
	
	//TODO: GET TEACHER's CODE AND GET THAT INFO
	public void processTeacherCodeInfo() {
		
	}
	
	public void init() {
		processJson();
		gradeLoc();
		
	}
	
	public void gradeLoc() {
		String string = "\n";
		Pattern pattern = Pattern.compile("([gG])"); //case insensitive, use [g] for only lower
		Matcher matcher = pattern.matcher(string);
		int locCount = 0;
		while (matcher.find()) locCount++;
		
		System.out.println(locCount);
		
	}
	
	public void gradeSim() {}
	public void gradeAcc() {}
	public void gradeSc() {}
	public void gradeTc() {}
	
}
