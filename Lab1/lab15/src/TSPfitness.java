import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.util.ArrayList;


public class TSPfitness {

	static public ArrayList<Integer> ReadIntegerFile(String filename)
	{
		ArrayList<Integer> res = new ArrayList<Integer>();
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
					res.add((int)(stok.nval));
				}
				stok.nextToken();
			}
		}
		catch(Exception E)
		{
			System.out.println("+++ReadIntegerFile: "+E.getMessage());
		}
	    return(res);
	}
	
	static public double[][] ReadArrayFile(String filename,String sep)
	{
		double res[][] = null;
		try
		{
			BufferedReader input = null;
			input = new BufferedReader(new FileReader(filename));
			String line = null;
			int ncol = 0;
			int nrow = 0;
			
			while ((line = input.readLine()) != null) 
			{
				++nrow;
				String[] columns = line.split(sep);
				ncol = Math.max(ncol,columns.length);
			}
			res = new double[nrow][ncol];
			input = new BufferedReader(new FileReader(filename));
			int i=0,j=0;
			while ((line = input.readLine()) != null) 
			{
				
				String[] columns = line.split(sep);
				for(j=0;j<columns.length;++j)
				{
					res[i][j] = Double.parseDouble(columns[j]);
				}
				++i;
			}
		}
		catch(Exception E)
		{
			System.out.println("+++ReadArrayFile: "+E.getMessage());
		}
	    return(res);
	}
	//TSP fitness
	static public double TSP(int N, ArrayList<Integer> T, double[][] D)
	{
		double s=0.0;
		for(int i=0;i<N-1;i++)
		{
			int a=T.get(i);
			int b=T.get(i+1);
			
			s=s+D[a][b];	
		}
		int end = T.get(N-1);
		int start = T.get(0);
		s=s+D[end][start];
		return(s);
	}
	
	//Random Starting Point
	
	static public ArrayList<Integer>  RandPerm(int N)
	{
		ArrayList<Integer> P = new ArrayList<Integer>();
		ArrayList<Integer> T = new ArrayList<Integer>();
		for(int i=0;i<N;i++)
		{
			int a= CS2004.UI(0, N-1);
			P.add(a);
		}
		while(P.size() >0)
		{
			int i= CS2004.UI(1, P.size());
			T.add(P.get(i-1));
			P.remove(i-1);
		}
		return T;
	}
	
	//A Small Change
	static public ArrayList<Integer> Swap(ArrayList<Integer>TT)
	{
		ArrayList<Integer> T = (ArrayList<Integer>) TT.clone();
		int i=0;
		int j=0;
		while(i==j)
		{
			i= CS2004.UI(0, T.size()-1);
			j= CS2004.UI(0, T.size()-1);
		}
		int a=T.get(i);
		int b=T.get(j);
		int temp=a;
		a=b;
		b=temp;
		T.set(i,a);
		T.set(j,b);
		return T;
	}

	//Simple Hill Climbing
	static public double SHC(int times, int N,double[][] D)
	{
		ArrayList<Integer> A=RandPerm(N);
		double fitness=TSP(N,A,D);
		for(int i=0;i<times;i++)
		{
			ArrayList<Integer> B=Swap(A);
			double fitness1=TSP(N,B,D);
			if(fitness1<fitness)
			{
				fitness=fitness1;
				A=(ArrayList<Integer>) B.clone();
			}
		}
		return fitness;
	}
	//Random Restart Hill Climber
	static public double RRHC(int times, int N,double[][] D)
	{
		ArrayList<Integer> A=RandPerm(N);
		double fitness=TSP(N,A,D);
		for(int i=0;i<times;i++)
		{
			ArrayList<Integer> B=RandPerm(N);
			double fitness1=TSP(N,B,D);
			if(fitness1<fitness)
			{
				fitness=fitness1;
				A=(ArrayList<Integer>) B.clone();
			}
		}
		return fitness;
	}

}
