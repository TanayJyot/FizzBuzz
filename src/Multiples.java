public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int counter3 = 0;
        while (3*i < 1000){
            counter3 = counter3 + 1;
            i++;
        }
        int j = 1;
        int counter5 = 0;
        while (5*j < 1000){
            counter5 = counter5 + 1;
            j++;
        }
        System.out.println(counter5 + counter3);

    }
}
