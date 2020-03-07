import java.util.Scanner;

public class xxx {
		
			public static void main(String[] args) {
				Scanner Scanner=new Scanner(System.in);
				System.out.print("please insert word");
				String word =Scanner.nextLine();
				String input=word.toLowerCase();
				input =input.replaceAll("a-z", " ");
				for(int i=0; i<word.length() ; i++)
				{
					String Str=" ";
					if(input.charAt(i)== input.charAt(input.length()-i-1)){
						System.out.print("true");
						
					}
					else{
						System.out.print("false");
					}
				}
				
				}
				
				
					
					
				
				

			}

		


	


