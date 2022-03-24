package addressbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AddressBookMain {
	/**
	 * 1. giving a path of csv file
	 * 2.created method to to read csv file
	 * 3.Scanning the file path
	 * 4.creating a loop to pop out every string values
	 * 
	 */

	public static void main(String[] args) {

		/**
		 * 1. giving a path of csv file
		 */
		readCSVfileUsingScanner(
				"C:\\Users\\shard\\eclipse-workspace\\Advance java\\StreamAPI\\StreamAPIDay21\\src\\Book2.csv");
	}

	/*
	 * 2.created method to to read csv file
	 */
	public static void readCSVfileUsingScanner(String filePath) {
		/*
		 * try catch block to check file exists or not
		 */
		try {
			/*
			 * 3.Scanning the file path
			 */
			Scanner sc = new Scanner(new File(filePath));

			/*
			 * 4.creating a loop to pop out every string values
			 */
			while (sc.hasNext()) {
				System.out.println("User data  :" + sc.next().toString());
			}
			sc.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

}
