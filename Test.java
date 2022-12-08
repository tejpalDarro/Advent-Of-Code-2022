import java.util.*;
import java.util.stream.*;
import java.io.*;
import static java.lang.System.out;

public class Test {

    public static void solve(List<String> list)
    {
        int space = 0;
        for(String s : list)
        {
            if(s.contentEquals(""))
                break;
            space++;
        }
        out.println(space);
        StringTokenizer st = new StringTokenizer(list.get(space-1), " ");
        int stackCount = st.countTokens();
        out.println(stackCount);

        List<Stack<Character>> stack = new ArrayList<>();
        for(int i=0; i<stackCount; i++)
        {
            stack.add(new Stack<>());
        }

        for(int i=0; i<space-1; i++)
        {
            String s = list.get(i); 
            for(int j=0; j<stackCount; j++)
            {
                char c = s.charAt(j * 4 + 1);
                if(c != ' '){
                stack.get(j).add(0,c);
                }
            }
        }
        out.println(stack);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        List<String> res = br.lines().collect(Collectors.toList());
        solve(res);
        List<Stack<Character>> list = new ArrayList<>();
        for(int i=0; i<5; i++) {
            list.add(new Stack<>());
        }
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<5; j++)
            {
                list.get(j).add(0,'c');
            }
        }

        
        // out.println(list.get(4));

        Stack<Character> st = list.get(1);
        st.push('a');
        st.add('b');
        st.add(0,'a');
        out.println(list);

        List<String> l = new ArrayList<>(
                Arrays.asList("one", "two", "three", "four")
                );

        out.println(l);

        List<String> ll = l;
        ll.remove(0);

        out.println(l);
        out.println(ll);
    }
}

