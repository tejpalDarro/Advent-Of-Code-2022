import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class Day3
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        PrintWriter pw =new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));

        String line = null;

        int total = 0;
        while((line = br.readLine()) != null)
        {
            if(line.equals(""))
                continue;
            int temp = solve(line);
            total += temp;
        }
        out.println(total); 
        
    }

    public static int solve(String line)
    {

        Set<Character> firstSet = new HashSet<>();
        Set<Character> secondSet = new HashSet<>();
        
        int length = line.length() % 2 == 0 ? line.length()/2 : line.length()/2+1;
        String first = line.substring(0,length);
        String second = line.substring(length);
        int res = 0;
        char[] firstCh = first.toCharArray();
        char[] secondCh = second.toCharArray();


        for(char s : firstCh)
        {
            firstSet.add(s);
        }

        for(char s : secondCh)
        {
            secondSet.add(s);
        }


        Set<Character> intersection = new HashSet<>(firstSet);
        intersection.retainAll(secondSet);
        String s = intersection.toString();
        res = findval(s);
        return res;
    }

    public static int findval(String str) 
    {
        int temp = 0;
        char[] ch = str.toCharArray();
        if(Character.isUpperCase(ch[1]))
        {
            // out.println(ch[1] - 38);
            temp = ch[1] - 38;
        }else{
            // out.println(ch[1] - 96);
            temp = ch[1] - 96;
        }
        return temp;
    }
}
