
public class Sougou12 {

	public static void main(String[] args) {
		
		int max = 100;
		int x = max / 30;
		int y = 29 / 30;
		int j = x - y;
		int a = 1;
		for (int i = 30; i <= max; i++) {
			if (i % 30 == 0 && a != j) {
				System.out.print(i + ",");
				a++;
			} else if (i % 30 == 0) {
				System.out.println(i);
			}
		}

	}

}
//以下の条件を満たす整数を表示するプログラムLv0257.javaを作成しなさい。
//① ３０～８０の数字である
//② 3の倍数である。
//③ １０の倍数である。