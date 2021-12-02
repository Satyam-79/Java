package animalspack;

public class Lion {
    private String color;
    private int weight;
    private int age;

    public Lion(String color, int weight, int age) {
        this.color = color;
        this.weight = weight;
        this.age = age;
        System.out.println("color , weight , age is : " + color + " , " + weight + " and " + age);

    }

    public boolean isVegetarian() {
        return false;
    }

    public boolean canClimb() {
        return false;
    }

    public String Sound() {
        return " Roaring";
    }

}
