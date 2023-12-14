
public class Sougou04 {

	public static void main(String[] args) {
		
		int x [] = new int [20];
		
		
		for (int i = 0; i < x.length; i++) {
			if (i % 2 == 1 && i < 9) {
				System.out.print(i * 5 + ",");
			}else if (i % 2 == 1 && i <= 9 && i < 11) {
				System.out.print(i * 5);
			}
		}	
		
		System.out.println();
			
		for (int i = 0; i < x.length; i++) {
			if (i >= 11 && i < 18 && i % 2 == 0) {
				System.out.print(i * 5 + ",");
			}else if (i % 2 == 0 && i == 18) {
				System.out.print(i * 5);
			}
		}

	}

}

//問３で作成した配列を使用し、次の手順でプログラムLv0249．javaを作成しなさい。
//ただし、表示は下記のようにする事
//①配列[ 0 ]～[ 10 ]の値の奇数をカンマ区切りで表示しなさい。
//②配列[ 11]～[ 19 ]の値の偶数をカンマ区切りで表示しなさい。
//表示例）
//奇数：5，15，・・・
//偶数：60，70，・・・
//※最後の数字の後ろにはカンマを付けません。
