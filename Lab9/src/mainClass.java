import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
public class mainClass {
	public static void main(String[] args)
	{
		/*ScalesSolution s = new ScalesSolution("11111");
		s.println();
		s.SmallChange();
		s.println();

		ScalesSolution s1 = new ScalesSolution(10);
		s1.println();
		ScalesSolution s2 = new ScalesSolution(s1.GetSol());
		s2.println();
		*/
		
		ArrayList<Double> Array = new ArrayList<Double>();
		  Array.add(0, 1.0);
		  Array.add(1, 2.0);
		  Array.add(2, 3.0);
		  Array.add(3, 4.0);
		  Array.add(4, 10.0);
		
		  ScalesSolution h = new ScalesSolution(Array.size());
		  System.out.println(h.GetSol());
		  //RMHC(Array, 5, 5);
		  ArrayList<Double> Array1 = ReadNumberFile("1000 Primes.txt");
		  long start = System.nanoTime(); 
		  RMHC(Array1,5,10000);
		  long end = System.nanoTime(); 
		  System.out.println("Execution speed "+ (end - start)+" ns");
		  System.out.println(h.GetSol());
		  //ArrayList<Double> Array1 = CS2004.ReadNumberFile("1000 Primes.txt");
		  
		  //RMHC(Array1,1000,1000);
	}

	
	
	public static ScalesSolution RMHC(ArrayList<Double> weights,int n,int iter)
	 {
	  ScalesSolution sol = new ScalesSolution(n);
	  ScalesSolution oldsol = new ScalesSolution(n);
	  double a=0,b=0;
	  for(int i=1;i<=iter;i++)
	  {   
	   System.out.println("A: "+sol.GetSol());
	   a=sol.ScalesFitness(sol.GetSol(),weights);
	   System.out.println("fitness A:"+a);
	   oldsol = new ScalesSolution(sol.GetSol());
	      sol.SmallChange();     
	      System.out.println("B: "+sol.GetSol());
	   b=sol.ScalesFitness(sol.GetSol(),weights);
	   System.out.println("fitness: B"+b);
	   if(b>a)
	   {
	    sol = oldsol;
	   }
	   System.out.println("Selected: " + sol.GetSol());
	  }
	  return(sol);
	 }

	
	static public ArrayList<Double> ReadNumberFile(String filename)
	{
	 ArrayList<Double> res = new ArrayList<Double>();
	 Reader r;
	 try
	 {
	  r = new BufferedReader(new FileReader(filename));
	  StreamTokenizer stok = new StreamTokenizer(r);
	  stok.parseNumbers();
	  stok.nextToken();
	  while (stok.ttype != StreamTokenizer.TT_EOF) 
	  {
	   if (stok.ttype == StreamTokenizer.TT_NUMBER)
	   {
	    res.add(stok.nval);
	   }
	   stok.nextToken();
	  }
	 }
	 catch(Exception E)
	 {
	  System.out.println("+++ReadFile: "+E.getMessage());
	 }
	    return(res);
	}}