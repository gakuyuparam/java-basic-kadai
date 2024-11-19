package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	String enemys[] = {"r","s","p"};
	
	 static HashMap<String, String> jankenss;

	 Jyanken_Chapter26(){
		 jankenss = new HashMap<>();
		 jankenss.put("r","グー");
		 jankenss.put("s","チョキ");
		 jankenss.put("p","パー");
	 }
	 Scanner scanner = new Scanner(System.in);
	 
	//自分のじゃんけんの手を入力する
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		String janken = scanner.next();
		return janken;
	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		int enemy = (int)Math.floor(Math.random() * 3);
		return enemys[enemy];
	}
	
	//じゃんけんを行う
	public void playGame(String janken,String ejanken) {
		System.out.println("自分の手は" + jankenss.get(janken));
		System.out.println("相手の手は" + jankenss.get(ejanken));
		if(janken.equals(ejanken)) {
			System.out.println("あいこです");
		}else if(janken.equals("r") && ejanken.equals("s")|| janken.equals("p") && ejanken.equals("r") || janken.equals("s") && ejanken.equals("p")) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
		
		
	}

}
