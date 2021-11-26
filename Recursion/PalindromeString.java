package Recursion;

public class PalindromeString {
    public boolean isPalindrome(String s){
        if(s.length()==0){
            return true;
        }
        if(s.length()==1){
            return true;
        }
        if(s.charAt(0)==s.charAt(s.length()-1)){
            return isPalindrome(s.substring(1,s.length()-1));
        }
        return false;
    }

    public static void main(String[] args) {
        PalindromeString p1 = new PalindromeString();
        System.out.println(p1.isPalindrome("raman"));
        System.out.println(p1.isPalindrome("naman"));
    }
}
