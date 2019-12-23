import java.util.Scanner;

class Sample3 {

public static void main(String[] args){
	System.out.print("標準出力");
	System.out.print("printは改行されない");
	System.out.println();
	System.out.println("printlnは出力後に改行");
	
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println("受け取った数字:"+num);
    sc.close();
    }
}
