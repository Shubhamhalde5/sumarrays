import java.util.lang*;
public class sumarry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] a= {10,20,30,40};
 mycode(a);
	}
	private static void mycode(int[] a)
	{
		int sum=0;
		int avg=0;
	int i=0;
		for(i=0; i<a.length;i++);
		{
		sum=sum+a[i];
		avg=sum/4;
		}
		System.out.println(sum);
		System.out.println(avg);
	}

}