package standardClass;

public class task5 {

	public static void main(String[] args) {

		int cat = 0;
		int mouse = 0;

		String str = "cat_mouse_mouse_cat_cat";
		String[]array = str.split("_");

		for(int i = 0; i <= array.length-1; i++) {
			if(array[i].contains("cat")) {
				cat++;
			}else if(array[i].contains("mouse")) {
				mouse++;
			}
		}

		if(cat > mouse) {
			System.out.println("catの方が多い");
		}else if(cat < mouse) {
			System.out.println("mouseの方が多い");
		}

	}
}




