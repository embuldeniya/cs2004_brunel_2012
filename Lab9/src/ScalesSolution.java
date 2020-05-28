import java.util.*;

public class ScalesSolution
{
	private String scasol;
	//Creates a new scales solution based on a string parameter
	//The string parameter is checked to see if it contains all zeros and ones
	//Otherwise the random binary string generator is used (n = length of parameter)
	public String GetSol()
	{
		return(scasol);
	}
	
	
	public ScalesSolution(String s)
	{
		boolean ok = true;
		int n = s.length();
		for(int i=0;i<n;++i)
		{
			char si = s.charAt(i);
			if (si != '0' && si != '1') ok = false;
		}
		if (ok)
		{
			scasol = s;
		}
		else
		{
			scasol = RandomBinaryString(n);
		}
	}
	
	
	
	
	public static String RandomBinaryString(int n)
	{
		String s = new String();
		//Code goes here
		//Create a random binary string of just ones and zeros of length n
		for(int i=0;i<n;++i)
		{
			int x = CS2004.UI(1,0);
			if (x == 1 )
			{
				s=s+'1';
			}
			else
			{
				s=s+'0';
			}
		}
		
		
		return(s);
	}

	
	
	
	public ScalesSolution(int n) 
	{
		scasol = RandomBinaryString(n);	
	}
	//This is the fitness function for the Scales problem
	//This function returns -1 if the number of weights is less than
	//the size of the current solution
	
		
	public double ScalesFitness(String s,ArrayList<Double> weights)
	{
		if (scasol.length() > weights.size()) return(-1);
		double lhs = 0.0,rhs = 0.0;
	
		
		//Code goes here
		//Check each element of scasol for a 0 (lhs) and 1 (rhs) add the weight wi
		char [] scale = scasol.toCharArray(); // convert the strings into char
		for (int i =0;i<scale.length;i++ )
		{
			double w = weights.get(i);
			if (scale[i]=='0')
			{
				lhs +=w; }
			else
			{
			rhs+=w;
			
			
			}
		}
		
		//to variables lhs and rhs as appropriate
		
		return(Math.abs(lhs-rhs));
	}
	
	
	
	
	
	
	//Display the string without a new line
		
	public void print()
	{
		System.out.print(scasol);
	}
	
	
	
	
	
	//Display the string with a new line
		public void println()
	{
		print();
		System.out.println();
	}




		public void SmallChange() {
			// TODO Auto-generated method stub
			int n = scasol.length();
			char[] scasolChars = new char[n];
			scasol.getChars(0, n, scasolChars, 0);
			Random rand = new Random(System.nanoTime());
			int randomIndex = rand.nextInt(n);
			if (scasolChars[randomIndex] == '0')
			{
				scasolChars[randomIndex] = '1';
			}
			else if (scasolChars[randomIndex] == '1')
			{
				scasolChars[randomIndex] = '0';
			}
			scasol = new String(scasolChars);
		

		}




}