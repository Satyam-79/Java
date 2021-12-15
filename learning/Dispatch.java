class Parent {
	void callme() {
		System.out.println("Parent class invoked");
	}
}

class Child extends Parent {
	void callme() {
		System.out.println("Child method invoked");
	}
}

class Dispatch {
	public static void main(String args[]) {
		Parent pt = new Parent();
		Child ch = new Child();
		pt.callme();
		pt = ch;
		pt.callme();
	}
}