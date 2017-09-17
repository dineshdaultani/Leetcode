package string;

public class DetectCapitalUse {

	public boolean detectCapitalUse(String word) {
        int count_capitals = 0;
        for(int i = 0; i < word.length(); i++){
            if((int)(word.charAt(i)) >= 65 && (int)(word.charAt(i)) <= 90)
                count_capitals++;
        }
        if(count_capitals == 0)
            return true;
        else if(count_capitals == word.length())
            return true;
        else if(count_capitals == 1 && (int)(word.charAt(0)) >= 65 && (int)(word.charAt(0)) <= 90)
            return true;
        else
            return false;
    }
	
	public static void main(String[] args) {
		DetectCapitalUse dcu = new DetectCapitalUse();
		System.out.println(dcu.detectCapitalUse("leetcode"));
		System.out.println(dcu.detectCapitalUse("USA"));
		System.out.println(dcu.detectCapitalUse("FlaG"));
		System.out.println(dcu.detectCapitalUse("tweEt"));
	}
}
