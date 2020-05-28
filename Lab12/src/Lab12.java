
public class Lab12 {
	public static void main(String args[])
	{
	
			
		for(int b=100;b<=1000; b+=100){
			
			double sum=0;
			for(int i=0;i<10;++i){
							
					//Reset the fitness count
					OneMaxChrome.ClearFC();
					//The following parameters are not very good!
					//These are the ones you should try and optimise!
					int popsize = 100;
					double mrate = 0.1/b;
					double crate = 0.6;
					//You will not need to change the following
					SimpleGeneticAlgorithm ga = new SimpleGeneticAlgorithm(popsize,10,b,mrate,crate);
					//Run the GA for 10,000 function calls
					double f = ga.RunSGA(10000,false).OneMaxFitness();
					//System.out.println(f);
					sum+=f;
					
				}
			System.out.println("Average Is "+ sum/10 );
		}	
			
	}

}
