//Compare OneMaxChrome  - used to sort an ArrayList of OneMaxChrome
public class CompareOneMaxChrome implements java.util.Comparator<OneMaxChrome>
{
	public int compare(OneMaxChrome a, OneMaxChrome b) 
	{
		if (a.OneMaxFitness() < b.OneMaxFitness()) return(1);
		if (a.OneMaxFitness() > b.OneMaxFitness()) return(-1);
		return(0);
	}
}