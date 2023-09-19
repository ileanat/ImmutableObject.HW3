import java.util.Scanner;

//hw3
public class ImmutableObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float fahrenheit;
		float centigrade;
		fahrenheit = 98.6f;
		//formula c = 5/9(f-32)
		System.out.println(5/9*(fahrenheit-32));
		
		for(double i =0; i<=40.0; i+=4) {
			System.out.println("The fahrenheit of i is "+(i-32)*5/9);
		}
		System.out.println("\n");
		double i =0;
		while (i<=40.0) {
			System.out.println("The fahrenheit of i is "+(i-32)*5/9);
			i+=4;
		}
		StopChecking();
	}
	public static void StopChecking() {
		String [] [] myArray = {{"BMW", "Ferrari", "Lambo"}, 
		{"pizza" , "burger", "dumpling"}};
		Scanner input = new Scanner(System.in);
		String isin; String inputwords;
		System.out.println("Enter a word: ");
		inputwords = input.next();
		do {
			isin = "false";
			for(int i =0; i<myArray.length;i++) {
			for(int j =0; j<= myArray.length;j++) {	
					
			if(myArray[i][j].equals(inputwords)){
						isin = "true";
						
//System.out.println(isin);
					}
				
				}
			}
			//System.out.println(isin);
			if (isin.equals("true")){
				System.out.println(inputwords+ " is in the 2D array");
				//lisin = "false";
			}
			else if(isin.equals("false"))
				System.out.println(inputwords +" is not in the 2D array");
		System.out.println("Enter a word: ");
		inputwords = input.next();
		}while (!inputwords.equals("STOP"));
		
	}
}

