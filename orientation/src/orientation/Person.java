package orientation;

public class Person {

	static int wallet = 0;
	String name;
	int age;

	Person(String name,int age) {

		this.name = name;
		this.age = age;

		System.out.println("私の名前は" + this.name + "です。");
		System.out.println("私の年齢は" + this.age + "です。");
		System.out.println("よろしくお願いします。");

	}

	public String getname() {
		return this.name;
	}

	public void setname(String setname) {
		this.name = setname;
	}

	public int getage() {
		return this.age;
	}

	public void setage(int setage) {
		this.age = setage;
	}


	Person(int wallet){

		this.wallet += wallet;

	}


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Person task1 = new Person("小川　健朔",26);

	}
}
