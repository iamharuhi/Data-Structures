package Maze;

public class Maze
{
    private int[][] data = {{1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1},
                            {1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1}, 
                            {0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, 
                            {1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1}, 
                            {1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1}, 
                            {1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, 
                            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};
    public static void main(String args[])
    {
        Maze lab = new Maze();
        System.out.println(lab);
        if(lab.traverse(0, 0))
            System.out.println("The Maze was solved");
        else
            System.out.println("No Sollution found");
        System.out.println(lab);
    }
    
    public boolean isValid(int col, int row)
    {
        if(row >= 0 && row < data.length && col >= 0 && col < data[row].length)
            if(data[row][col] == 1)
                return true;
        return false;
    }
    
    public boolean traverse(int col, int row)
    {
        boolean done = false;
        if(isValid(col, row))
        {
            data[row][col] = 3;
            if (row == data.length-1 && col == data[0].length-1)
                done = true;
            else
            {
                done = traverse(col, row+1);
                if (!done)
                    done = traverse(col+1, row);
                if (!done)
                    done = traverse(col, row-1);
                if (!done)
                    done = traverse(col-1, row);
            }
            if (done)
                data[row][col] = 7;
        }
            
        return done;
    }
    public String toString()
    {
      String result = "\n";

      for (int row=0; row < data.length; row++)
      {
         for (int col=0; col < data[row].length; col++)
            result += data[row][col] + "";
         result += "\n";
      }

      return result;
    }
}
