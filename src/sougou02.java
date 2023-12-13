
public class sougou02 {
	
	public static void main(String[] args) {
		
		String [] name = new String [5];
		int [] size = new int [5];
		
		name[0] = "Aくん";
		name[1] = "Bくん";
		name[2] = "Cくん";
		name[3] = "Dくん";
		name[4] = "Eくん";
		
		size[0] = 160;
		size[1] = 170;
		size[2] = 165;
		size[3] = 166;
		size[4] = 164;
		
		for (int i = 0; i < name.length; i++) {
			if (size[i] >= 165) {
				System.out.println(name[i] + "くんの身長は" + size[i] + "です。");
			}
		}
	}

}

//次の手順のプログラムLv0247．javaを作成しなさい。
//①文字列型と整数型の配列を宣言する。
//②宣言した配列に5個の配列要素を確保します。
//③文字列型の配列要素に『Aくん』『Bくん』『Cくん』『Dくん』『Eくん』を格納します。
//④整数型の配列要素に『160』『170』『165』『166』『164』を格納します
//⑤身長が165cm以上の人のみ表示しなさい
//ただし、表示は以下の様にしなさい。
//例）『Bくんの身長は170cmです』