package co.grandcircus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PracticeAssessment {

	public static void main(String[] args) {
//		System.out.println(Arrays.toString(getFirstWords("Java runs anywhere.", "Is this your pen?", "Cool runnings is my favorite movie!")));
//		double[] dubs = {10, 7, 20, 4};
//		System.out.println(makeADifference(dubs, 0, 3));
//		ArrayList<Character> chars = new ArrayList<>();
//		chars.add('a');
//		chars.add('e');
//		chars.add('i');
//		chars.add('o');
//		chars.add('u');
//		updateList(chars, 'y');
//		System.out.println(chars.toString());
		}
	
	public static Map<Integer, String> espanol() {
		//return a map with integer keys: 1, 2, 3
		//and String values "Uno", "Dos", "Tres".
		Map<Integer, String> englishToSpanishNums = new TreeMap<>();
		englishToSpanishNums.put(1, "Uno");
		englishToSpanishNums.put(2, "Dos");
		englishToSpanishNums.put(3, "Tres");
		return englishToSpanishNums;
	}
	
	public static int lift(List<String> list) {
		//modify list by replacing every element in the list with
		//an ALL CAPS version.
		//return the length of the list.
		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i).toUpperCase());
		}
		return list.size();
	}
	
	public static boolean takeItAway(Map<String, String> stringMap, String str) {
		//modify map parameter by removing the key that matches the second parameter.
		//return true if the key had been in the original map.
		//return false if the key was not in the original map.
		boolean result = stringMap.containsKey(str);
		stringMap.remove(str);
		return result;
	}
	
	public static LinkedList<Double> prependValue(LinkedList<Double> list, double i) {
		//add the double parameter to the beginning of the list
		//return the updated linkedlist
		list.add(0, i);
		return list;
	}
	
	public static Set<String> listToSet(List<String> list) {
		//return new Set of Strings that contains all elements from the list.
		//NOTE: if there were duplicates, they will only appear in the Set once.
		Set<String> stringSet = new HashSet<String>();
		for (int i = 0; i < list.size(); i++) {
			stringSet.add(list.get(i));
		}
		return stringSet;
	}
	
	public static int catchThis(String str1, String str2, String str3) {
		//attempt to convert the Strings to ints
		//if it fails, catch the exception and return 0, otherwise
		//add the converted ints together and return the value.
		int sum = 0;
		try {
			sum += Integer.parseInt(str1);
			sum += Integer.parseInt(str2);
			sum += Integer.parseInt(str3);
		} catch (NumberFormatException e) {
			return 0;
		}
		return sum;
	}

	public static String[] getFirstWords(String str1, String str2, String str3) {
		String[] sentence1 = str1.split(" ");
		String[] sentence2 = str2.split(" ");
		String[] sentence3 = str3.split(" ");
		String[] firstWords = {sentence1[0], sentence2[0], sentence3[0]};
		return firstWords;
	}
	
	public static int howFarApart(List<String> strList, String str1, String str2) {
		if (!strList.contains(str1) || !strList.contains(str2)) {
			throw new IllegalArgumentException("must contain both strings");
		}
		return strList.indexOf(str2) - strList.indexOf(str1);
	}
	
	public static double makeADifference(double[] dubs, int index1, int index2) {
		try {
			return dubs[index1] - dubs[index2];
		} catch (ArrayIndexOutOfBoundsException e) {
			return 0;
		}
	}
	
	public static Set<Integer> neverTellMeTheOdds(int[] nums) {
		Set<Integer> result = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				result.add(nums[i]);
			}
		}
		return result;
	}
	
	public static int fleeZero(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				result++;
				nums[i] += 1;
			}
			if (nums[i] < 0) {
				nums[i] -= 1;
			}
		}
		return result;
	}

	public static ArrayList<Character> updateList(ArrayList<Character> chars, char n) {
		if (!chars.contains(n)) {
			chars.add(n);
		}
		return chars;
	}
	
}