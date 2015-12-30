import java.util.ArrayList;

public class Euler74 {
	
	public static ArrayList<Integer> numseval= new ArrayList<Integer>();
	static int[] facts={1,1,2,6,24,120,720,5040,40320,362880};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,suc=0,cont=0,c60=0;
		int dig;
		
		for (int i=0;i<1000000;i++){
			n=i;	
			
			
			while(numseval.contains(n)==false){
				numseval.add(n);
				suc=0;
				while (n>0){
					dig=n%10;
					suc+=facts[dig];
					n=n/10;
				}
				n=suc;
				cont++;
			}			
			
			if(cont==60)
				c60++;
			
			cont=0;
			numseval.clear();
		}

		System.out.println(c60);	
		
	}
	
	
}
