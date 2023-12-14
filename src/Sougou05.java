
public class Sougou05 {

	public static void main(String[] args) {
		
		int x [] = new int [20];
		int ksum = 0;
		int gsum = 0;
		
		for (int i = 0; i < x.length; i++) {
			if (i % 2 == 1 && i < 9) {
				System.out.print(i * 5 + ",");
				ksum += i * 5;
			}else if (i % 2 == 1 && i <= 9 && i < 11) {
				System.out.print(i * 5);
				ksum += i * 5;
			}
		}	
		
		System.out.println();
			
		for (int i = 0; i < x.length; i++) {
			if (i >= 11 && i < 18 && i % 2 == 0) {
				System.out.print(i * 5 + ",");
				gsum += i * 5;
			}else if (i % 2 == 0 && i == 18) {
				System.out.print(i * 5);
				gsum += i * 5;
			}
		}
		System.out.println();
		System.out.println(ksum);
		System.out.println(gsum);
	}

}

//問４で作成した配列を使用し、次の手順でプログラムLv0250．javaを作成しなさい。
//①配列[ 0 ]～[ 10 ]の値の奇数の加算結果を表示しなさい。
//②配列[ 11]～[ 19 ]の値の偶数の加算結果を表示しなさい。
//ただし、表示は以下のようにすること
//例）『配列[ 0 ]～[ 10 ]の値の奇数の加算結果は○○です。』
//　　『配列[ 11 ]～[ 19 ]の値の偶数の加算結果は○○です。』