abstract class Car {
    Car() {
        System.out.println("Car is created");
    }

    abstract void run();

    void changeGear() {
        System.out.println("gear changed");
    }
}

class Audi extends Car {
    void run() {
        System.out.println("running safely..");
    }
}

class TestAbstraction {
    public static void main(String args[]) {
        Car obj = new Audi();
        obj.run();
        obj.changeGear();
    }
}