package orientation;

public class Person {

	static int wallet = 0;
	private String name;
	private int age;

	Person(String name,int age) {

		this.name = name;
		this.age = age;

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

	public void myProfile() {
		System.out.println("私の名前は"+this.name+"です。");
		System.out.println("私の年齢は"+this.age+"です。");
		System.out.println("よろしくお願いします。");
	}

}
