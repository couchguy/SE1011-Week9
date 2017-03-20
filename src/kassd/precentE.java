package kassd;

import java.util.ArrayList;
import java.util.Scanner;

public class precentE {
	
	public static double precentE2(ArrayList<String> strings){
	double precentE = 0.0;
	String thisWord = "";
	int eCount = 0;
	int length = 0;
	for (int i=0; i<strings.size();i++){
		thisWord = strings.get(i);
		length = thisWord.length();
		for (int d = 0; d<length; d++){
			char thisChar =  thisWord.charAt(d);
			if (thisChar == ('e') || thisChar == ('E')){
				eCount++;
			}
		}
	}
	precentE = ((double)eCount / (double)strings.size())*100;
	return precentE;
	}
	
	private static ArrayList<String> ArrayListMaker(String list) {
		ArrayList<String> newList = new ArrayList<String>();
		Scanner numbers = new Scanner(list);
		while (numbers.hasNext()) {
			newList.add(numbers.next());
		}
		return newList;
	}

public static void main(String[] args){
	ArrayList<String> strings = new ArrayList<String>();
	strings = ArrayListMaker("hello Eric numbr thing happy");
	
	System.out.println(strings);
	System.out.println(precentE2(strings));
}
	
}