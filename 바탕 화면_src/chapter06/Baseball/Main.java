package chapter06.Baseball;

public class Main {

	public static void main(String[] args) {
		String check = "";
		BaseballGame game = new BaseballGame();
		
		do {
			check = game.check();
			
		}while(check!="WIN");

	}

}
