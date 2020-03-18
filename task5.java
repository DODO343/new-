import java.util.Arrays;
import java.util.Scanner;
public class task5 {

	public static void main(String[] args) {
		Scanner Scanner=new Scanner(System.in); 
		int[] A ={2,7,5,8};
		int target =9;
		for(int i=0;i<A.length;i++){
			for(int j=i+1;j<A.length;j++){
				if(A[i]+A[j]==target){
					int[]c= {A[i],A[j]};
					System.out.println("c="+Arrays.toString(c) );
				}
			}
			
		}
		

	}

}
