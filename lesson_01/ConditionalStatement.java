public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 22;
        if(age > 20) {
        System.out.println("возраст больше 20");
}
        boolean male = true;
        if (male == true) {
        System.out.println("пол мужской");
}
        boolean female = false;
        if(female != true) {
        System.out.println("пол немужской");
}
        double height = 1;
        if(height < 1.80) {
        System.out.println("рост меньше 1.8м");
}
        else {
        System.out.println("рост больше 1.8м");
}

        char letterName = 'M';
        if(letterName == 'M') {
        System.out.println("Первая буква имени M");
}
        else if(letterName == 'I') {
        System.out.println("Первая буква имени I");
}
        else {
        System.out.println("иная буква");
}
}
}