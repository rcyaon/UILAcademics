package taxing;
import java.util.*;
import java.io.*;

public class taxing {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(new File("texting.dat"));
		int count = s.nextInt();
		//s.nextLine();
		for(int i = 0; i < count; i++){
			double cost = s.nextDouble();
			double tax = cost * 0.0825;
			double total = tax + cost;
			System.out.print("$");
			System.out.printf("%.2f", total);
			System.out.println();
			
		}

	}

}
