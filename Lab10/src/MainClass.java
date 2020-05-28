
import java.util.ArrayList;
import java.util.Random;

public class MainClass {

	public static void main(String args[])
	{
	
		//Ex1
	
	double r = Cannon.GetMaxRange(54.0,1650.0);
	System.out.println(r);
	ArrayList<Double> xt = Cannon.GetX();
	ArrayList<Double> yt = Cannon.GetY();
	System.out.println(xt.size());
	System.out.println(yt.size());
	System.out.println();
	

	
		
	double theta1=0.0;
	double vzero1=0.0;
	double range1=0.0;
	double fitness1=100000000.0;
	
	for (int x=0;x<=100;x++)
	{
	double theta=CannonSolution.UI(25,55);
	double vzero=CannonSolution.UI(1500,1650);

	double range = Cannon.GetMaxRange(theta, vzero);
	if(range>range1)
	{
	theta1=theta;
	vzero1=vzero;
	range1=range;
	}	
	}
	System.out.println(theta1);
	System.out.println(vzero1);
	System.out.println(range1);
	
	
	System.out.println();
	
	
	

	range1=0;
	for (int x=0;x<=100;x++)
	{
	double theta=CannonSolution.UI(25,55);
	double vzero=CannonSolution.UI(1500,1650);
	double range = Cannon.GetMaxRange(theta, vzero);
	double fitness = Math.abs(range-65000);
	if (fitness<fitness1)
	{
		theta1=theta;
		vzero1=vzero;
		fitness1=fitness;
		range1=range;
	}
	}
	System.out.println("angle" + theta1);
	System.out.println("velocity" +vzero1);
	//System.out.println("fitn" + fitness1);
	System.out.println("ranger i need "+ range1);


	}
}