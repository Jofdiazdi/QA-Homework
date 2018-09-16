

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class Test1 {

	@Test
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
