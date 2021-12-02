import animalspack.*;

class VandalurZoo {

    public static void main(String args[]) {

        Lion l = new Lion("brownish yellow", 254, 3);
        System.out.println(l.isVegetarian() ? "yes,is vegetarian" : "non-vegetarian");
        System.out.println(l.canClimb() ? "yes, can climb" : "no can't climb");
        System.out.println("Lion Sound :" + l.Sound());

        Monkey m = new Monkey("brown", 25, 9);
        System.out.println(m.isVegetarian() ? "yes, is vegetarian" : "non-Vegetarian");
        System.out.println(m.canClimb() ? "yes,can climb" : "no, can't  climb");
        System.out.println("Monkey Sound :" + m.Sound());

    }
}