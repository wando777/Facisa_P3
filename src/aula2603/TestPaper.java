package aula2603;

public class TestPaper {

	private char id;
	private String name;
	private float duaration;
	private int classId;
	
	public TestPaper() {
		//Empty constructor
	}

	public TestPaper(char id, String name, float duaration, int classId) {
		this.id = id;
		this.name = name;
		this.duaration = duaration;
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

	public float getDuaration() {
		return duaration;
	}

	public void setDuaration(float duaration) {
		this.duaration = duaration;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(char classId) {
		this.classId = classId;
	}

}
