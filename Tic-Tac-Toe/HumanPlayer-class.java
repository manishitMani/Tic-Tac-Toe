public class HumanPlayer extends Player {
   
    
    HumanPlayer(String name, char mark){
    	this.name= name;
    	this.mark= mark;
    }
    
    void makeMove() {
    	Scanner sc= new Scanner(System.in);
    	int row,col;
    	do {
    		 row= sc.nextInt();
        	 col= sc.nextInt();
        	
    	}
    	while(!isValidMove(row, col));
    	TicTacToe.placeMark(row, col, mark);
    	
    }
    
    
}
