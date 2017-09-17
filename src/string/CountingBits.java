package string;

public class CountingBits {

	public int[] countBits(int num) {
        int out[] = new int[num+1];
        for(int i = 0; i <= num; i++)
            out[i] = Integer.bitCount(i ^ 0);
        return out;
    }
	
	public static void main(String[] args) {
		CountingBits cb = new CountingBits();
		int out[] = cb.countBits(100);
		for(int i: out)
			System.out.print(i + " ");
	}
}
