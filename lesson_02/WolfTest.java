public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        System.out.println(wolfOne.male);
        System.out.println(wolfOne.nickName);
        System.out.println(wolfOne.age);
        System.out.println(wolfOne.weight);
        System.out.println(wolfOne.color);
        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}