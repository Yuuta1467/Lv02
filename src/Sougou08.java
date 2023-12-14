
public class Sougou08 {
	
	public static void main(String [] args) {
		
		int max = 20;
		int SanMax = max;
		
		if (max % 3 == 1) {
			SanMax = max - 1;
		} else if (max % 3 == 2) {
			SanMax = max - 2;
		}
		
		for (int i = 1; i <= SanMax; i++) {
			if (i % 3 == 0 && i != SanMax) {
				System.out.print(i + ",");
			} else if (i % 3 == 0) {
				System.out.print(i);
			}
		}
		
	}

}

//１～２０の間の３の倍数を表示させるプログラムLv0253.javaを作成しなさい。
//【表示例】
//３の倍数：3, 6, 9, 12, 15, 18
//※18の後ろにカンマは付きません。