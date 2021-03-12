public class Wolf {

    private boolean male = true;
    private String nickName = "Snoopy";
    private int age = 15;
    private int weight = 70;
    private String color = "grey";

    public boolean getMale() {
        return male;
    }

    void setMale(boolean male) {
        this.male = male;
    }

    public String getNickName() {
        return nickName;
    }

    void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else {
        this.age = age;
        }
    }

    public int getWeight() {
        return weight;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    public void walk() {
    }

    public void sit() {
    }

    public void run() {
    }

    public void howl() {
    }

    public void hunt() {
    }
}