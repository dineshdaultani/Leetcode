package string;

public class JudgeRouteCircle {

	public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for(char move: moves.toCharArray()){
            if( move == 'L' )
                x = x - 1;
            else if(move == 'R')
                x = x + 1;
            else if(move == 'U')
                y = y + 1;
            else if(move == 'D')
                y = y - 1;
            else 
                return false;
        }
        if(x == 0 && y == 0)
            return true;
        else 
            return false;
    }
	
	public static void main(String[] args) {
		JudgeRouteCircle jrc = new JudgeRouteCircle();
		System.out.println(jrc.judgeCircle("UD"));

	}

}
