import java.util.*;
import java.util.stream.*;
import java.io.*;
import static java.lang.System.out;

public class Day8
{
    
    private static TreeGrid grid;

    private static class TreeGrid
    {
        private final int size;
        private final int[][] grid;

        public TreeGrid(List<String> input)
        {
            size = input.size();
            grid = new int[size][size];
            int i = 0;
            for(String l : input)
            {
                grid[i] = Arrays.stream(l.split("")).mapToInt(Integer::parseInt).toArray();
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


        public  int countVisibleTree()
        {
            int res = 0;
            for(int i=0; i<size; i++)
            {
                for(int j=0; j<size; j++)
                {
                    if(isVisible(i,j)) res++;

                }
            }
            return res;
        }

        private boolean isVisible(int x, int y)
        {
            int n = this.grid[x][y];
            boolean left = visibleY(0, y, x, n);
            boolean right = visibleY(y + 1, this.size, x, n);
            boolean up = visibleX(0, x, y, n);
            boolean down = visibleX(x + 1, this.size, y, n);
            return up || down || left || right;
        }

        private boolean visibleX(int from, int to, int y, int val)
        {
            for(int i=from; i<to; i++)
            {
                if(this.grid[i][y] >= val) return false;
            }
            return true;
        }

        private boolean visibleY(int from, int to, int x, int val)
        {
            for(int i = from; i < to; i++)
            {
                if(this.grid[x][i] >= val) return false;
            }
            return true;
        }
        
    }


    public Day8()
    {

    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        List<String> ls = br.lines().collect(Collectors.toList());

        grid = new TreeGrid(ls);

        out.println(String.valueOf(grid.countVisibleTree()));
    }




}
