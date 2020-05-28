import java.util.ArrayList;


public class lab15 {
	public static void main(String args[])
	{
	double [][] z = TSPfitness.ReadArrayFile("TSP_48.txt"," ");
	ArrayList<Integer> x = TSPfitness.ReadIntegerFile("TSP_48_OPT.txt");
	int times = 48;
	//OPT
	double opt_fitness=TSPfitness.TSP(times,x,z);
	System.out.println(opt_fitness);
	//Creating a List
	//System.out.println(TSPfitness.RandPerm(48));
	
	System.out.println("The best fitness for Simple Hill Climbing: " + TSPfitness.SHC(10000,48, z));
	System.out.println("The best fitness for Random Restart Hill Climber: " + TSPfitness.RRHC(10000,48, z));
	
	}
}
