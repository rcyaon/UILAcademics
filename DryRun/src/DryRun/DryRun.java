package DryRun;

import java.util.*;
import java.io.*;

public class DryRun {

	public static void main(String[] args) throws IOException{
		Scanner s = new Scanner(new File("C:\\Users\\sldavila\\Desktop\\UILprogramming\\judge\\dryrun.dat"));
		int num = s.nextInt();
		s.nextLine();
		String like;
		for(int i = 0; i < num; i++) {
			like = s.nextLine();
			System.out.println("I like " + like + ".");
		}

	}

}
