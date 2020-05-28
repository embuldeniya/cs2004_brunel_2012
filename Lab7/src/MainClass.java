
import java.util.ArrayList;
import java.util.Random;
public class MainClass {

	public static void main(String args []) {
	

		
		double grid[][] = {{0,1,2},{1,0,3},{2,3,0},{1,0,6,0,5},{0,5,1,2,0}};
		PrintArray(grid);
		
		double mst1[] [] =MST.PrimsMST(grid);
		System.out.println("1)");		
		PrintArray(mst1);
		
		System.out.println();
		PrintArray(grid);
		
		PrintArray (RandomArray(10));
		System.out.println();
		
	/*	for (int i=0;i<25;++i)
		{
			for(int n = 100;n<=500;n+=50)
			{
				double g [] [] = RandomArray(n);
			long t1 = System.nanoTime();
				double mst [] [] = MST.PrimsMST(g);
				long t2 = System.nanoTime();
				System.out.println(i+ " "+ n +" "+ (t2-t1));
			}
			
		}*/
	}
	public static void PrintArray(double array[][])
	{
		for (int i =0; i<array.length;++i)
		{
					for(int j=0;j<array[i].length;++j)
					{
						System.out.print(array[i] [j] + " ");
					}
					System.out.println();
		}
	}
	
	
	
	
	
				public static double [] [] RandomArray(int n)
				{ 
					double res [] [] = new double [n][n];
					Random rand = new Random ();
					
					rand.setSeed(System.currentTimeMillis());
					for (int i=0;i<n;++i)
					{
						 for (int j = 0; j<n; ++j)
						 { 
							 int d = Math.abs(rand.nextInt()%101);
							 res [i] [j] = (double) d;
							 res[j][i] =  res [i] [j]; 
						 }
						 res[i][i] = 0.0;
				}
					return(res);
			}
		
 
	
}
