package aula2603;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


public class Students {

	private List<TestPaper> exams = new Vector<TestPaper>();
	private ArrayList<aula2603.Class> classes = new ArrayList<aula2603.Class>();
	
	
	public void writeExam(TestPaper newExam) {
		exams.add(newExam);
	}
	
	public void getEnrolled(Class newClass) {
		classes.add(newClass);
	}
	
	public void FillAdmissionForm() {
		//TODO Para implementar
	}
	
}
