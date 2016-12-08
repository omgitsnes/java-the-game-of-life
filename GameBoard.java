import java.lang.reflect.Array;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.ConsoleHandler;

public class GameBoard {
	private String[][] board;
	private int length;
	private int height;
	
	public GameBoard(int x, int y) {
		super();
		this.length = x;
		this.height = y;
		this.board = new String[x][y];
		emptyBoard();
	}
	
	public void triggerFill() {
		fillBoard();

	}
	
	private void fillBoard() {
		for (int j = 0; j < this.height; j++) {
			for (int i = 0; i < this.length; i++) {
				if (this.board[i][j] == "x") {
					Random a = new Random();
					int x,y;
					do {
						x = i + (a.nextInt() % 3) -1;
						y = j + (a.nextInt() % 3) -1;
					} while (!(x >= 0 && x < this.length && y >= 0 && y < this.height));
					fill(x, y);
				}
			}
			
		}
	}

	private void emptyBoard() {
		for (int j = 0; j < this.height; j++) {
			for (int i = 0; i < this.length; i++) {
				this.board[i][j] = " ";
			}			
		}
	}

	public void fill(int x, int y)
	{
		this.board[x][y] = "x";
	}
	
	public void showTile(int x, int y)
	{
		System.out.println("Board[" + x + "][" + y +"] = " + this.board[x][y]);
	}
	
	public void showBoard()
	{
		for (int j = 0; j < this.height; j++) {
			for (int i = 0; i < this.length; i++) {
				System.out.print(" " + this.board[i][j] + " ");
				
			}			
			System.out.println("");
		}
	}
	
}
