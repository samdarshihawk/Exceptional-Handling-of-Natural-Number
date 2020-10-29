
import java.util.Scanner;
public class driver {

	public static void main(String[] args) throws ErrConstrException, ErrModifException{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		NaturalNumber[] arr = new NaturalNumber[10];
		System.out.println("Enter 10 Natural Number");
		for(int i = 0; i<arr.length;i++) {
			System.out.println("Enter "+(i+1)+" Natural Number: ");
			int x = in.nextInt();
			NaturalNumber obj = new NaturalNumber(x);
			arr[i] = obj;
		}
		
		int min,max;
		int totalsum = 0;
		int count = 0;
		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;
		for (int j = 0; j<arr.length;j++) {
			arr[j].toString();
			totalsum += arr[j].x;
			if(arr[j].x > max )
				max = arr[j].x;
			else if(arr[j].x < min)
				min = arr[j].x;
			count += 1;
		}
		
		double mean = totalsum/count;
		
		System.out.println("Maximum number in the array: "+max);
		System.out.println("Minimum number in the array: "+min);
		System.out.println("Mean of the array: "+ mean);
		arr[0].minus(arr[1]);
		
		
	}

}
