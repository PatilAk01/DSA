
package Student_Management_Sysytem;

public class node {
	int RollNo;
	String Name;
	char Gender;
	node next;
	public node(int rollNo, String name, char gender, node next) {
		
		this.RollNo = rollNo;
		this.Name = name;
		this.Gender = gender;
		this.next = next;
	}
	
	

}
