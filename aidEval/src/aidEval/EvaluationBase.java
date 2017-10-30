package aidEval;



/* <<Instructions & Sequential steps>>
* match grades (Map it with hash map)
* render the grades into the Weighted Model (GD)
* get each scores of the components
* compute the final product by Weighted Model
* return the result in figures (Double in this case)
*/


public class EvaluationBase {

	//number of grade components
	final int GRADE_NUM = 5;
	
	//TODO:parsed JSON data object form the python code
	//Map<String, String> parsed = new HashMap<String,String>();
	//TODO:DATABASE Connection or RPC Handle

	// Five Elements of Evaluation
	//Values must be 1,2 or 3
	public int accuracy=1;
	public int similarity=1;
	public int loc=1;
	public int timeComplexity=1;
	public int spaceComplexity=1;
	
	/*weights of each elements (Fuzzy)
	 * default setting is :
	 * acc = 0.4 , sim = 0.3, loc,tc,sc = 0.1 each
	 */
	public double w_acc = 0.4;
	public double w_sim = 0.3;
	public double w_loc = 0.1;
	public double w_tc = 0.1;
	public double w_sc = 0.1;
	
	//TODO: IF JSON data, page data received,
	//Method should be added to manipulate weight ratio.
	
	//final grade of the user (Overall Rating)
	public double finalGradeNum;
	public String finalGradeStr;
	
	//get Element's Value
	public int getAccuracy() {return accuracy;}
	public int getSimilarity() {return similarity;}
	public int getLoc() {return loc;}
	public int getTimeComplexity() {return timeComplexity;}
	public int getSpaceComplexity() {return spaceComplexity;}
	
	//set Element's value;
	public void setAccuracy(int input) {this.accuracy = input;}
	public void setSimilarity(int input) {this.similarity = input;}
	public void setLoc(int input) {this.loc = input;}
	public void setTimeComplexity(int input) {this.timeComplexity = input;}
	public void setSpaceComplexity(int input) {this.spaceComplexity = input;}
	
	public void setWeights(double acc, double sim, double loc, double tc, double sc) {
		this.w_acc = acc;
		this.w_sim = sim;
		this.w_loc = loc;
		this.w_tc = tc;
		this.w_sc = sc;
	}
	
	//set Element's values at once
	public void setAllElements(int acc, int sim, int loc, int tc, int sc) {
		this.accuracy = acc;
		this.similarity = sim;
		this.loc = loc;
		this.timeComplexity = tc;
		this.spaceComplexity = sc;
	}
	
	//set Elements by array
	public void setAllElements(int[] arr) {
		this.accuracy = arr[0];
		this.similarity = arr[1];
		this.loc = arr[2];
		this.timeComplexity = arr[3];
		this.spaceComplexity = arr[4];
	}
}
 