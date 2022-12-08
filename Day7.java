import java.util.*;
import java.io.*;
import java.util.stream.*;
import static java.lang.System.out;

public class Day7
{
    public static void solve(List<String> input)
    {
        Folder root = new Folder();
        root.name = "/";
        Folder currFold = root;
        for(int i=1; i<input.size(); i++)
        {
            String[] parts = input.get(i).split(" ");
            // out.println(Arrays.toString(parts));

            if(parts[0].equals("$"))
            {
                if(parts[1].equals("cd"))
                {
                    if(parts[2].equals(".."))
                    {
                        currFold = currFold.parent;
                    }else{
                        for(Node n : currFold.contents)
                        {
                            if(n.name.equals(parts[2]))
                            {
                                currFold = (Folder) n;
                                break;
                            }
                        }
                    }
                }
            }else if(parts[0].equals("dir"))
            {
                Folder folder = new Folder();
                folder.parent = currFold;
                folder.name = parts[1];
                currFold.contents.add(folder);
            }else{
                File file = new File();
                file.parent = currFold;
                file.name = parts[1];
                file.size = Integer.parseInt(parts[0]);
                currFold.contents.add(file);
            }
        }

        List<Node> ls = new ArrayList<>(root.contents);
        for(Node n : ls)
        {
            out.println(n.name + " " + n.parent.name);
        }
        // ls.forEach((a,b) -> out.println(a + " " + b));
            
    }

    public static abstract class Node
    {
        public Folder parent;
        public String name;
        public abstract long getSize();

    }

   public static class File extends Node 
   {
       public int size;

       @Override
       public long getSize()
       {
           return size;
       }
   }

   public static class Folder extends Node
   {
       public List<Node> contents = new ArrayList<>();

       public List<Folder> getSubFolders()
       {
           List<Folder> folders = new ArrayList<>();
           for(Node n: contents)
           {
               if(n instanceof Folder)
                   folders.add((Folder) n);
           }
           return folders;
       }

       public long getSize()
       {
           long size = 0;
           for(Node n: contents)
              size += n.getSize(); 
           return size;
       }
   }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        List<String> ls = br.lines().collect(Collectors.toList());
        // ls.forEach(System.out::println);
        solve(ls);
    }
}



