public class Reduce {
    public static void main(String[] args) {
        System.out.println(reduceNumber(100));
    }

    public static int reduceNumber(int n){
        int counter = 0;
        while (n > 0){
            if (n % 2 == 0){
                n = n/2;
            }
            else{
                n--;
            }
            counter++;
    }
        return counter;
    }
}
