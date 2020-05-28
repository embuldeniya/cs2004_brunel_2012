import java.util.ArrayList;
import java.util.Collections;


public class Start {
	
	public static void main(String[] args){
	int x=1;
	int y=2;
	int z=3;
	double result,sum = 0,sum2 = 0;
		
	String fileName = "H:/Labs data/ClusterLab.txt";
	ArrayList<Integer> clusterFile = new ArrayList<Integer>();
	ArrayList<Integer> iter = new ArrayList<Integer>();
	double clusterFile2[][] = KMeans.ReadArrayFile(fileName,",");
	ArrayList<Integer> arrange = new ArrayList<Integer>();
	ArrayList<Double> store = new ArrayList<Double>();
	
	
	for(int i=1; i<=arrange.size(); i++){
		if(i<=25)
		{
			arrange.add(x);
		}
		else if(i>25 && i<=75)
		{
			arrange.add(y);
		}
		else if(i>75)
		{
			arrange.add(z);
		}
	}
	
	//read into array;
	clusterFile = KMeans.ReadIntegerFile(fileName);				
	//Create object;		
	KMeans myObject = new KMeans(clusterFile2, 3, 100);
    for(int i=0; i<10; i++){
		iter = myObject.RunIter(3, 10, arrange, false);
		
		result = KMeans.GroupingWK(clusterFile, iter);
	store.add(result);
		 sum +=result;
		System.out.println(result);
	}
	Object obj = Collections.max(iter);
	 Object obj1 = Collections.min(iter);
	 System.out.println(iter);
	 System.out.println("The maximum value is :" +obj);
		System.out.println("The mean value is :" +sum/10);
		System.out.println("The minimum value is :" +obj1);
		System.out.println("");
		System.out.println("");
		System.out.println("Exercise 3");
		System.out.println("");	
		ArrayList<Integer> yy = new ArrayList<Integer>();
		   for(int i=0;i<150;i++){
				if(i<50){
					yy.add(x);
				}else if (i>=50 && i < 100){
					yy.add(y);
				}else if (i>=100){
				yy.add(z);
				}
			}
	double[][] exe3;
		String filename2 = "H:/Labs data/iris_datasheet.txt";
	  exe3 = KMeans.ReadArrayFile(filename2, "	" +"");
	// System.out.println(exe3);
	  
	  //ArrayList<Integer> bb1 = new ArrayList<Integer>();
		KMeans kclust2 = new KMeans(exe3, 4, 150);
		
		ArrayList<Double> exe5 = new ArrayList<Double>();
		ArrayList<Integer> exe4 = new ArrayList<Integer>();
		for(int i=0;i<10;i++){
	 exe4 = kclust2.RunIter(3, 10, clusterFile, false);
//	    System.out.println(exe4);
	 double s1;
	 s1 = KMeans.GroupingWK(yy, exe4);
	 exe5.add(s1);
	 sum2 +=s1;
	 System.out.println(s1);
		}
		 Object objexe = Collections.max(exe5);
		 Object objexe1 = Collections.min(exe5);
		 System.out.println(exe5);
		 System.out.println("The maximum value is :" +objexe);
			System.out.println("The mean value is :" +sum2/10);
			System.out.println("The minimum value is :" +objexe1);
	
	
	}

}