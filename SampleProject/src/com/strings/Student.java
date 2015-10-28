package strings;
/**
 * Class Name: Student
 * Description: Java class for Student Object
 */
public class Student {
	private int studentId;
	private String studentName;

	// Creating constructor
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
	}

	// Overriding hashCode method
	public int hashCode() {
		int result = 0;
		result = 31*result+studentId;
		result = 31*result+(studentName != null? studentName.hashCode():0);
		return result;
	}

	// Overriding equals method
	public boolean equals(Object obj) {
	
		if(this == obj){
			return true;
		}
		if(obj == null || (this.getClass()!=obj.getClass())){
			return false;
		}
		Student temp = (Student)obj;
		//Checking individual element in the Student object with this object
		boolean equalsFlag = (this.studentId == temp.studentId)&&(this.studentName!=null&&studentName.equals(temp.studentName));
		return equalsFlag;
	}

	// Creating getter and setter
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
