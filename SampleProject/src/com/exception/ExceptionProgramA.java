package exception;
/**
 * Class Name: ExceptionProgramA
 * Description: Program that is expected to throw a null pointer exception and 
 * 				in turn handles it using try catch and finally
 */
public class ExceptionProgramA {
/**
 * Description: Using throw keyword creating a NullPointerException
 */
	public static void main(String[] args) {
		//Intentionally creating NullPointerException
		String checkValue = null;
		try{
			if(checkValue == null)
			{
				throw new NullPointerException();
			}	
		}catch(NullPointerException ex){
			
			System.out.println("Null pointer exception in catch block");
		}catch(Exception exp){
			
			System.out.println("General exception "+exp.toString());
		}
		finally{
		
			System.out.println("Now in finally block");
		}
		
	}

}
