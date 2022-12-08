import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class Test {
    public static void main(String[] args) {
        List<Stack<Character>> list = new ArrayList<>();
        for(int i=0; i<5; i++) {
            list.add(new Stack<>());
        }
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<5; j++)
            {
                list.get(j).push(0,'c');
            }
        }
        out.println(list);
    }
}

