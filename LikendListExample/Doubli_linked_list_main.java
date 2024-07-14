package LikendListExample;

import java.util.Scanner;

public class Doubli_linked_list_main {
	
	public static void main(String[] args) {
	int ch,e;
    Scanner in = new Scanner(System.in);
    Doubly_linked_list obj = new Doubly_linked_list();
    obj.create_list();;//user given size :list
    do {
        System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print List\n6.rev print\n0.Exit\n:");
        ch = in.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter data:");
                e = in.nextInt();
                obj.insert_left(e);
                break;
            case 2:
                System.out.println("Enter data:");
                e = in.nextInt();
                obj.insert_right(e);
                break;
            case 3:
                obj.delete_left();
                break;
            case 4:
                obj.delete_right();
                break;
            case 5:
                obj.print_list();
                break;
            case 6:
            	obj.rev_print_list();
            
            case 0:
                System.out.println("Exiting.....");
                break;
            default:
                System.out.println("Wrong option selected");
                break;
        }
    } while (ch != 0);
}
}