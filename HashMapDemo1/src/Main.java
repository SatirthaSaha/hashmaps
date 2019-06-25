import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		System.out.println("Enter the number of students :");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the registration number:");
			int regNo=sc.nextInt();
			System.out.println("Enter the marks scored :");
			int marks=sc.nextInt();
			map.put(regNo, marks);
		}
		Map<Integer,String> medalMap=UserMainCode.getStudents(map);
		System.out.println(medalMap);
	}

}
