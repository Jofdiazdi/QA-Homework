import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

class ComparatorStudents implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		if(student1.getCgpa()<student2.getCgpa()) {
			return 1;
		}else if(student1.getCgpa()>student2.getCgpa()) {
			return -1;
		}else {
			int isEqual = student1.getFname().compareTo(student2.getFname());
			if( isEqual == 0) {
				if(student1.getId()<student2.getId()) {
					return -1;
				}else {
					return 1;
				}
			}else {
				return isEqual;
			}
		}
	}
	
}

//Complete the code
public class Solution
{
	public Scanner in;
	public int testCases;
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
		
		List<Student> result = SortStudents(studentList);
		
		for(Student st: result){
			System.out.println(st.getFname());
		}
      
      	
	}

	public static  List<Student> SortStudents(List<Student> studentList) {
		List<Student> result = studentList;
		Collections.sort(result, new ComparatorStudents());
		return result;
	}
}
