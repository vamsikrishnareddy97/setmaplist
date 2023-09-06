package exception;

public class ExceptionHandlingExa {
	
	    public static void main(String[] args) {
	        try {
	            
	            int result = divide(10, 0);
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	           
	            System.err.println("Error: Division by zero is not allowed.");
	        } finally {
	           
	            System.out.println("Finally block executed.");
	        }

	        
	        System.out.println("Program continues...");
	    }

	    
	    public static int divide(int dividend, int divisor) {
	        return dividend / divisor;
	    }
	}



