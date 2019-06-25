import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		System.out.println("Enter the no. of elements");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] array=new String[n];
		for(int i=0;i<n;i++)
			array[i]=sc.nextLine();
		for(String i:array)
		{
			list.add(i);
			//System.out.println(i);
		}
		//System.out.println(list);
		/*for(String i:list)
		{
			String[] arrOfStr = i.split("-"); 
			String a=arrOfStr[1];
			int num=Integer.parseInt(a);
			if(num%3==0)
				System.out.println(i);
		}*/
		Iterator<String> it=list.iterator();
		while(it.hasNext())
		{
			String str=it.next();
			String[] companyCode=str.split("-");
			int num=Integer.parseInt(companyCode[1]);
			if(num%3==0)
			{
				it.remove();
				System.out.println(it);
			}
		}
			
	}

}
