package kadai_026;

public class JyankenExec_Chapter26 extends Jyanken_Chapter26{

	public JyankenExec_Chapter26() {
		super();
	}
	
	public static void main(String[] args) {
		
		Jyanken_Chapter26 janKen =  new Jyanken_Chapter26();
		
		String myHand = janKen.getMyChoice();
		
		String mnHand = janKen.getRandom();
		
		janKen.playGame(myHand,mnHand);
	}

}
