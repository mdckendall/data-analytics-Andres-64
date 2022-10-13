import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.*;
class Main {
	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<String> arrayList = new ArrayList<>();
		FileReader fr = new FileReader("names.txt");
		Scanner fileScanner = new Scanner(fr);
    Scanner input = new Scanner(System.in);
    boolean mainLoop = true;

    int choice;
    while(true){
        System.out.print("Press 1 to learn about salary.\n");
        System.out.print("Press 2 to learn about the job.\n");
        System.out.print("Press 3 to learn about demand.\n");
        System.out.print("Press 4 to view current students.\n");
        System.out.print("Press 5 to quit.\n");

        choice = input.nextInt();

    switch(choice){

    case 1:
        System.out.print("$98,345 average salary in South Florida!");
        break;

    case 2:
        System.out.println("US News - 100 Best Jobs!");
        break;

    case 3:
        System.out.println("Top 10 Forbes In-Demand Jobs!");
        break;

    case 4: 
      System.out.println("Current Students:\n");
        break;

    case 5:
        System.out.println("Quit");
        System.exit(0);
         break;

    default :
             System.out.println("Please Select 1-5");
             break;

    }
    }

	}
}
