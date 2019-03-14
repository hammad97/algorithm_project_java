/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoproject;
import static java.lang.Math.max;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import javax.swing.JOptionPane;
/**
 *
 * @author Dell
 */
public class RedBlack {
    StringBuilder bfss;
    StringBuilder inn;
    StringBuilder postt;
    StringBuilder pree;
    String bfs;
    String inO;
    String postO;
    String preO;
    
    public enum COLOUR
    {
        BLACK,RED;
    }
    public RBNode root;
    public RBNode pre;
    public int size;
    public RedBlack()
    {
        root=null;
        pre=null;
        size=0;
        
    }
    public RedBlack(int i)
    {
        root=new RBNode(i);
        pre=null;
        size=0;
    }
//    public int height (RBNode temp)
//    {
//        if (temp==null)
//        {
//            return -1;
//        }
//        else
//        {
//            return temp.h;
//        }
//    }
    public RBNode flipColors(RBNode temp)
    {
        COLOUR col1=temp.color;
        COLOUR col2=temp.left.color;
        temp.color=col2;
        temp.left.color=col1;
        temp.right.color=col1;
        return temp;
    }
    public class RBNode 
    {
        RBNode left;
        RBNode right;
        COLOUR color;    //1=red ,  0=black
        int item;
        public RBNode ()
        {
            color=COLOUR.RED;
            left=null;
            right=null;
        }
        public RBNode (int i)
        {
            color=COLOUR.RED;
            left=null;
            right=null;
            item=i;
        }
    }
    public void Insert(int i)
    {
        bfs=" ";
        inO=" ";
        postO=" ";
        preO=" ";
        
        bfss=new StringBuilder(bfs);
        inn=new StringBuilder(inO);
        postt=new StringBuilder(postO);
        pree=new StringBuilder(preO);

        root=Insert(i,root);

        if(root.color==COLOUR.RED)
            root.color=COLOUR.BLACK;
        
        
    }
    public RBNode delete(RBNode n,int x)
    {
        if(n==null)
        {
            return n;
        }
        else if(n.item==x)
        {
            if(n.color==COLOUR.RED && n.left==null && n.right==null)  //red node with no child
            {
                if(n.left!=null)
                    n=n.left;
                else
                    n=n.right;
            }
            else if(n.color==COLOUR.BLACK && n.left==null && n.right==null)  //black node with no child
            {
                RBNode temp=pre;
                n=RR(n);          
                n=delete(n,x);
                temp=RR(temp);
                if(temp.right.left!=null)
                    switchColors(temp.right, temp.right.left);
                else 
                    switchColors(temp.right, temp.right.right);
            }
            else if(n.left!=null && n.right==null || n.left==null && n.right!=null)  //black node with 1 child
            {
                n=RR(n);
                n=delete(n,x);
            }
        }
        else if(x<n.item)
        {
            pre=n;
            n.left=delete(n.left,x);
        }
        else
        {
            pre=n;
            n.right=delete(n.right,x);
        }
        if(root.color==COLOUR.RED)
            root.color=COLOUR.BLACK;        
        return n;
    }
    public COLOUR getColor(RBNode n)
    {
        if(n==null)
            return COLOUR.BLACK;
        else 
            return n.color;
    }
            
    private RBNode Insert (int i, RBNode temp)
    {
        if (temp==null)
        {
            return new RBNode(i);
        }
        else if (i<temp.item)
        {
            temp.left=Insert(i,temp.left);
        }
        else if (i>temp.item)
        {
            temp.right=Insert(i,temp.right);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "This value is already present in tree");            
        }
        return Balance(temp);
    }

    public RBNode Balance (RBNode temp)
    {
        if(getColor(temp.right)==COLOUR.RED && getColor(temp.left)!=COLOUR.RED)
        {
            temp=RL(temp);
        }
        if(getColor(temp.left)==COLOUR.RED && getColor(temp.left.left)==COLOUR.RED)
        {
            temp=RR(temp);
        }
        if(getColor(temp.left)==COLOUR.RED && getColor(temp.right)==COLOUR.RED)
        {
            temp=flipColors(temp);
        }
        return temp;
    }
    public void switchColors(RBNode one,RBNode two)
    {
        COLOUR col1=getColor(one);
        COLOUR col2=getColor(two);
        if(one!=null)
            one.color=col2;
        if(two!=null)   
            two.color=col1;
    }
    public RBNode RR(RBNode temp)
    {
        RBNode t=temp.left;
        switchColors(temp,t);
        if(temp.left!=null)
            temp.left=t.right;
        if(t!=null) 
            t.right=temp;
        if(temp==root)
            root=t;
        return t;
 
    }
    public RBNode RL(RBNode temp)
    {
        RBNode t=temp.right;
        switchColors(temp,t);        
        temp.right=t.left;
        t.left=temp;
        return t;
    }
    public void Inorder(RBNode temp)
    {
        if (temp!=null)
        {
            Inorder(temp.left);
//            System.out.println(""+temp.item);
            inn.append(temp.item+"("+temp.color+"),");
            Inorder(temp.right);
        }
    }
    public void Preorder(RBNode temp)
    {
        if (temp!=null)
        {
            pree.append(temp.item+"("+temp.color+"),");
            Preorder(temp.left);
            Preorder(temp.right);
        }
    }
    public void Postorder(RBNode temp)
    {
        if (temp!=null)
        {
            Postorder(temp.left);
            Postorder(temp.right);
//            System.out.println(""+temp.item);
            postt.append(temp.item+"("+temp.color+"),");
        }
    }
   public void BFS(RBNode temp) //from BFS
    {
        Queue<RBNode> q = new LinkedList<RBNode>();
        if (root == null)
        return;
	
        q.add(root);
        while (!q.isEmpty()) 
        {
            RBNode n = (RBNode) q.remove();
//            System.out.println(n.item+"("+n.color+")");
            bfss.append(n.item+"("+n.color+"),");
            if (n.left != null)
		q.add(n.left);
            if (n.right != null)
		q.add(n.right);
	}
    }    
   public boolean search(RBNode temp,int x) //from BFS
    {
        Queue<RBNode> q = new LinkedList<RBNode>();
        if (root == null)
        return false;
	
        q.add(root);
        while (!q.isEmpty()) 
        {
            RBNode n = (RBNode) q.remove();
            if(n.item==x)
                return true;
            if (n.left != null)
		q.add(n.left);
            if (n.right != null)
		q.add(n.right);
	}
        return false;
    }       
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        RedBlack rb1=new RedBlack();
//
//        rb1.Insert(4);
//        rb1.Insert(7);
//        rb1.Insert(12);
//        rb1.Insert(15);
//        rb1.Insert(3);
//        rb1.Insert(5);
//        rb1.Insert(14);
//        rb1.Insert(18);        
//        rb1.Insert(16);
//        rb1.Insert(19);
//        
//        
//        
//        System.out.println();
//        rb1.BFS(rb1.root);
//        System.out.println();
//        rb1.delete(rb1.root, 'A'); //No child deletion (RED)
//        rb1.delete(rb1.root, 'S'); //No child deletion (BLACK)
//        rb1.delete(rb1.root, 'C'); //ONE child deletion (ALWAYS BLACK)
    }
    
}
