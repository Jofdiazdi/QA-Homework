

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

/*
Feature: Sort of students
	The students should be sorted by their CGPA, in case of equal CGPA they should
	be sorted by name alphabeticaly, and in case of they have equal names they
	should be sorted by ID, ID's are never equal to another.
*/

class Test1 {

	@Test
	/*
	Scenario: I want to sort the students according to their CGPA in decreasing order
		Given I have a list of students
		And they have ID, name and CGPA
		When I sort them by CGPA
		Then I should have a list of students order by their CGPA decreasingly
	*/
	void NormalSortTest() {
		//Set up
		List<Student> experimentalResult;
		Student s1 = new Student(33, "Rumpa", 3.68);
		Student s2 = new Student(85, "Ashis", 3.85);
		Student s3 = new Student(56, "Samiha", 3.75);
		Student s4 = new Student(19, "Samara", 3.98);
		Student s5 = new Student(22, "Fahim", 3.76);
		List<Student> input = Arrays.asList(s1,s2,s3,s4,s5);
		List<Student> spectedResult = Arrays.asList(s4,s2,s5,s3,s1);

		//arrange
		experimentalResult = Solution.SortStudents(input);

		//assert
		assertEquals(spectedResult,experimentalResult);

	}
	@Test
	/*
	Scenario: I want to sort the students according to their CGPA ,in decreasing order, and alphabetical order by name
	 	Given I have a list of students
		And they have ID, name and CGPA
		When I sort them by CGPA
		And if they have the same CGPA, alphabeticaly by name
		Then I should have a list of students order by their CGPA decreasingly
		And alphabetical order by name
	*/
	void EqualCgpaSortTest() {
		//Set up
		List<Student> experimentalResult;
		Student s1 = new Student(33, "Rumpa", 3.68);
		Student s2 = new Student(85, "Ashis", 3.85);
		Student s3 = new Student(56, "Samiha", 3.75);
		Student s4 = new Student(19, "Samara", 3.75);
		Student s5 = new Student(22, "Fahim", 3.76);
		List<Student> input = Arrays.asList(s1,s2,s3,s4,s5);
		List<Student> spectedResult = Arrays.asList(s2,s5,s4,s3,s1);

		//arrange
		experimentalResult = Solution.SortStudents(input);

		//assert
		assertEquals(spectedResult,experimentalResult);

	}
	@Test
	/*
	Scenario: I want to sort the students according to their CGPA, decreasingly, by name, alphabeticaly and by ID in increasing order
		Given I have a list of students
		And they have ID, name, and CGPA
		When I sort them by CGPA
		And if they have the same CGPA, alphabeticaly by name
		And if they have the same name, in increasing order by ID
		Then I should have a list of students order by their CGPA decreasingly
		And alphabetical order by name
		And in increasing order by ID
	*/
	void EqualNameSortTest() {
		//Set up
		List<Student> experimentalResult;
		Student s1 = new Student(33, "Rumpa", 3.68);
		Student s2 = new Student(85, "Ashis", 3.85);
		Student s3 = new Student(56, "Samara", 3.75);
		Student s4 = new Student(19, "Samara", 3.75);
		Student s5 = new Student(22, "Fahim", 3.76);
		List<Student> input = Arrays.asList(s1,s2,s3,s4,s5);
		List<Student> spectedResult = Arrays.asList(s2,s5,s4,s3,s1);

		//arrange
		experimentalResult = Solution.SortStudents(input);

		//assert
		assertEquals(spectedResult,experimentalResult);

	}

}
