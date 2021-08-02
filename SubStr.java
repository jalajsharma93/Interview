/*Given a string, find the length of the longest substring without repeating characters.
Full description at https://leetcode.com/problems/longest-substring-without-repeating-characters/
Examples:
Input: "pwwkew"
Output: 3 (the substring "wke" or "kew")
Input: "abcabcbb"
Output: 3 (the substring "abc" or "bca" or "cab")
Input: "bbbbb"
Output: 1 (the substring "b")
*/
import java.util.*;
class SubStr{
	public static void main (String args[]){
		String input = "pwwkew";
		System.out.println("Largest Sub string lenght: "+SubString(input));
	}
	public static int SubString(String input){
		int result = 0;
		int len = input.length();
		for(int i=0;i<len;i++){
			Set<Character> set = new HashSet<Character>();
			set.add(input.charAt(i));
			int temp=1;
			for(int j=i+1;j<len;j++){
				char ch = input.charAt(j);
				if(set.contains(ch)){
					break;
				}else{
					set.add(ch);
					temp++;
				}
				if(temp>result){
					result=temp;
				}
			}
		}
		return result;
	}
}