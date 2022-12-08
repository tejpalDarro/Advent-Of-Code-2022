import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class Day2next
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("ouput.txt")));

        String str = null;
        String[] s = new String[1];
        int points =0, winPoints = 0;
        while( (str = br.readLine()) != null)
        {
            if(str.equals(""))
                continue;
            s = str.split(" ");
            switch(s[0])
            {
                case "A":
                    if(s[1].equals("X"))
                    {
                        points += 3;
                        winPoints += 0;
                    }
                    if(s[1].equals("Y"))
                    {
                        points +=1;
                        winPoints += 3;
                    } 
                    if(s[1].equals("Z")){
                        points += 2;
                        winPoints += 6;
                        }
                    break;
                case "B":
                    if(s[1].equals("X"))
                    {
                        points += 1;
                        winPoints += 0;
                    }
                     if(s[1].equals("Y"))
                    {
                        points +=2;
                        winPoints += 3;
                    }
                     if(s[1].equals("Z"))
                    {
                        points += 3;
                        winPoints += 6;
                    }
                    break;

                case "C":
                    if(s[1].equals("X"))
                    {
                        points += 2;
                        winPoints += 0;
                    }
                     if(s[1].equals("Y"))
                    {
                        points +=3;
                        winPoints += 3;
                    }
                     if(s[1].equals("Z"))

                    {
                        points += 1;
                        winPoints += 6;
                    }

                    break;

            }
            
        }
        out.println(points + winPoints);
    }
}
