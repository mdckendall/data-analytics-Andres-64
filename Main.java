import java.util.Scanner;
import java.io.*;
public class Main {

public static void main(String[] args) {
    //MENU
    Scanner input = new Scanner(System.in);
    boolean mainLoop = true;
    File names = null;
    FileReader fr = null;
    BufferedReader br = null;

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
        //Answers
        System.out.print("$98,345 average salary in South Florida!");
        break;

    case 2:
        System.out.println("US News - 100 Best Jobs!");
        break;

    case 3:
        System.out.println("Top 10 Forbes In-Demand Jobs!");
        break;

    case 4: 
        /*Display current Students from names.txt
        //String line;
        //while((line = in.readLine()) != null)
        //{
        //  System.out.println(line);
        //}
        //  in.close();
        //System.out.println("");
        //break;
        //"C:\Users\G\Downloads\names.txt"
        //Scanner fileIn = new Scanner(new File("names.txt"));

        //while (input.hasNextLine())*/
          
            System.out.println("Current Students:\n");
            try {
            names = new File ("C:\\names.txt");
            fr = new FileReader (names);
            br = new BufferedReader(fr);

         
           String linea;
           while((linea=br.readLine())!=null)
           System.out.println(linea);
          }
        catch(Exception e){
           e.printStackTrace();
        }finally{
           try{                    
              if( null != fr ){   
                 fr.close();     
              }                  
           }catch (Exception e2){ 
              e2.printStackTrace();
           }
        //    System.out.println(input.nextLine());
            }
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