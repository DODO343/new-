import java.util.Arrays;
public class task4 {

	public static void main(String[] args) {
		int[] A={1,2,3,5 }; 
		int[] B={1,3,4 };
		int[]C=new int [A.length +B.length];
		int i=0;
		int j=0;
		int k=0;
		while(i< A.length && j<B.length){
			if( A[i]<= B[j] )
			{
				C[k]=A[i];
				i++;
			}
			else{
				C[k]=B[j];
				j++;
			}
			k++;
		}
		C[k]=A[i];
		
		

	}

}
