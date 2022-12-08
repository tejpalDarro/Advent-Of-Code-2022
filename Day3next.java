import java.util.*;
import java.util.stream.*;
import java.io.*;
import static java.lang.System.out;

public class Day3next
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        PrintWriter pw =new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));

        List<String> lines = br.lines().collect(Collectors.toList());
        solve(lines);
    }

    public static void solve(List<String> line)
    {
        
        List<List<String>> group = new ArrayList<>();
        int total = 0;
        for(int i=0; i<line.size(); i+=3)
        {
            List<String> l = new ArrayList();
            l.add(line.get(i));
            l.add(line.get(i+1));
            l.add(line.get(i+2));
            group.add(l);
        } 

        for(int j=0; j<group.size(); j++) 
        {
            Set<String> first = new HashSet<>(
                    Arrays.stream(group.get(j).get(0).split("")).collect(Collectors.toList())
                    );

            Set<String> second = new HashSet<>(
                    Arrays.stream(group.get(j).get(1).split("")).collect(Collectors.toList())
                    );

            Set<String> third = new HashSet<>(
                    Arrays.stream(group.get(j).get(2).split("")).collect(Collectors.toList())
                    );
            third.retainAll(second);
            first.retainAll(third);


            final char uniq = first.toArray(new String[]{})[0].charAt(0);
            // out.print(uniq);

            total += findval(uniq); 
        }
        out.println(total);
    }


    public static int findval(char c) 
    {
        int temp = 0;
        if(Character.isUpperCase(c))
        {
            // out.println(ch[1] - 38);
            temp = c - 38;
        }else{
            // out.println(ch[1] - 96);
            temp = c - 96;
        }
        return temp;
    }
}
