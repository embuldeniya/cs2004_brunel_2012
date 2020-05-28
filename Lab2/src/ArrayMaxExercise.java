
public class ArrayMaxExercise {


	public static void main(String[] args)
	{
	arryMax(5);
	}
	private static void arryMax(double CurrentMax)
		{
			double n=CurrentMax;
			double [] a = new double[(int) (n)];
			 for (int i=1;i<n-1;i++){
				 if (a[i]>CurrentMax){
				 CurrentMax= a[i];
				 break;
				 }
			 
				System.out.println(CurrentMax);
			 }
		
	}
}
