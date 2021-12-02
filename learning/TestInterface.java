interface Interface {
    void print();
}

interface Showable extends Interface {
    void show();
}

class TestInterface implements Showable {
    public void print() {
        System.out.println("Test");
    }

    public void show() {
        System.out.println("Interface");
    }

    public static void main(String args[]) {
        TestInterface obj = new TestInterface();
        obj.print();
        obj.show();
    }
}