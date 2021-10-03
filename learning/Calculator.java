class intAddition {
    private int a;
    private int b;
    private int c;

    public intAddition(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    public intAddition(int x, int y) {
        a = x;
        b = y;
        c = 0;
    }

    void add() {
        System.out.println("value a:" + a);
        System.out.println("value b:" + b);
        if (c != 0) {
            System.out.println("value c:" + c);
        }
        int d = a + b + c;
        System.out.println("Addition:" + d);
        System.out.println(" ");

    }
}

class floatAddition {
    private float a;
    private float b;
    private float c;

    public floatAddition(float x, float y, float z) {
        a = x;
        b = y;
        c = z;
    }

    public floatAddition(float x, float y) {
        a = x;
        b = y;
        c = 0.0f;
    }

    void add() {
        System.out.println("value a:" + a);
        System.out.println("value b:" + b);
        if (c != 0.0) {
            System.out.println("value c:" + c);
        }
        float d = a + b + c;
        System.out.println("Addition:" + d);
        System.out.println(" ");

    }
}

class Calculator {
    public static void main(String[] args) {

        intAddition obj1 = new intAddition(3, 4);
        intAddition obj2 = new intAddition(5, 6, 7);
        obj1.add();
        obj2.add();
        floatAddition obj3 = new floatAddition(5.4f, 6.3f);
        floatAddition obj4 = new floatAddition(5.4f, 6.8f, 7.2f);
        obj3.add();
        obj4.add();
    }
}