package aidEval;

import java.util.HashMap;
import java.util.Map;

public interface EvalInterface {

	//Map for mapping Grade(A,B,C) and Integers(1,2,3)
	Map<Integer, String> gradeTable = new HashMap<Integer,String>();
	
	//methods
	public void init();
	public void matchMap();
	public String[] gradesToArray();
	// test
	//public void simulate();

	
}
