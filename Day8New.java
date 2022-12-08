import java.util.*;
import java.util.stream.*;
import java.io.*;
import static java.lang.System.out;

public class Day8New
{
    private static Grid map;

    public static class Grid 
    {
        private final int size;
        private final int[][] grid;

        public Grid(List<String> input)
        {
            size = input.size();
            grid = new int[size][size];
            int i=0;
            for(String s : input)
            {
                grid[i] = Arrays.stream(s.split("")).mapToInt(Integer::parseInt).toArray();
                i++;
            }
            for(int[] x : grid)
            {
                for(int a : x)
                {
                    out.print(a + " ");
                }
                out.println("");
            }
        }

        public int  contains()
        {
            int ans=0;
            for(int i=0; i<size; i++)
            {
                for(int j=0; j<size; j++)
                {
                    if(IsVisible(i,j)) ans++;
                }
            }
            return ans;
        }

        public boolean IsVisible(int x, int y)
        {
            int n = grid[x][y];
            boolean left = ContainsY(0,y,x,n); 
            boolean right = ContainsY(y+1,this.size,x,n);
            boolean up = ContainsX(0,x,y,n);
            boolean down = ContainsX(x+1, this.size,y,n);
            return left || right || up || down;
        }

        public boolean ContainsX(int start, int to, int y, int val)
        {
            for(int i=start; i<to; i++)
            {
                if(grid[i][y] >= val) return false;
            }
            return true;
        }

        public boolean ContainsY(int start, int to, int x, int val)
        {
            for(int i=start; i<to; i++)
            {
                if(grid[x][i] >= val) return false;
            }
            return true;
        }

    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        List<String> ls = br.lines().collect(Collectors.toList());

        map = new Grid(ls);
        out.println(String.valueOf(map.contains()));
    }
}
