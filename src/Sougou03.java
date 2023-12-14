
public class Sougou03 {

	public static void main(String[] args) {
		
		int x [] = new int [20];
		
		for (int i = 0; i < x.length; i++) {
			if (i < 19) {
				System.out.print(i * 5 + ",");
			} else {
				System.out.print(i * 5);
			}
			
		}

	}

}

//次の手順でプログラムLv0248．javaを作成しなさい。
//①整数型の配列を宣言して下さい。要素数は20個です。
//②宣言した配列に0から5ずつ加算して代入してください。(※１)
//③配列をすべて表示してください。
//※１）
//配列の0番目から順に、「0，5，10，15，・・・」といったように代入します。
