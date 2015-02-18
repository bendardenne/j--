package pass;

public class Palindrome {
	public String palindrome (String s){
		if(isPalindrome(s)){
			return s;
		}
		return "";

    }
	public static boolean isPalindrome(String s){
		if(s.length()<=1){
			return true;
		}
		String s1 = s.substring(0, 1);
		String s2 = s.substring(s.length()-1,s.length());
		if(s1.equalsIgnoreCase(s2)){
			return isPalindrome(s.substring(1,s.length()-1));
		}
		return false;
	}

}
