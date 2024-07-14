package LikendListExample;

import java.util.Scanner;

public class LinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch,e;
        Scanner in = new Scanner(System.in);
        linear_Linked_List obj = new linear_Linked_List();
        obj.create_list();//user given size :list
        do {
            System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print List\n6.Search\n7.Delete on Key\n8.Insert At\n0.Exit\n:");
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
                    System.out.println("Enter data:");
                    e = in.nextInt();
                    obj.search_list(e);
                    break;
                case 7:
                    System.out.println("Enter data:");
                    e = in.nextInt();
                    obj.delete_key(e);
                    break;
                case 8:
                    System.out.println("Enter index:");
                    int i = in.nextInt();
                    System.out.println("Enter data:");
                    e= in.nextInt();
                    obj.insert_at(i,e);
                    break;

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




