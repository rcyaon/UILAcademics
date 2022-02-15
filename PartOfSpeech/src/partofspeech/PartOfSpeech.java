package partofspeech;

import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class PartOfSpeech {

	public static void main(String[] args) {
		Scanner s = new Scanner(new File("PARTSOFSPEECH.DAT"));
		String articles = s.nextLine();
		String[] articlesList = articles.split("\\s+");
		String helpers = s.nextLine();
		List<String> firstHelpersList = new ArrayList<>();
		firstHelpersList.addAll(helpers.split("\\s+"));
		String secondHelpers = s.nextLine();
		List<String> secondHelpersList = new ArrayList<String>();
		secondHelpersList.addAll(secondHelpers.split("\\s+"));
		List helpersList = Stream.concat(firstHelpersList.stream(), secondHelpersList.stream()).collect(Collectors.toList());
		int dataSet = s.nextInt();
		int dieCount = s.nextInt();
		while (dieCount > 0) {
			String sentance = s.nextLine();
			String[] reading = sentance.split("\\s+");
			for(int i=0; i < reading.length; i++) {
				for(int x = 0; x < articlesList.length; x++) {
					String word = reading[i];
					String article = articlesList[x];
					if(word == article && reading[(i+1)] == "die") {
						System.out.println("NOUN");
					}
				}
				for(int y = 0; y < helpersList.length; y++) {
					String verbword = reading[i];
					String helper = helpersList[y];
					if(verbword == helper && reading[(i+1)] == "die") {
						System.out.println("VERB");
					}//if statement
				}//third for
			}//first for
		}//while
		System.out.println("");
		//Start of find face types
		int faceCount = s.nextInt();
		while (faceCount > 0) {
			String facesentance = s.nextLine();
			String[] facereading = facesentance.split("\\s+");
			for(int z=0; z < facereading.length; z++) {
				for(int m = 0; m < articlesList.length; m++) {
					String faceword = facereading[z];
					String facearticle = articlesList[m];
					if(faceword == facearticle && facereading[(z+1)] == "face") {
						System.out.println("NOUN");
					}
				}
				for(int j = 0; j < helpersList.length; j++) {
					String faceverbword = facereading[z];
					String facehelper = helpersList[j];
					if(faceverbword == facehelper && facereading[(z+1)] == "face") {
						System.out.println("VERB");
					}//if statement
				}//third for
			}//first for
		}//while
		
	}//static void

}//public class
