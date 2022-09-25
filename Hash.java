package InterviewCodes;

import java.util.HashMap;

public class Hash {
	public static void main(String[] args) {

		String s = "vitesh";

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		char[] ch = s.toCharArray();

		for (char c : ch) {

			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);

			}

		}

		System.out.print(hm);
	}
}
