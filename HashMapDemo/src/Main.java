import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no elemnts:");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Map<Integer,Integer> map=UserMainCode.getSquares(a);
		System.out.println(map);
	}

}
