
public class Sougou13 {

	public static void main(String[] args) {
		
		System.out.println("-----掛け算九九表--------------");
		for (int x = 0; x <= 9; x++) {
			if (x == 0) {
				System.out.print("|  ");
			} else {
				System.out.print(x + " ");
			}
			
		}
		System.out.println();
		System.out.print("| -----------------------------");
		for (int x = 0; x <= 9; x++) {
			for (int y = 0; y <= 9; y++) {
				if (y == 0 && x != 0) {
					System.out.print("| ");
				} else if (x * y < 10 && x != 0){
					System.out.print("0" + x * y + " ");
				} else if (x != 0){
					System.out.print(x * y + " ");
				}
			}
			System.out.println();
		}

	}

}

//+-----掛け算九九表--------------
//|　　　1 2 3 4 5 6 7 8 9
//| -----------------------------
//|　1| 01 02 03 04 05 06 07 08 09
//|　2| 02 04 06 08 10 12 14 16 18
//|　3| 03 06 09 12 15 18 21 24 27
//|　4| 04 08 12 16 20 14 28 32 36 と表示するプログラムLv0258.javaを作成しなさい。
//|　5| 05 10 15 20 25 30 35 40 45
//|　6| 06 12 18 24 30 36 42 48 54
//|　7| 07 14 21 28 35 42 49 56 63
//|　8| 08 16 24 30 38 46 56 64 72
//|　9| 09 18 27 36 45 54 63 72 81
