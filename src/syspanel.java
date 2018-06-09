import java.util.*;
import java.util.Scanner;
import java.io.Console;

public class syspanel {

	public static void main(String[] args)  {

		Date date = new Date();
	    System.out.println(date.toString());	
	    System.out.println("Bienvenido al syspanel                                  username=aa  password=aa");	

	    Scanner scanner = new Scanner(System.in);

        int count = 0;
        int logedin = 0;
        while (count < 3) {
    	    
    	    System.out.print("Username: ");            //  prompt for the user's name
    	    String username = scanner.next();          // get their input as a String
    	    System.out.print("Password: ");            // prompt for their password
    	    String password = scanner.next();             // get their input as a String

    	    if (username.equals("aa") && password.equals("aa")) {
    	        System.out.println("login ok");
    	        count = 3;
    	        logedin = 1;
    	    } else {
    	        System.out.println("login error");
    	    }
            count++;
        }	    
        if (logedin == 1) {
        	System.out.println("you are loged in");
        }else {
        	System.out.println("you are NOT loged in");
        	
        }
        

	}
	

}






//String[] maplecito;
// maplecito = new String[6];

//int[] maplecito;




