import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int option=0;
		InternBO ibo=new InternBO();
		do
		{
			System.out.println("MENU");
			System.out.println("=====");
			System.out.println("1.Add a new intern");
			System.out.println("2.Print existing intern");
			System.out.println("3.Removing an intern by id");
			System.out.println("4.Sort the interns by age");
			System.out.println("5.Sort the interns by name");
			System.out.println("6.Exit the menu");
			System.out.println("Enter options(1-5)/6 to quit==>");
			option=sc.nextInt();
			
			switch(option)
			{
			case 1: 
				System.out.println("Enter the name:");
				String name=sc.next();
				System.out.println("Enter the batch:");
				String batch=sc.next();
				
				System.out.println("Enter the age:");
				int age=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter technology");
				String technology=sc.next();
				ibo.addIntern(name, batch, age, technology);
				break;
			case 2:
				ibo.printInternDetails();
				break;
			case 3:
				System.out.println("Enter the id of the intern to remove: ");
				int id1=sc.nextInt();
				ibo.removeIntern(id1);
				break;
			case 4:
				ibo.sortInternsByAge();
				ibo.printInternDetails();
				break;
			case 5:
				ibo.sortInternsByName();
				ibo.printInternDetails();
				break;
			default:
				System.out.println("Invalid option, enter option within (1-4)/5 to quit");
			}
		}while(option!=4);
	}

}
