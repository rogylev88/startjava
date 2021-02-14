public class Cycle {
    public static void main(String[] args) {
        for(int i = 0; i < 21; i++ ) {
            System.out.println(i);
        }
        int a = -6;
        while(a < 7) {
            System.out.println(a);
            a += 2;
        }
        int i = 1;
        int result = 10;
        int sum = 0;
        do {
            result = result + i;
            if(result % 2 == 0){
            } else {
                sum = sum + result;
            }
            } while (result < 20);
            System.out.println("11+13+15+17+19= " + sum);
        }
    }
