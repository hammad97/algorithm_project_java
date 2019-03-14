/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoproject;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import javax.swing.JOptionPane;
/**
 *
 * @author Dell
 */
public class BSTreee6 {
    StringBuilder bfss;
    StringBuilder inn;
    StringBuilder postt;
    StringBuilder pree;
    String bfs;
    String inO;
    String postO;
    String preO;
    
    public BNode root;
    int count=0;
    BNode pre;
    
    BSTreee6()
    {
        root=null;
    }
    
    public class BNode
    {
        BNode left;
        BNode right;
        BNode parent;
        int val;
        int charge;
        
        BNode()
        {
            parent=null;
            left=null;
            right=null;
            charge=0;
        }
        BNode(int x)
        {
            left=null;
            right=null;
            val=x;
            charge=0;
        }
    }
    public int getHeight(BNode temp){
	if(temp==null)
            return -1;

        return (1+ Math.max(getHeight(temp.left),getHeight(temp.right)));
	}    

    public void updateCharges(BNode temp)
    {
        Queue<BNode> q = new LinkedList<BNode>();
        if (root == null)
        return;
	
        q.add(root);
        while (!q.isEmpty()) 
        {
            BNode n = (BNode) q.remove();
            if(n.left!=null && n.right!=null)
                n.charge=getHeight(n.left)+1-getHeight(n.right)+1;
            else if(n.left!=null && n.right==null)
                n.charge=getHeight(n.left)+1;
            else if(n.left==null && n.right!=null)
                n.charge=0-getHeight(n.right)-1;
            else
                n.charge=0;
            
            if (n.left != null)
		q.add(n.left);
            if (n.right != null)
		q.add(n.right);
	}        
    }

    public void insert(int data)
    {
        bfs=" ";
        inO=" ";
        postO=" ";
        preO=" ";
        
        bfss=new StringBuilder(bfs);
        inn=new StringBuilder(inO);
        postt=new StringBuilder(postO);
        pree=new StringBuilder(preO);
        
        root= insert(root,data);
    }
    
    
    
    private BNode insert(BNode node,int x)
    {
        if(node==null)
        {
            node=new BNode(x);
            if(node!=root)
            {
                node.parent=pre;                
            }
            count++;
        }
        
        else
        {
            pre=node;
            if(x<node.val)
            {
                node.left=insert(node.left,x);
            }
            else if(x>node.val)
            {
                node.right=insert(node.right,x);
            }
            else{
                JOptionPane.showMessageDialog(null, "This value is already present in tree");                        
            }
        }
        return node;
    }

    public void displayIn(BNode temp)
    {
        if(temp!=null)
        {
            displayIn(temp.left);
//            System.out.print(temp.val);
            inn.append(temp.val+",");
            displayIn(temp.right);
        }
    }
    
    public void displayPre(BNode temp)
    {
        if(temp!=null)
        {
//            System.out.print(temp.val);            
            pree.append(temp.val+",");
            displayPre(temp.left);
            displayPre(temp.right);
        }
    }
    
    
    public void displayPost(BNode temp)
    {
        if(temp!=null)
        {            
            displayPost(temp.left);
            displayPost(temp.right);
//            System.out.print(temp.val);
            postt.append(temp.val+",");
        }
    }
    
    
    
    public void delete(BNode temp, int x, int lr)
    {
        if(temp.val==x)
        {
            if(temp.left==null && temp.right==null)
            {
                if(lr==0)
                    temp.parent.left=null;
                else if(lr==1)
                    temp.parent.right=null;
            }
            else if(temp.left!=null && temp.right==null)
            {
                if(lr==0)
                    temp.parent.left=temp.left;
                else if(lr==1)
                    temp.parent.right=temp.left;
            }
            else if(temp.left==null && temp.right!=null)
            {
                if(lr==0)
                    temp.parent.left=temp.right;
                else if(lr==1)
                    temp.parent.right=temp.right;
            }
            else
            {
                BNode min=getMin(temp);
                if(min.parent.left==min)
                    min.parent.left=null;
                else if(min.parent.right==min)
                    min.parent.right=null;                
                
                if(temp.left!=null)
                {
                    min.left=temp.left;
                    min.left.parent=min;
                }
                
                if(temp.right!=null)
                {
                    min.right=temp.right;
                    min.right.parent=min;
                }
                
                if(temp!=root)
                    min.parent=temp.parent;
                else
                    min.parent=null;
                
                if(temp!=root)
                {    
                    if(min.val<min.parent.val)
                        min.parent.left=min;
                    else
                        min.parent.right=min;
                }
                
                temp.left=null;
                temp.right=null;
                
                if(root==temp)
                    root=min;
                
            }
        }
        else if(x<temp.val)
        {
            delete(temp.left,x,0);
        }
        else if(x>temp.val)
        {
            delete(temp.right,x,1);
        }
        
    }

    public BNode getMin(BNode temp) //from BFS
    {
        Queue<BNode> q = new LinkedList<BNode>();
        if (root == null)
        return null;
	BNode min=temp.right;
        q.add(temp.right);
        while (!q.isEmpty()) 
        {
            BNode n = (BNode) q.remove();
            if(n.val<min.val)
                min=n;
            if (n.left != null)
		q.add(n.left);
            if (n.right != null)
		q.add(n.right);
	}
        return min;
    }    
    
    public boolean search(BNode temp,int x) //from BFS
    {
        Queue<BNode> q = new LinkedList<BNode>();
        if (root == null)
        return false;
	
        q.add(root);
        while (!q.isEmpty()) 
        {
            BNode n = (BNode) q.remove();
            if(n.val==x)
                return true;
            if (n.left != null)
		q.add(n.left);
            if (n.right != null)
		q.add(n.right);
	}
        return false;
    }
    
   public void BFS(BNode temp) //from BFS
    {
        Queue<BNode> q = new LinkedList<BNode>();
        if (root == null)
        return;
	
        q.add(root);
        while (!q.isEmpty()) 
        {
            BNode n = (BNode) q.remove();
//            System.out.println(n.val);
            bfss.append(n.val+",");
            if (n.left != null)
		q.add(n.left);
            if (n.right != null)
		q.add(n.right);
	}
    }
    
   public int getLevel(BNode temp)
   {
       return getHeight(root)+1;
   }
   
    public void displayPar(BNode temp)  //code for checking if parent works
    {
        if(temp!=null)
        {
            displayPar(temp.left);
            if(temp!=root)
            System.out.println(temp.parent.val);
            displayPar(temp.right);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("Don't press F6. Press Shift+F6");
//        BSTreee6 b1=new BSTreee6();
//
//        b1.insertI(3);
//        b1.insertI(1);
//        b1.insertI(2);
//        b1.insertI(6);
//        b1.insertI(5);
//        b1.insertI(9);
//        b1.insertI(14);
//        b1.insertI(4);
//        b1.insertI(0);
//        b1.insertI(8);
//        b1.insertI(7);
//        b1.insertI(15);
//        
//
//        System.out.println("in: ");        
//        b1.displayIn(b1.root);
//        System.out.println();
//
//        System.out.println("post: ");
//        b1.displayPost(b1.root);
//        System.out.println();
//        
//        System.out.println("pre: ");        
//        b1.displayPre(b1.root);
//        System.out.println();        
//        b1.BFS(b1.root);
//        
//        b1.delete(b1.root, 15, 0);
//        System.out.println();
//        System.out.println();
//        b1.BFS(b1.root);        
//        System.out.println("\n Height: "+b1.getHeight(b1.root));
//        b1.displayPar(b1.root);
        
//        System.out.println(b1.root.right);
//        System.out.println(b1.search(b1.root, 65));  //search func check
//        System.out.println(b1.getMin(b1.root).val); //getMin func check
        
        
        
    }
    
}
