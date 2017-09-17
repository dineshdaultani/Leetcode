package string;

public class LengthOfLastWord {

	public int lengthOfLastWord(String s) {
		String str[] = s.split(" ");
        if(str.length > 0)
            return str[str.length - 1].length();
        else
            return 0;
	}
	
	public static void main(String[] args) {
		LengthOfLastWord llw = new LengthOfLastWord();
		String s = "jgjg jghkhjg kjjjhkjh   ";
		System.out.println(llw.lengthOfLastWord(s));
	}

}
