class showMethod {
	void callme() {
		System.out.println("Parent class invoked");
	}
}

class diffMethod extends showMethod {
	void callme() {
		System.out.println("Child method invoked");
	}
}

class Dispatch {
	public static void main(String args[]) {
		showMethod obj = new showMethod();
		diffMethod obj1 = new diffMethod();
		showMethod obj2;
		obj2 = obj;
		obj2.callme();
		obj2 = obj1;
		obj2.callme();
	}
}