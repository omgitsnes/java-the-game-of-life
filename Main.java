
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameBoard b = new GameBoard(10, 10);
		b.fill(1, 1);
		b.fill(9, 9);
		b.showBoard();
		try {
			while(true) {
				Thread.sleep(1000);
				b.triggerFill();
				b.showBoard();
			}
	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
