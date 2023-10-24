package Day11;

public class LongestSameString {
	public static void main(String[] args) {
		String[] strings = {"flower", "flow", "flight"};
//		String[] strings = {"dog", "racecar", "car"};
		String result = longestSameString(strings);
		System.out.println("Longest Same String: " + result);
	}
	
	public static String longestSameString(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}
		
		int minLength = Integer.MAX_VALUE;
		for (String str: strs) {
			minLength = Math.min(minLength, str.length());
		}
		
		String commonPrefix = new String();
		
		for (int i = 0; i < minLength; i++) {
			char currentChar = strs[0].charAt(i);
			boolean isCommon = true;
			
			for (int j = 1; j < strs.length; j++) {
				if (strs[j].charAt(i) != currentChar) {
					isCommon = false;
					break;
				}
			}
			
			if (isCommon) {
				commonPrefix += currentChar;
			}else {
				break;
			}
		}
		
		return commonPrefix.toString();
	}
}
