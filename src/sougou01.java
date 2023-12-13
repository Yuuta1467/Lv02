
public class sougou01 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			if(i % 6 == 0 && i <= 95) {
				System.out.print(i + ",");
			}else if (i % 6 == 0){
				System.out.print(i);
			}
		}

	}

}

//以下の条件を満たす整数をすべて表示させるプログラムLv0246．javaを作成しなさい。
//①1～100までの整数である。
//②3の倍数である。
//③偶数である。
