import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord{
    public static void main(String[] args){
        String champion = "";
        int i = 1;

        while (!StdIn.isEmpty()){
            String s = StdIn.readString();
            boolean p = StdRandom.bernoulli(1/(double)i);
            if (p){
                champion = s;
            }
            i++;
        }
        StdOut.println(champion);
    }
}