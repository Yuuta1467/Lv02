
public class Sougou09 {

	public static void main(String[] args) {

		int max = 20;
		int kMax = max;
		int gMax = max;

		if (max % 2 == 1) {
			gMax = max - 1;
		}

		if (max % 2 == 0) {
			kMax = max - 1;
		}

		System.out.print("奇数:");
		for (int i = 1; i <= kMax; i++) {
			if (i % 2 == 1 && i != kMax) {
				System.out.print(i + ",");
			} else if (i % 2 == 1) {
				System.out.println(i);
			}
		}

		System.out.print("偶数:");
		for (int i = 1; i <= gMax; i++) {
			if (i % 2 == 0 && i != gMax) {
				System.out.print(i + ",");
			} else if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

}

//１～２０の間の奇数と偶数を分けて表示させるプログラムLv0254.javaを作成しなさい。
//【表示例】
//奇数：1, 3, 5, 7, 9, 11, 13, 15, 17, 19
//偶数：2, 4, 6, 8, 10, 12, 14, 16, 18, 20
