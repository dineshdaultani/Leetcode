package string;

public class HammingDistance {

	public int hammingDistance(int x, int y) {
		String str_x = String.format("%31s", Integer.toBinaryString(x)).replace(" ", "0");
	    String str_y = String.format("%31s", Integer.toBinaryString(y)).replace(" ", "0");
	    int distance = 0;
	    
	    int index_x = str_x.length() - 1, index_y = str_y.length() - 1;
	    
	    while(index_x >= 0 && index_y >= 0){
	    	if(str_x.charAt(index_x) != str_y.charAt(index_y))
	    		distance++;
	    	index_x--; index_y--;
	    }
	    
	    for(int i = index_x; i >= 0; i--){
	    	if(str_x.charAt(i) == 1)
	    		distance++;
	    }
	    for(int j = index_y; j >= 0; j--){
	    	if(str_y.charAt(j) == 1)
	    		distance++;
	    }	
	    return distance;
	}
	public static void main(String[] args) {
		HammingDistance hd = new HammingDistance();
		
		int x = 680142203, y = 1111953568;
		System.out.println(hd.hammingDistance(x, y));
		
	}

}
