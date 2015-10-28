package strings;

/**
 * Class Name: HashCodeEqualsImpl
 * Description : Program to implement hashCode() and equals() method
 */
public class HashCodeEqualsImpl {
	public static void main(String[] args) {

		//Creating student object
		Student std1 = new Student(1, "Anu");
		Student std2 = new Student(1, "Anu");
		
		Student std3 = new Student(2, "Ravi");
		
		System.out.println("Checking equals method : ");
		System.out.println("Std1 equals std2 :"+std1.equals(std2));
		System.out.println("Std1 equals std3 :"+std1.equals(std3));
		
		System.out.println("Checking hashcode method:");
		System.out.println("Hashcode of std1: "+ std1.hashCode());
		System.out.println("Hashcode of std2: "+ std2.hashCode());
		System.out.println("Hashcode of std3: "+ std3.hashCode());


		
		
	}

}
