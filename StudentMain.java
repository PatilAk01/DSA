package Student_Management;

import java.util.Scanner;



public class StudentMain {
	


		    public static void main(String[] args) {
		      int ch;
		          Scanner in = new Scanner(System.in);
		          Student obj = new Student();
		          
		          obj.create_list();
		          int rollno;
		          String name;
		          char gender;
		          do {
		              System.out.println("\n1.Insert Left\n2.Delete Left\n3.Print List\n4.Search\n5.modify\n0.Exit\n:");
		              ch = in.nextInt();
		              in.nextLine();
		              switch (ch) {
		                  case 1:
		                      System.out.println("Enter RollNo:");
		                      rollno = in.nextInt();
		                      in.nextLine();
		                      
		                      System.out.println("Enter Name: ");
		                      name=in.nextLine();
		                      
		                      System.out.println("Enter Gender: ");
		                      gender = in.nextLine().charAt(0);
		                      
		                     obj.insert_student(rollno, name, gender);
		                      break;
		                      
		                  case 2:
		                    obj.delete_left();
		                    break;
		                  case 3:
		                    obj.print_student();
		                    break;
		                  case 4:
		                    System.out.println("Enter Rollno :");
		                    rollno=in.nextInt();
		                    obj.search_list(rollno);
		                    break;
		                  case 5:
		                  System.out.println("Enter RollNo:");
	                      rollno = in.nextInt();
	                      in.nextLine();
	                      
	                      System.out.println("Enter Name: ");
	                      name=in.nextLine();
	                      
	                      System.out.println("Enter Gender: ");
	                      gender = in.nextLine().charAt(0);
	                      
	                      obj.modify(rollno, name, gender);
	                      
		                    
		              }
		              
		          }while(ch != 0);
		    }
		  }