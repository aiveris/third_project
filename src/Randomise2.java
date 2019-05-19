import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Randomise2 {
    public static void main(String[] args) {
        int[] card = new int[10];
        int i=0;
        while (i<10) {
            Random rnd = new Random();
            int num = rnd.nextInt(9)+65;
            char a = (char) num;
            System.out.println(num + ":" + a + ", ");
            //for randomise boundaries max-min+min ((20-10)+10)
            i++;
        }
    }
}
