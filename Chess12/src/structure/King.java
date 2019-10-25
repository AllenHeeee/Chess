package structure;

import chess.Chess;

public class King extends Cell{

	public King(String cellName, String pieceName, boolean isAlive, int x, int y) {
		super(cellName, pieceName, isAlive, x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean move(int currX, int currY, int tarX, int tarY) {
		// TODO Auto-generated method stub
		if(tarX<8&&tarX>=0&&tarY<8&&tarY>=0) {
			if(Math.abs(tarX-currX)<=1&&Math.abs(tarY-currY)<=1) {
				if(!(tarX==currX&&tarY==currY)) {
					if(Chess.board[tarX][tarY].pieceName.charAt(0)!=Chess.board[currX][currY].pieceName.charAt(0)) {
						jump(currX, currY, tarX, tarY);
						return true;
					}
				}
			}
		}
		return false;
	}

}
