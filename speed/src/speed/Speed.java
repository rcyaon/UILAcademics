package speed;

import java.util.*;
import java.io.*;

public class Speed {

	public static void main(String[] args) throws IOException{
		Scanner s = new Scanner(new File("speed.dat"));
		int count = s.nextInt();
		s.nextLine();
		for(int i = 0; i < count; i++) {
			double time = s.nextInt();
			double num = time * 1;
			double miles = num/5;
			System.out.printf("%.1f", miles);
			System.out.println("");
			if(i < count-1) {
				s.nextLine();
			}
		}
	}

}
