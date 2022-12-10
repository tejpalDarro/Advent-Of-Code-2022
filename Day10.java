import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class Day10
{
    static class Move
    {
        public String str;
        public int value;

        public Move(String s, int v)
        {
            str = s;
            value = v;
        }
        public Move(String ins)
        {
            str = ins;
            // value = 0;
        }
    }
    public static void main(String[] args)
    {
        List<Move> moves = new ArrayList<>();
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String lines = null;
            while((lines = reader.readLine()) !=null)
            {
                String[] st = lines.split(" ");

                if(st.length > 1)
                {
                    String s = st[0];
                    int val = Integer.parseInt(st[1]);
                    moves.add(new Move(s,val) );
                }
                else
                {
                    String ins = st[0];
                    moves.add(new Move(ins));
                }
            }
            reader.close();
        }
        catch(Exception e)
        {
            out.println(e);
        }

        // for(Move e : moves)
        // {
        //     out.println(e.str + " " + e.value);
        // }

        out.println(Instruction(moves));

    }

    public static int Instruction(List<Move> list)
    {
        List<Integer> ans = new ArrayList<Integer>();
        int X = 1;
        int res = 0;
        int i=0;
        int cycle = 0;
        for(Move l : list)
        {
            if(l.str.equals("noop"))
            {
                cycle++;
                if(cycle == 20 + (40 * i)){
                    ans.add(X*cycle);
                    i++;
                    out.println("after " + cycle +  " cycle: " + X + " ans: " + X*cycle);
                }
            }
            else {
                if(cycle == 20 + (40 * i)){
                    ans.add(X*cycle);
                    i++;
                    out.println("after " + cycle +  " cycle: " + X + " ans: " + X*cycle);
                }
                cycle++;
                if(cycle == 20 + (40 * i)){
                    ans.add(X*cycle);
                    i++;
                    out.println("after " + cycle +  " cycle: " + X + " ans: " + X*cycle);
                }
                cycle++;
                if(cycle == 20 + (40 * i)){
                    ans.add(X*cycle);
                    i++;
                    out.println("after " + cycle +  " cycle: " + X + " ans: " + X*cycle);
                }
                X += l.value;
            }
        }
        for(Integer x : ans)
        {
            res += x;
        }
        out.println("cycle: " + cycle);
        out.println("res: " + res);
        return res;
    }
}
