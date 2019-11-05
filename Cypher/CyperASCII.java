import java.util.*;
public class CyperASCII
{
    public static void main(String args[])
    {
        System.out.println("Input: hello");
        int[] inp = copyof(encrypt("hello"));
        System.out.println("Encrypted: ");
        for (int x = 0; x < input.length(); i++)
            System.out.print(inp[x] + " ");
        
        System.out.println("Decrypted: " + decrypt(inp[]));
        
        
    }
    
    public static int[] encrypt(String input)
    {
        String output = "";
        int[] inp = new int[input.length()];
        int z = 0;
        
        for (int i = 0; i<input.length(); i++)
        {
            z = (int)input.charAt(i);
            z += 4;
            inp[i] = (int)z;
            
        }
        
        return inp[];
    }
    
    public static String decrypt(int[] inp)
    {
        String output = "";
        int z = 0;
        
        for (int i = 0; i<input.length(); i++)
        {
            String s += Character.toString((char)inp[]);
            
        }
        
        retrun s;
    }
    
}
