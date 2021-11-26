package Recursion;

public class ReverseOfString {
    public String isReverse(String s){
        if(s.length()==0){
            return "None";
        }
        if(s.length()==1){
            return s;
        }
        return s.charAt(s.length()-1)+isReverse(s.substring(0,s.length()-1));
    }

    public static void main(String[] args) {
        ReverseOfString r1 = new ReverseOfString();
        System.out.println(r1.isReverse("ABCD"));
        System.out.println(r1.isReverse("a"));
        System.out.println(r1.isReverse("Sudeep"));
    }
}
