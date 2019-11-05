import java.util.*;
public class Queue
{    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a;
                
        System.out.println("Enter a string");
        a = scan.nextLine();
        
        algorithm(a);
    }
    
    public static void algorithm(String a)
    {
        LinkedList<Character> que = new LinkedList<Character>();
        for (int i = 0; i < a.length(); i++)
            que.add(a.charAt(i));
        System.out.println(); 
        for(int x = 0; x < a.length(); x++)
            System.out.print(que.pollLast());
    }
    
}
