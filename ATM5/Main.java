package ATM5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String []arg) {

		ArrayList<Infocient>Infoclient=new ArrayList();
		Infoclient.add(new Infocient("Burhan","Badawi","Zarqa","Main account","Male",2001, 0, 0, 0, 0));
		Infoclient.add(new Infocient("Tawfiq","Morrar","Amman","Tawfiq account","Male",1999, 0, 0, 0, 0));
		Infoclient.add(new Infocient("Feras","Ma3ita","Zarqa","Feras account","Male",1996, 0, 0, 0, 0));
		
		
		//Program start
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the name you want to search: ");
	        String searchName = scanner.nextLine();

	        boolean found = false;
	        Infocient client = null;

	        for (Infocient c : Infoclient) {
	            if (c.getFirst_name().equals(searchName)) {
	                client = c;
	                found = true;
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("There are no clients with the name: " + searchName);
	        } else {
	            
	            int maxAttempts = 3;
	            int searchPassword;
	            boolean correctPassword = false;

	            for (int attempts = 0; attempts < maxAttempts; attempts++) {
	                System.out.print("Enter the password: ");
	                searchPassword = scanner.nextInt();

	                if (client.getPassword() == searchPassword) {
	                    correctPassword = true;
	                    System.out.println("Password is correct.");
	                    break;
	                } else {
	                    System.out.println("Incorrect password. Try again. Remaining attempts: " + (maxAttempts - attempts - 1));
	                }
	            }

	            if (!correctPassword) {
	                System.out.println("Incorrect password. Maximum attempts exceeded. Call support.");
	            }
	        }

	        scanner.close();
	    }
	}