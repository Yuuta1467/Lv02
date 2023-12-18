
public class Sougou10 {

	public static void main(String[] args) {
		
		int x = 50;
		int y = x / 15;
		int j = 1;
		
		for (int i = 1; i <= x; i ++) {
			if (i % 15 == 0 && j != y) {
				System.out.print(i + ",");
				j++;
			} else if (i % 15 == 0) {
				System.out.print(i);
			}
		}
		
	}

}

//１～5０の間の 3 と 5 の公倍数と最大公倍数を表示させるプログラムLv0255.javaを作成しなさい。
//【表示例】
//公倍数:15,30,45
//最大公倍数:45
//※公倍数の45の後ろにカンマは付きません。