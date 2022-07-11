import java.util.Scanner;
public class Tran {
	

	public static void main (String args []) throws Exception {

	Scanner s = new Scanner (System.in);

	System.out.println ("enter the size of transaction arrays");

	int size = s.nextInt();

	int arr[]= new int[size];

	System.out.println ("enter the values of array");

	for (int i=0; i<size; i++)

	arr[i] = s.nextInt();

	System.out.println ("enter the total no of targets that needs to be achieved");
	int targetNo = s.nextInt();

	while (targetNo-- != 0)  {

	int flag = 0;
	long target ;

	System.out.println("enter the value for targe" );
	target = s.nextInt();
	long sum = 0;

	for (int i = 0 ; i < size; i++)  {

	sum = sum + arr [i];

	if (sum >= target) {

	System.out.println ("target is achived after" + (i+1) + "transaction");

	flag =1 ;

	break; }
	}
	if (flag==0) {

	 System.out.println("Given target is not achieved" );

	}
	}
	}
	
}

