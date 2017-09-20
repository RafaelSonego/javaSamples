package dataStructures.vector;

import java.util.Arrays;

public class Vector {
	private Student[] studentsArray = new Student[100];
	private int totalOfStudents = 0;

	private void validadeSizeArray() {
		if (studentsArray.length == totalOfStudents) {
			Student[] newStudentArray = new Student[studentsArray.length * 2];
			for (int i = 0; i < studentsArray.length; i++) {
				newStudentArray[i] = studentsArray[i];
			}
			this.studentsArray = newStudentArray;
		}
	}

	public void add(Student student) {
		validadeSizeArray();
		this.studentsArray[totalOfStudents] = student;
		totalOfStudents++;
	}

	private boolean validIndex(int index) {
		return index >= 0 && index <= totalOfStudents;
	}

	public void add(int index, Student student) {
		validadeSizeArray();
		if (!validIndex(index)) {
			throw new IllegalArgumentException("index");
		}

		for (int i = totalOfStudents - 1; i >= index; i--) {
			studentsArray[i + 1] = studentsArray[i];
		}
		studentsArray[index] = student;
		totalOfStudents++;
	}

	private boolean indexBusy(int index) {
		return index >= 0 && index < totalOfStudents;
	}

	public Student get(int index) {
		if (!indexBusy(index)) {
			throw new IllegalArgumentException("Invalid Index");
		}
		return studentsArray[index];
	}

	public void remove(int index) {
		if (!indexBusy(index)) {
			throw new IllegalArgumentException("Invalid Index");
		}

		for (int i = index; i < totalOfStudents; i++) {
			studentsArray[i] = studentsArray[i + 1];
		}
	}

	public boolean contains(Student student) {
		for (int i = 0; i < totalOfStudents; i++) {
			if (student.equals(studentsArray[i])) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		return totalOfStudents;
	}

	public String toString() {
		return Arrays.toString(studentsArray);
	}

}
