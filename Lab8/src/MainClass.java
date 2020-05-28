import java.util.ArrayList;
public class MainClass {

	
	
	
	static double x;
	static double y;
	public static void main(String args[])
	{
		call(500);
	/*	for(int i=0;i<10;++i)
		{
			int x = CS2004.UI(2, 1);
			System.out.println(x);
		}
		
		
		
		
		

		
		ScalesSolution s = new ScalesSolution("10101");
		s.println();
		
		s = new ScalesSolution("10101x");
		s.println();
		*/
		/*ArrayList<Double> arraylist = new ArrayList<Double>();
		arraylist.add(1.0);
		arraylist.add(2.0);
		arraylist.add(3.0);
		arraylist.add(4.0);
		arraylist.add(10.0);
		
		//evluate the value with lec side
		double c = s.ScalesFitness(arraylist);
		System.out.print(c);
		
		ArrayList<Double> arraylist=new ArrayList<Double>();
		arraylist.add(1.0);
		arraylist.add(2.0);
		arraylist.add(3.0);
		arraylist.add(4.0);
		arraylist.add(10.0);
		
		ScalesSolution s=new ScalesSolution(ScalesSolution.RandomBinaryString(2));
		double c=s.ScalesFitness(arraylist);
		System.out.print(c);*/

	}
	
	public static void call(int z)
	 {
		 ArrayList<Double> s=new ArrayList<Double>();
			s=CS2004.ReadNumberFile("1000 Primes");
				 for(int i=0;i<10;i++)
				 {
					 ScalesSolution e=new ScalesSolution(ScalesSolution.RandomBinaryString(z));
					 y=e.ScalesFitness(s);
					 System.out.println( y);
					 x+=y;
					 
				 	}
				 System.out.println("The average fitness for " +y);
					System.out.println(x/100);
				
}
}