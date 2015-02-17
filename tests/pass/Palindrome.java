package pass;

public class Palindrome {
    
	public String palindrome (String s){
		if(isPalindrome(s.toLowerCase())){
			return s;
		}
		return null;
    }
	private static boolean isPalindrome(String s){
		int length = s.length();
		for(int i=0; i<length/2;i++){
			if(s.charAt(i) != s.charAt(length-i-1)){
				return false;
			}
		}
		return true;
	}
}
