

	public class LinearSum {
		public static void main(String[]args){
			LinearSumMethod(4);
		}
	public static void LinearSumMethod(int n ){
		int sum=0;
		for(int i=1;i<=n;i++){
			sum=sum+i;
			
		}
		System.out.print(sum);
	}
	}