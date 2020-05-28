
public class GeoSum {


		public static void main(String[]args){
			GeoSum1(1,2);
		}
	public static void GeoSum1(int a,int N){
		int sum=0;
		for(int i=1;i<=N+1;i++){
			sum=(int)(sum + Math.pow(a,i));
		}
			System.out.print(sum);
		}
	}
