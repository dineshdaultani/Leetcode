package string;

public class Rev_String {
    public String reverseString(String s) {
        StringBuilder str = new StringBuilder(s);
        return str.reverse().toString(); 
    }
    
    public static void main(String args[]){
    	Rev_String rev = new Rev_String();
    	System.out.println(rev.reverseString("Hello"));

    }
}
