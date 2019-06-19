
public class Results {
	private String studentName;
	private int physicsMark;
	private int chemMark;
	private int bioMark;
	private int totalMark;
	private double percentage;
	
	public  Results() {
		this.studentName="Student";
		this.physicsMark=0;
		this.chemMark=0;
		this.bioMark=0;
		this.totalMark=0;
		this.percentage=0;
	}
	
	public Results(String studentName, int physicsMark, int chemMark, int bioMark) {
		this.studentName=studentName;
		this.physicsMark=physicsMark;
		this.chemMark=chemMark;
		this.bioMark=bioMark;
		this.totalMark=physicsMark+chemMark+bioMark;
		this.percentage= 100*(double)totalMark/450.0;
		
	}
	
	public String displayResult() {

		return String.format("%4$s\nTotal Mark: %5$d\nPhysics: %1$s\nBiology: %2$s\nChemistry: %3$s", this.physicsMark, this.chemMark, this.bioMark, this.studentName, this.totalMark);
	}
	
	public String totalPercent() {
		
		if(percentage<60 || physicsMark<90 || chemMark<90 || bioMark<90)
			return "Overall percentage: "+Double.toString(this.percentage)+"% FAIL";
			
		else
			return "Overall percentage: "+Double.toString(this.percentage)+"%";
	}
	
	
		

	
}
