/*Count Number of vowels in a String case sensitive*/
package com.janani.question3;

import java.util.HashSet;
import java.util.Set;

public class Main {
	static int countVowel(String input) {

		char[] ch = input.toCharArray();
		int count = 0;
		Set<Character> set = new HashSet<>();
		for (char c : ch) {
			set.add(c);
		}
		System.out.println(set);
		for (char c : set) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int count = countVowel("Onion");
		System.out.println(count);
	}
}
