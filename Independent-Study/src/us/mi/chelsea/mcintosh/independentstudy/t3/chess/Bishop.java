package us.mi.chelsea.mcintosh.independentstudy.t3.chess;

public class Bishop extends ChessPiece {
	public Bishop(int team) {
		super(team);
	}
	
	public String getSymbol() {
		return (getTeam() == 0 ? "W" : "B") + "B";
	}
	
	public boolean validMove(int rank, int file) {
		int absRank = Math.abs(rank);
		int absFile = Math.abs(file);
		
		return absRank == absFile && absRank > 0;
	}
}
