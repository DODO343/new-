import java.util.Scanner;

public class test {
	public static void main(String[] args)
	{
		Scanner objectname = new Scanner(System.in);
		System.out.print("Enter the first number");
		double x = objectname.nextDouble();
		System.out.print("Enter the second number");
		double y = objectname.nextDouble();
		System.out.print("Enter the operation");
		char z = objectname.next().charAt(0);
		if(z=='+'){
			System.out.print(x+y);
		}else if(z=='-'){
			System.out.print(x-y);
		}else if(z=='/'){
			System.out.print(x/y);
		}else if(z=='*'){
			System.out.print(x*y);
		}else if(z=='%'){
			System.out.print(x%y);
		}else if(z!='+' || z!='-' || z!='*' || z!='/' || z!='%' ){
			System.out.print("sorry,i donot have this answar"); 
		}
          
	}    
		
		
		
			
		
			
				
		
		
		
		
		
				
		
		
	
		
	}
	
		

	


