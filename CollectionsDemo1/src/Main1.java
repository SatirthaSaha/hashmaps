import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no. of elements in the array");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		Integer[] a=new Integer[n1];
		//ArrayList list1= new ArrayList();
		System.out.println("Enter the elements of the first array");
		for(int i=0;i<n1;i++)
			a[i]=sc.nextInt();
		System.out.println("Enter the no.of elements of the second array");
		int n2=sc.nextInt();
		Integer[] b=new Integer[n2];
		//ArrayList list2= new ArrayList();
		System.out.println("Enter the elements of the second array");
		for(int i=0;i<n2;i++)
			b[i]=sc.nextInt();
		Integer[] array=UserMainCode.removeElements(a, b);
		System.out.println("Array after removing");
		for(int n:array)
		System.out.println(n);
	}

}
