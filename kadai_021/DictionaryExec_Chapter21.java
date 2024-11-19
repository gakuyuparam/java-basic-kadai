package kadai_021;

public class DictionaryExec_Chapter21 extends Dictionary_Chapter21{

	public DictionaryExec_Chapter21() {
		super();
	}
	
	public static void main(String[] args) {
		
		DictionaryExec_Chapter21 HumanMap = new DictionaryExec_Chapter21();
		
		
		//調べる単語
		String[] fruit = {"apple","banana","grape","orange"};
		
		//関数の呼び出し
		HumanMap.searchWord(fruit);
	}
	
	

}
