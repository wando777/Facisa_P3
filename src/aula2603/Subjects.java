package aula2603;

import java.util.Set;

public class Subjects {

	private char id;
	private String name;
	private int classId;

	public Subjects(char id, String name, int classId) {
		this.id = id;
		this.name = name;
		this.classId = classId;
	}

	public char getId() {
		return id;
	}

	public void setId(char id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String displaySubjects() {
		return "Subjects [id=" + id + ", name=" + name + ", classId=" + classId + "]";
	}

	
}
