package malfunction;

import java.util.*;
import java.io.*;

public class MalFunction {

	public static void main(String[] args) throws IOException{
		Scanner s = new Scanner(new File("malfunction.dat"));
		int count = s.nextInt();
		s.nextLine();
		for(int i = 0; i < count; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			double x = s.nextDouble();
			double total = a*(x * x)+b*x+c;
			System.out.printf("%.3f", total);
			System.out.println("");
		}

	}

}
