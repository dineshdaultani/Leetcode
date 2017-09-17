package string;

public class Rev_String {
    public String reverseString(String s) {
        String str = "";
        for (int i = s.length() - 1; i >=0; i--){
        	str += s.charAt(i);
        }
        return str;
    }
    
    public static void main(String args[]){
    	Rev_String rev = new Rev_String();
    	System.out.println(rev.reverseString("Hello"));

    }
}
