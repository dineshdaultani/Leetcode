package string;

public class HammingDistance {

	public int hammingDistance(int x, int y) {
		int distance = 0;
        int power_2 = 1;
        int rem_x, rem_y;
        while(x > 0 || y > 0)
        { 
            rem_x = x % power_2;
            rem_y = y % power_2;
            x = x / power_2;
            y = y / power_2;
            
            if(rem_x != rem_y)
                distance++;
            power_2 = power_2 * 2;
        }
        
        
	    return distance;
	}
	public static void main(String[] args) {
		HammingDistance hd = new HammingDistance();
		System.out.println(Math.pow(2,22));
		int x = 680142203, y = 1111953568;
		System.out.println(hd.hammingDistance(x, y));
		
	}

}
