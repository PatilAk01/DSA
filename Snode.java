package Student_Management;


	public class Snode {
		  int rollno;
		  String name;
		  char gender;
		  Snode next;
		  Snode(int rollno, String name,char gender)
		  {
		    this.rollno=rollno;
		    this.name=name;
		    this.gender=gender;
		    this.next=null;
		  }
		}