import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
public class Randomise3 {
    public static void main(String[] args) {
        int iteration = 0;
        int baseStart = (int) 'a';
        int baseEnd = (int) 'h';
        int baseRange = baseEnd - baseStart;
        int[] card = new int[baseRange];
        int i = 0;
        Random rnd = new Random();
        while (i < baseRange) {
            iteration++;
            System.out.print("[" + iteration + "]: ");
            int num = rnd.nextInt(baseRange + 1) + baseStart;
            boolean contains = IntStream.of(card).anyMatch(x -> x == num);
            if (contains) {
                System.out.println("NO to: " + num);
            } else {
                card[i] = num;
                System.out.println(Arrays.toString(card));
                i++;
            }
        }
        for (i = 0; i < baseRange; i++) System.out.print((char) card[i] + " ");
        // System.out.println("Effectiveness: " + (float) base / iteration * 100 + "%");
    }
}