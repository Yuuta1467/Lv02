
public class Sougou06 {
	
	public static void main(String[] args) {
		
		for(int y = 1; y <= 9; y++) {
			for (int x = 1; x <= 9; x++) {
				System.out.println(y + " ×️ " + x + " = " + y * x);
				if(x == 9) {
					System.out.println();
				}
			}
		}
		
	}
	
}

//1 ×　1　＝　1
//1 ×　2　＝　2
//…
//○2の段
//2 ×　1　＝　2
//2 ×　2　＝　4
//…
//9 × 8 ＝　72
//9 ×　9　＝　81
//と表示するプログラムLv0251.javaを作成しなさい。