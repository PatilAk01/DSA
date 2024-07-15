package Student_Management;



public class Student {
	 Snode root;
	   void create_list() {
	        root = null; 
	    }

void insert_student(int rollno, String name, char gender) {
	        Snode sn = new Snode(rollno, name, gender);
	        if (root == null)
	            root = sn;
	        else {
	            sn.next = root;
	            root = sn;
	        }
	        System.out.println("Inserted Student Data Successfully");
	    }

void print_student() {

	        if (root == null) {
	            System.out.println("Student info empty");
	        } else {
	            Snode t = root;
	            while (t != null) {
	                System.out.println(t.rollno + " " + t.name + " " + t.gender);
	                System.out.println("----");
	                t = t.next;
	            }
	        }
	    }
	    
 void delete_left()
	    {
	        if(root==null)
	            System.out.println("List empty");
	        else
	        {

	         root=root.next;//2
	         System.out.println(" deleted Student record from list");
	        }

	    }
 void modify(int rollno, String newname, char newgender) {
	 Snode t=root;
	 while(t!=null) {
		 if(t.rollno==rollno) {
			 t.name =newname;
			 t.gender=newgender;
			 System.out.println(t.rollno + " " + t.name + " " + t.gender);
			 return;
			 
		 }
		 t=t.next;
	 }
 }
	    
void search_list(int key)
	    {
	        if(root==null)
	            System.out.println("List empty");
	        else
	        {
	            Snode t=root;
	            while(t!=null)
	            {
	             if(t.rollno==key)
	             {
	                 System.out.println("Found in Student list");
	                 break;
	             }
	             t=t.next;
	            }
	            if(t==null)
	                System.out.println("Not found in list");
	        }
	    }

	}