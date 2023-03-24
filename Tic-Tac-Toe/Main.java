class TicTacToe{
	 static char[][] board;
	 public TicTacToe() {
		 board= new char[3][3];
		 initBoard();
	 }
	 
	 void initBoard() {
		 for(int i=0; i<board.length; i++) {
			 for(int j=0; j<board[i].length; j++) {
				 board[i][j]= ' ';
			 }
		 }
	 }
	 
	 static void display() {
		 System.out.println("-------------");
		 for(int i=0; i<board.length; i++) {
			 System.out.print("| ");
			 for(int j=0; j<board[i].length; j++) {
				 System.out.print(board[i][j]+ " | ");
			 }
			 System.out.println();
			 System.out.println("-------------");
		 }
	 }
	 
	 static void placeMark(int row, int col, char mark) {
		if(row>=0 && row<=2 && col>=0 && col<=2) {
			 board[row][col]= mark;
			
		}
		else {
			System.out.println("invalid input");
		}
	 }
	 
	static boolean checkColWin() {
		 for(int j=0; j<3; j++) {
			 if((board[0][j]!= ' ' && board[0][j]==board[1][j]) && (board[1][j]==board[2][j])) {
				 return true;
			 }
		 }
		 return false;
	 }
	 
	 static boolean checkRowWin() {
		 for(int i=0; i<3; i++) {
			 if((board[i][0]!= ' ' && board[i][0]==board[i][1]) && (board[i][1]==board[i][2])) {
				 return true;
			 }
		 }
		 return false;
	 }
	 
	static boolean checkDiagonalWin() {
		 if((board[0][0]!= ' ' && board[0][0]==board[1][1]) && (board[1][1]==board[2][2])
				 || (board[0][2]!= ' ' && board[0][2]==board[1][1]) && (board[1][1]==board[2][0])) {
			 return true;
		 }
		 return false;
	 }
	
	static boolean checkDraw() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(board[i][j]==' ') {
					return false;
				}
			}
		}
		return true;
	}
	 
	 
}
public class LaunchGame {

	public static void main(String[] args) {
		TicTacToe t= new TicTacToe();
        HumanPlayer p1= new HumanPlayer("Bob", 'X');
        HumanPlayer p2= new HumanPlayer("Priya", 'O');
//        ComputerPlayer p2= new ComputerPlayer("Priya", 'O');
        
        Player currPlayer;
        currPlayer=p1;
        
        
        while(true) {
        	
        	System.out.println(currPlayer.name+" turn");
            currPlayer.makeMove();
            TicTacToe.display();
            if(TicTacToe.checkColWin() || TicTacToe.checkRowWin() || TicTacToe.checkDiagonalWin()) {
            	System.out.println(currPlayer.name+" has won");
            	break;
            }
            else if(TicTacToe.checkDraw()) {
            	System.out.println("MATCH DRAWN");
            	break;
            }
            else {
            	if(currPlayer==p1) {
            		currPlayer=p2;
            	}
            	else {
            		currPlayer= p1;
            	}
            }
        }
        
        

	}

}
