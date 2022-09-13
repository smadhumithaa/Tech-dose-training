public class Main
{
	public static void main(String[] args) {
		int n=8100;
		double sqrt=Math.sqrt(n);  
		if((sqrt - Math.floor(sqrt)) == 0){
		    System.out.println("Yes");
		}
		else{
		    System.out.println("No");
		}
	}
}
