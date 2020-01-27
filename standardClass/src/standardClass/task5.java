package standardClass;

public class task5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int CatCount = 0;
		int MouseCount = 0;

		String CatorMouse = "cat_mouse_mouse_cat_cat";
		String[]array = CatorMouse.split("_");

		for(int i = 0; i <= array.length-1; i++) {
			if(array[i].contains("cat")) {
				CatCount++;
			}else if(array[i].contains("mouse")) {
				MouseCount++;
			}
		}

		if(CatCount > MouseCount) {
			System.out.println("catの方が多い");
		}else if(CatCount < MouseCount) {
			System.out.println("mouseの方が多い");
		}

	}
}




