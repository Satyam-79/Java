class Calculators {
    public int Add(int x, int y, int z) {
        return x + y + z;
    }

    public int Add(int x, int y) {
        return x + y;
    }

    public float Add(float x, float y, float z) {
        return x + y + z;
    }

    public float Add(float x, float y) {
        return x + y;
    }
}

class Calc {
    public static void main(String[] args) {

        Calculators obj1 = new Calculators();
        System.out.println(obj1.Add(5, 6));
        System.out.println(obj1.Add(1, 3, 9));
        System.out.println(obj1.Add(5.3f, 6.9f));
        System.out.println(obj1.Add(5.3f, 6.9f, 9.4f));

    }
}