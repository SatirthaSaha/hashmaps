import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String n=sc.nextLine();
		Map<String,String> medalMap=UserMainCode.getStates(n);
		System.out.println(medalMap);
	}

}
