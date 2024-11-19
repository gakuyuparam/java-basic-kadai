package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	 static HashMap<String, String> humanMap;

	Dictionary_Chapter21() {
			humanMap = new HashMap<>();
			humanMap.put("apple","りんご");
			humanMap.put("peach","桃");
			humanMap.put("banana","バナナ");
			humanMap.put("lemon","レモン");
			humanMap.put("pear","梨");
			humanMap.put("kiwi","キウイ");
			humanMap.put("strawberry","いちご");
			humanMap.put("grape","ぶどう");
			humanMap.put("mascat","マスカット");
			humanMap.put("cherry","さくらんぼ");
		}
		public void searchWord(String words[]) {
		for(String word: words) {
			if(humanMap.containsKey(word)) {
				 System.out.println(word + "の意味は" + humanMap.get(word) + "です");
			}else  {
				System.out.println(word + "は" +  "辞書に存在しません");
			}
		}
	}
}
