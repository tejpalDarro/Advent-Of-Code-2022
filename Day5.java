import java.util.*;
import java.util.stream.*;
import java.io.*;
import static java.lang.System.out;

public class Day5
{
    static class CraneInstruction
    {
        int count;
        int start;
        int target;
        CraneInstruction(String in)
        {
            String[] x = in.split(" ");
            count = Integer.parseInt(x[1]);
            start = Integer.parseInt(x[3]);
            target = Integer.parseInt(x[5]);
        }
    }

    public static String part1(List<String> input)
    {
        int split = 0;
        for(String in: input)
        {
            if(in.contentEquals(""))
                break;
            split++;
        }

        out.println("Split: "+ split);
        out.println("aaa: " + input.get(split-1));
        StringTokenizer st = new StringTokenizer(input.get(split -1), " ");

        int stackCount = st.countTokens();
        out.println("stack count: " + stackCount);


        List<Stack<Character>> crateStacks = new ArrayList<>();

        for(int i=0; i<stackCount; i++)
        {
            crateStacks.add(new Stack<>());
        }
        out.println(crateStacks);

        for(int i=0; i<split-1; i++)
        {
            String s = input.get(i);
            // out.println(s);
            for(int j=0; j<stackCount; j++)
            {
                int index = j * 4 + 1;
                char c = s.charAt(index);
                if(c != ' ')
                {
                    // out.println("*" + c + "+");
                    crateStacks.get(j).add(0,c);
                    
                }
            }
        }

        out.println(crateStacks);
    
        List<CraneInstruction> instr = new ArrayList<>();
        for(int i=split + 1; i<input.size(); i++)
        {
            instr.add(new CraneInstruction(input.get(i)));
            // out.println(input.get(i));
        }

        out.println(crateStacks.get(0));
        for(CraneInstruction inst : instr)
        {
            // crateStacks.forEach(System.out::println);

            Stack<Character> startStack =  crateStacks.get(inst.start - 1);
            List<Character> loadUp = new ArrayList<>();
            for(int i=0; i<inst.count; i++)
            {
                loadUp.add(startStack.pop());
            }
            // Collections.reverse(loadUp);

            Stack<Character> targetStack = crateStacks.get(inst.target - 1);
            for(char c: loadUp)
            {
                targetStack.push(c);
            }
            // out.println("# " + topElements(crateStacks));
            // out.println("");

        }
        return topElements(crateStacks);
        
    }

    private static String topElements(List<Stack<Character>> crateStacks)
    {
        String sol = "";
        for(Stack<Character> s : crateStacks)
        {
            if(s.isEmpty())
            {
                sol += "_";
            } else{
                sol += s.peek();
            }
        }
        return sol;
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));

        List<String> str = br.lines().collect(Collectors.toList());
        out.println(part1(str));
    }
}
