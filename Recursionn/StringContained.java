import java.util.*;
public class StringContained
{
    private String s  = new String("Hello World");
    public static void main(String args[])
    {
        StringContained sentance = new StringContained();
        System.out.println(sentance.find("o W"));
    }
    
    public boolean find(String c)
    { 
        System.out.println(c + " " + s);
        if(s.length() == 0)
            return false;
        if(c.equals(s.substring(0,c.length())))
             return true;
        else
            {
                s = s.substring(1, s.length());
                return find(c);
            }
    }
    
}