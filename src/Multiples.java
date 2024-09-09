import java.util.ArrayList;

public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int counter3 = 0;
        ArrayList<Integer> multiples3 = new ArrayList<>();
        while (3*i < 1000){
            multiples3.add(3 * i);
            counter3 = counter3 + 1;
            i++;
        }
        int j = 1;
        int counter5 = 0;
        while (5*j < 1000){
            if (!multiples3.contains(5*j)){
                counter5 = counter5 + 1;
            }
            j++;
        }
        System.out.println(counter5 + counter3);

    }
}
