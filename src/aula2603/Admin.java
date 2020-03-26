package aula2603;

import java.util.HashSet;

public class Admin {

	private char id;
	private String name;
	private String password;

	private HashSet<Teachers> professoresContratados;
	private HashSet<Students> estudantesMatriculados;
	private HashSet<Subjects> assuntosAdicionados;
	private HashSet<aula2603.Class> disciplinasAdicionadas;
	private HashSet<Divisions> periodos;

	public void login() {
		// TODO Implementação
	}

	public void logout() {
		// TODO Implementação
	}

	public void addNewTeachers(Teachers newTeacher) {
		professoresContratados.add(newTeacher);
	}

	public void modifyTeachers(Teachers newTeacher) {
		// buscar o Teacher em professoresContratados
		// e quando achar, vai trocar (ou seja, apaga
	}

	public void addNewStudent(Students newStudent) {
		estudantesMatriculados.add(newStudent);
	}

	public void modifyStudent(Students newStudent) {
		// TODO
	}

	public void addNewSubject(Subjects newSubject) {
		assuntosAdicionados.add(newSubject);
	}

	public void modifySubject(Subjects newSubject) {
		// TODO
	}

	public void addNewClass(Class newClass) {
		disciplinasAdicionadas.add(newClass);
	}

	public void modifyClass(Class newClass) {
		// TODO
	}

	public void addNewDivision(Divisions newDivision) {
		periodos.add(newDivision);
	}

	public void modifyDivision(Divisions newDivision) {
		// TODO
	}

	@Override
	public String toString() {
		return "Admin [periodos=" + periodos + "]";
	}

}
