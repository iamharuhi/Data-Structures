import java.util.*;
public class Tree <T extends Comparable<T>>
{
    protected Node root;

    public Tree()
    {
        root = null;
    }
    public Tree(Node n)
    {
        root = n;
    }
    
    private int leafNodes(Node n)
    {
        if (n == null)
            return 0;
        if (n.leftChild == null && n.rightChild == null)
            return 1;
        return leafNodes(n.leftChild) + leafNodes(n.rightChild);
    }
    
    public void print(Node n)
    {
        if(n != null)
        {
                if (n.leftChild != null)
                    print(n.leftChild);
                System.out.println(n.key);
                if (n.rightChild != null)
                    print(n.rightChild);
        }
    }
}
