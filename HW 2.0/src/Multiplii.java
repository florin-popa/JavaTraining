import java.util.Scanner;
public class Multiplii {
public static void main(String args[]){
Scanner input = new Scanner(System.in);
	int fNumber=0;
	int sum=0;
	int sNumber;
	int sum2=0;
	int tNumber=0;
	while(fNumber<10){
		if (fNumber%5==0 || fNumber%3==0){
	sum= sum+fNumber;
		}
		fNumber++;	
		
	}
	System.out.println(sum);
	System.out.println("Enter a number here : ");
	sNumber=input.nextInt();
	while(tNumber<sNumber){
		if (tNumber%3==0 || tNumber%8==0){
			sum2=sum2+tNumber;
		}
		tNumber++;
	}
	System.out.println("This is the sum: ");
	System.out.println(sum2);
}
}
