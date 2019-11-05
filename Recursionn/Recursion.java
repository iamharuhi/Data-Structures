import java.util.*;
public class Recursion
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an int to calculate the factorial");
        int x = scan.nextInt();
        System.out.println(factorial(x));
        System.out.println("Enter a string to reverse");
        String s = scan.next();
        System.out.println(reverse(s));
        System.out.println(isPal(s));
    }
    
    public static int factorial(int x)
    {
        if(x == 1)
            return x;
        else
            return x*factorial((x-1));
    }
    
    public static String reverse(String s)
    {
        if(s.length() == 1)
            return s;
        else
            return s.charAt(s.length()-1) + reverse(s.substring(0,s.length()-1));
    }
    
    public static boolean isPal(String s)
    { 
        if(s.length() == 1 || s.length() == 1)
            return true;
        if(s.charAt(0) == s.charAt(s.length()-1))
             return isPal(s.substring(1, s.length()-1));
        return false;
    }
    
    public static int maxWithIndex(int[] data, int index)
    {
        if (index > 0) 
            return Math.max(data[index], maxWithIndex(data, index-1));
        else 
            return data[0];
    
    }
    
    public static int maxArray(int[] data)
    {
        int index = data.length;
        if (index > 0) 
            return Math.max(data[index], maxWithIndex(data, index-1));
        else 
            return data[0];
    }
    
    public static int[] arrayRev(int[] data)
    {
        int index = data.length;
        int rev[] = new int[data.length];
        int count = 0;
        if(data[index]=null)
            return data;
        else 
        {
            index--;
            count++;
            return arrayRev(rev[count] = data[index]);
        }
    }
    
}
