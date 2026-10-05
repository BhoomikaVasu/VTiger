package practice;

class A{
	void m1() {
		System.out.println("A");
	}
}

class B extends A{
	
	@Override
	void m1() {
		System.out.println("B");
	}
}

public class Demo {

	public static void main(String[] args) {

		A b = new B();
		b.m1();
	}

}
