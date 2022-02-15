package touchy;

import java.util.*;
import java.io.*;

public class Touchy {

	public static void main(String[] args) throws IOException{
		Scanner s = new Scanner(new File("touchy.dat"));
		int count = s.nextInt();
		s.nextLine();
		for(int i = 0; i < count; i++) {
			int initialSetting = s.nextInt();
			double taps = s.nextInt();
			if(initialSetting == 0) {
				if(taps % 4 == 1) {
					System.out.println("1");
				}
				if(taps % 4 == 0) {
					System.out.println("0");
				}
				if(taps % 4 == 2) {
					System.out.println("2");
				}
				if(taps % 4 == 3) {
					System.out.println("3");
				}
			} 
			if(initialSetting == 1) {
				if(taps % 4 == 1) {
					System.out.println("2");
				}
				if(taps % 4 == 0) {
					System.out.println("1");
				}
				if(taps % 4 == 2) {
					System.out.println("3");
				}
				if(taps % 4 == 3) {
					System.out.println("0");
				}
			}
			if(initialSetting == 2) {
				if(taps % 4 == 1) {
					System.out.println("3");
				}
				if(taps % 4 == 0) {
					System.out.println("2");
				}
				if(taps % 4 == 2) {
					System.out.println("0");
				}
				if(taps % 4 == 3) {
					System.out.println("1");
				}
			}
			if(initialSetting == 3) {
				if(taps % 4 == 1) {
					System.out.println("0");
				}
				if(taps % 4 == 0) {
					System.out.println("3");
				}
				if(taps % 4 == 2) {
					System.out.println("1");
				}
				if(taps % 4 == 3) {
					System.out.println("2");
				}
			}
			if(i < (count-1)) {
				s.nextLine();
			}
			
		}	//for			
	
	}//void

}//public class
