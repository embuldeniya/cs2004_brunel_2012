import java.util.ArrayList;
import java.util.Random;

public class Lab7
{

public static void main (String args[])
{
 PrintArray(RandomArray(4));
 double c [][]=RandomArray(4);
 System.out.println("");
 
 PrintArray(c);
 System.out.println("");
 PrintArray(MST.PrimsMST(c));
 System.out.println("");
 long start = System.nanoTime();
 MST.PrimsMST(RandomArray(500));
 long end = System.nanoTime();
 System.out.println("Execution speed "+ (end - start)+" ns");
}


 private static double [] [] RandomArray (int n)
 {
  double w [] [] = new double [n] [n];
  for (int i=0;i<n;i++)
  {
   for (int j=0;j<n;j++)
   {
    Random generator = new Random();
    int r = generator.nextInt( 100 );
    w[i][j]= r;
    w[j][i]= w[i][j];
   }
  }
    
  return (w);
}
 private static void PrintArray(double res [][])
 {
  int n = 4;
  for(int i=0;i<n;i++){
	  
   for(int j=0;j<n;j++){
	   
    System.out.print(res[i][j]+" "); 
   }
   System.out.println();
  }
   
   
                      
 }
 
 
 
 }