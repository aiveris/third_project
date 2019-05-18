import java.util.Random;

public class Randomise {
    public static void main(String[] args) {
        for(int i=0; i<=10; i++){
            Random rnd = new Random();
            int x=rnd.nextInt(16);
            System.out.print(x+" ");
        }
    }
}