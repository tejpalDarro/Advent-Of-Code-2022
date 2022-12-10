import java.util.*;
import java.util.regex.*;
import java.util.stream.*;
import java.io.*;
import static java.lang.System.out;

public class Day9
{
    static class Move
    {
        public Character direction;
        public int distance;

        public Move(Character dir, int dis)
        {
            direction = dir;
            distance = dis;
        }
    }

    static class Coordinates
    {
        public int x;
        public int y;

        Coordinates()
        {
            this.x = 0;
            this.y = 0;
        }

        Coordinates(int x, int y)
        {
            this.x = x;
            this.y = y;
        }

        public Coordinates applyMove(Move move)
        {
            switch(move.direction)
            {
                case 'U':
                    return new Coordinates(x,y+1);
                case 'D':
                    return new Coordinates(x,y-1);
                case 'L':
                    return new Coordinates(x-1,y);
                case 'R':
                default:
                    return new Coordinates(x+1,y);
            }

        }

        public Coordinates followHead(Coordinates head)
        {
            Boolean shouldMove = Math.abs(x - head.x) > 1 || Math.abs(y - head.y) > 1;
            
            if(!shouldMove)
            {
                return this;
            }

            Coordinates coordinates = new Coordinates(x,y);

            if(x > head.x)
            {
                coordinates.x--;
            }
            else if(x < head.x)
            {
                coordinates.x++;
            }
            if(y > head.y)
            {
                coordinates.y--;
            }
            else if(y < head.y)
            {
                coordinates.y++;
            }
            return coordinates;
        }
        
    }

    public static void main(String[] args) throws IOException
    {
        List<Move> moves = new ArrayList<>();
       try
       {
           BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
           String line = null;
           while((line = reader.readLine()) != null)
           {
               String[] parts = line.split(" ");
               Character direction = parts[0].charAt(0);
               int distance = Integer.parseInt(parts[1]); 
               moves.add(new Move(direction, distance));
           }
           reader.close();
       }
       catch(Exception e)
       {
           out.println("Couldn't read the input.");
       }

       out.println(countVisible(moves));
       out.println(countVisible(moves, 9));
    }

    public static int countVisible(List<Move> moves)
    {
        return countVisible(moves,1);
    }

    public static int countVisible(List<Move> moves, int tailLength)
    {
       Set<Coordinates> visited = new HashSet<Coordinates>(); 
       Coordinates head = new Coordinates();
       Coordinates[] tail = new Coordinates[tailLength];

       for(int i=0; i< tailLength; i++)
       {
           tail[i] = new Coordinates();
       }

       for(Move m : moves)
       {
           for(int i =0; i< m.distance; i++)
           {
               head = head.applyMove(m);

               Coordinates neighbour = head;
               for(int j = 0; j< tailLength; j++)
               {
                   tail[j] = tail[j].followHead(neighbour);
                   neighbour = tail[j];
               }
               visited.add(tail[tail.length-1]);
           }
       }

       return visited.size();

    
    }
}
