package pass;

public class Palindrome {

    public String palindrome (String s){
        if(isPalindrome(s.toLowerCase())){
            return s;
        }
        return "";
    }
    
    private static boolean isPalindrome(String s){
        int length = s.length();
        int i = 0;
        while(length/2 > i){
            if((s.charAt(i) == s.charAt(length-i-1)) == false){
                return false;
            }
            ++i;
        }
        return true;
    }
}
