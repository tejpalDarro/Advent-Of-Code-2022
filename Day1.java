import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class Day1
{
    public static void main(String[] arg) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
        PriorityQueue<Integer> p = new PriorityQueue<>();
        String str = null;
        int max = 0;
        int temp = 0;
        int total = 0;
        while( (str = br.readLine()) != null)
        {
            if(str.equals("") )
            {
               p.add(-1 * temp);
               temp = 0;
               continue;
            } 
               temp += Integer.parseInt(str);

            max = Math.max(temp,max);
        }

        out.println(max);
        out.println(p);
        for(int i=0; i<3; i++)
        {
            total += (-1 * p.poll());
        }
        out.println(total);
    }
}
