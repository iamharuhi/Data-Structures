import java.util.*;
public class BinarySeachTree
{
   public static void main(String args[])
   {
       Node<Integer> n = new Node(5);
       Node<Integer> n2 = new Node(3);
       Node<Integer> n3 = new Node(7);
       
       n.root.leftChild = n2;
       n.root.rightChild = n3;
       
       Tree<Integer> t = new Tree(n);
       
       t.print(n);
   }
}
