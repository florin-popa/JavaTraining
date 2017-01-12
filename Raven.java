import java.util.Random;
import java.util.Scanner;
public class Raven {
	public static void main(String args[]) {
		Random dice = new Random();
		Scanner input = new Scanner(System.in);
		int number;
		int sum=0;
		int freq[]= new int[7];
		System.out.println("How many times you wanna roll the dice?");
		int set = input.nextInt();
		System.out.println("Index\tNumber");
		for ( int counter=1; counter<=set;counter++ ){
			number =1+ dice.nextInt(6);
			sum+=number;
			System.out.println(counter+"\t"+number);
		}
		System.out.println("Your sum of the rolls is: "+sum);
		System.out.println("How many times you wanna roll the dice now?");
		int set2= input.nextInt();
	for ( int roll=1; roll<=set2;roll++){
		++freq[1+dice.nextInt(6)];
	}
	System.out.println("Face\tFrequency");
	for(int face=1;face<=6;face++){
		System.out.println(face+"\t"+freq[face]);
	}
		
		
		
	}
}
