import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class Day6
{
    public static void solve(String... str)
    {
        int start= 0;
        int end = 0; 
        String[] st = str[0].split("");
        Set<String> set = new HashSet<>();
        int a = 0;
        int b = 0;
        while(b<st.length)
        {
            if(!set.contains(st[b]))
            {
                set.add(st[b]);
                if(set.size() == 14) {
                    out.println(b+1);
                    out.println(st[b]);
                    break;
                }
                b++;
            }else if(set.contains(st[b])){
                set.clear();
                a++;
                b = a;
             }
        }
        out.println(set);

    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String st = null; 

        while((st = br.readLine()) != null)
        {
            solve(st);
        }
    }
}
