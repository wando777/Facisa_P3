package aula2603;

public class Class {

	private char id;
	private String name;
	private Divisions division;

	public Class(char id, String name, Divisions division) {
		this.id = id;
		this.name = name;
		this.division = division;
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

	public Divisions getDivision() {
		return division;
	}

	public void setDivision(Divisions division) {
		this.division = division;
	}

	public String displayClass() {
		return "Class [id=" + id + ", name=" + name + ", division=" + division + "]";
	}

}
