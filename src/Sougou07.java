
public class Sougou07 {

	public static void main(String[] args) {
		
		int max = 10;
		int kmax = max;
		
		if (max % 2 == 0) {
			kmax = max - 1;
		}
		
		for (int i = 1; i <= kmax; i++) {
			if (i % 2 == 1 && i < kmax) {
				System.out.print(i + ",");
			}else if (i % 2 == 1){
				System.out.print(i);
			}
		}

	}

}

//１～１０の間の奇数を表示させるプログラムLv0252.javaを作成しなさい。
//【表示例】
//奇数：1, 3, 5, 7, 9
//※９の後ろにカンマは付きません。
