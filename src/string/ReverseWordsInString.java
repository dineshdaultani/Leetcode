package string;

public class ReverseWordsInString {

	public String reverseWords(String s) {
        String output = "";
        String str_array[] = s.split(" ");
        for(int i = 0 ; i < str_array.length; i++)
            output = output + new StringBuilder(str_array[i]).reverse() + " ";
        return output.substring(0, output.length()-1);
	}

	
	public static void main(String[] args) {
		ReverseWordsInString rwis = new ReverseWordsInString();
		System.out.println(rwis.reverseWords("abc def ghij  klm  n"));

	}

}
