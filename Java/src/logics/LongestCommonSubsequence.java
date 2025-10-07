package logics;

public class LongestCommonSubsequence {

	public static String LCS(String str[]) {
		if (str == null || str.length == 0)
			return "";
		String common = str[0];
		for (int i = 1; i < str.length; i++) {
			while (!common.startsWith(str[i])) {
				common = common.substring(0, common.length() - 1);
				if (common.isEmpty())
					return "";
			}
		}
		return common;
	}

	public static void main(String[] args) {
		String str[] = { "flight", "flower", "flow" };
		System.out.println(LCS(str)); // Output: "f1"
	}
}

//
// public class LongestCommonSubsequence {
//
// public static String LongestCommonPrefix(String str[]) {
// if (str == null || str.length == 0)
// return "";
// String common = str[0];
// for (int i = 1; i < 3; i++) {
// while (!common.startsWith(str[i])) {
// common = common.substring(0, common.length() - 1);
// }
// if (common.isEmpty()) {
// return "";
// }
// }
// return common;
// }
//
// public static void main(String[] args) {
// String str[] = { "flight", "flower", "flow" };
// System.out.println(LongestCommonPrefix(str));
// }
// }