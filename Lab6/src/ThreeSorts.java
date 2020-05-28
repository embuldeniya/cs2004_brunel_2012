import java.util.*;
public class ThreeSorts 
{
	private static ArrayList<Integer> CopyArray(ArrayList<Integer> a)
	{
		ArrayList<Integer> resa = new ArrayList<Integer>(a.size());
		for(int i=0;i<a.size();++i) resa.add(a.get(i));
		return(resa);
	}
	
	// Bubble Sort
	/* 
	public static ArrayList<Integer> SortA(ArrayList<Integer> a)
	{
		long start = System.nanoTime();
		ArrayList<Integer> array = CopyArray(a);
		int n = a.size(),i;
		boolean noswaps = false;
		
		while (noswaps == false)
		{
			noswaps = true;
			for(i=0;i<n-1;++i)
			{
				if (array.get(i) < array.get(i+1))
				{
					Integer temp = array.get(i);
					array.set(i,array.get(i+1));
					array.set(i+1,temp);
					noswaps = false;
				}
			}
		}
		long end = System.nanoTime();
		System.out.println("Execution speed "+ (end - start)+" ns");
	//System.out.println(array);
		return(array);
		
	}
	// Radiox Sort

		public static ArrayList<Integer> SortB(ArrayList<Integer> a)
	{
		long start = System.nanoTime();
		ArrayList<Integer> array = CopyArray(a);
		Integer[] zero = new Integer[a.size()];
		Integer[] one = new Integer[a.size()];
		int i,b;
		Integer x,p;
		//Change from 8 to 32 for whole integers - will run 4 times slower
		for(b=0;b<8;++b)
		{
			int zc = 0;
			int oc = 0;
			for(i=0;i<array.size();++i)
			{
				x = array.get(i);
				p = 1 << b;
				if ((x & p) == 0)
				{
					zero[zc++] = array.get(i);
				}
				else
				{
					one[oc++] = array.get(i);
				}
			}
			for(i=0;i<oc;++i) array.set(i,one[i]);
			for(i=0;i<zc;++i) array.set(i+oc,zero[i]);
		}
		long end = System.nanoTime();
		System.out.println("Execution speed "+ (end - start)+" ns");
//System.out.println(array);
		return(array);
	}
	*/
	// Quick Sort
	public static ArrayList<Integer> SortC(ArrayList<Integer> a)
	{
		long start = System.nanoTime();
		ArrayList<Integer> array = CopyArray(a);
		SortC(array,0,array.size()-1);
		long end = System.nanoTime();
		System.out.println("Execution speed "+ (end - start)+" ns");
//System.out.println(array);
		return(array);
	}
	

public static void SortC(ArrayList<Integer> array,int first,int last)
	{
		if (first < last)
		{
		   int pivot = PivotList(array,first,last);
		   SortC(array,first,pivot-1);
		   SortC(array,pivot+1,last);
		}	
	}
	private static void Swap(ArrayList<Integer> array,int a,int b)
	{
		Integer temp = array.get(a);
		array.set(a,array.get(b));
		array.set(b,temp);
	}
	private static int PivotList(ArrayList<Integer> array,int first,int last)
	{
		Integer PivotValue = array.get(first);
		int PivotPoint = first;
		for(int index=first+1;index<=last;++index)
		{
			if(array.get(index)>PivotValue)
			{
				PivotPoint +=1;
				Swap(array,PivotPoint,index);
			}
		}
		Swap(array,first,PivotPoint);
		return(PivotPoint);
			}

//Q1
	private static void RandomArray(ArrayList<Integer> array,int n)
	{
		
		for(int i=0;i<n;i++)
		{
			Random rand = new Random();
			
			rand.setSeed(System.nanoTime());
			Integer r = Math.abs(rand.nextInt() %256);
			array.add(i,r);
					
		}
		System.out.println(array);
	}

//Q2
	private static void ShowArray(ArrayList<Integer> Array)
	{
		for(int i=0;i<Array.size();i++)
			System.out.println(Array.get(i));
	}

//Q4
public static void main(String args[])
{
	ArrayList<Integer> Array = new ArrayList<Integer>();
	RandomArray(Array,25000);
ShowArray(Array);
		//SortA(Array);
		//SortB(Array);
	//SortC(Array);
}

}