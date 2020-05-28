import java.util.Random;

public class Alog4_1 {
	public static void main(String args[])
	{
	   
	    int[] X =new int[2000];
		  for(int z=0;z<X.length;z++)
		  {
			  Random randomGenerator = new Random();
		     X[z] = randomGenerator.nextInt(10);
		  }
		  long start = System.nanoTime();
		  
		Alog4_1.PrefixAver(X);
		  long end = System.nanoTime();
		  System.out.println("Execution speed "+ (end - start)+" ns");
	} 
		  private static void PrefixAver(int[] x) {
				// TODO Auto-generated method stub
				int s=x[0];
				int[] A = new int[2000];
				for(int i=0;i<x.length;i++)
				{
					for(int j=1;j<=i;j++)
					s= s+x[j];
					A[i]=s/(i+1);
					System.out.println(A[i]);
				}
}
}