public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setMale(false);
        wolfOne.setNickName("Boooo");
        wolfOne.setAge(9);
        wolfOne.setWeight(71);
        wolfOne.setColor("red");
        System.out.println(wolfOne.getMale());
        System.out.println(wolfOne.getNickName());
        System.out.println(wolfOne.getAge());
        System.out.println(wolfOne.getWeight());
        System.out.println(wolfOne.getColor());
        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}