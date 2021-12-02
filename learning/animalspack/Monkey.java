package animalspack;

public class Monkey {
    private String color;
    private int weight;
    private int age;

    public Monkey(String color, int weight, int age) {
        this.color = color;
        this.weight = weight;
        this.age = age;
        System.out.println("Monkey : color, weight, age is : " + color + " , " + weight + " and " + age);

    }

    public boolean isVegetarian() {
        return true;
    }

    public boolean canClimb() {
        return true;
    }

    public String Sound() {
        return " Chatter";
    }

}