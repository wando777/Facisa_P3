package aula2603;

import java.util.ArrayList;
import java.util.List;

public class Teachers {
	
	private char id;
	private String name;
	private int phNo;
	private String address;
	
	private List<TestPaper> exams = new ArrayList<TestPaper>();
	
	public void prepareReportCards() {
		//TODO
	}
	
	public void markAttendance() {
		//TODO
	}
	
	public void checkPapers() {
		//TODO
	}
	
	public void delareResults() {
		//TODO
	}
	
	public void prepareTestPaper(TestPaper newExam) {
		exams.add(newExam);
	}
	
}
