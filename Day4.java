import java.util.*;
import java.io.*;
import static java.lang.System.*;
import java.util.regex.*;


public class Day4
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int count=0;
        String str = null;
        int cnt=0;
        while((str = br.readLine()) != null)
        {
            Matcher match = Pattern.compile("(\\d*)-(\\d*),(\\d*)-(\\d*)").matcher(str);
            match.find();
            int[] coord = new int[]{
                Integer.parseInt(match.group(1)),
                Integer.parseInt(match.group(2)),
                Integer.parseInt(match.group(3)),
                Integer.parseInt(match.group(4))
            };
            if(coord[0]<=coord[2] && coord[1]>=coord[3] || coord[0]>=coord[2] && coord[1]<=coord[3])
                count++;
            
            if(coord[1]<coord[2] || coord[3]<coord[0])
                cnt++;
            // out.println(coord[1] + " : " + coord[2]);
        }
        out.println(1000 - cnt);
        out.println(count);
         
    }
}
