/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoproject;

import javax.swing.JOptionPane;

/**
 *
 * @author Moiz
 */
//import java.util.Scanner;
public class KDTree {
    StringBuilder bfss;
    StringBuilder inn;
    StringBuilder postt;
    StringBuilder pree;
    String bfs;
    String inO;
    String postO;
    String preO;    

    public KDNode root;
    int size=0;
    public int dimension;
    public KDTree(int d){
        root=null;
        dimension=d;
    }
    public void insert(int d1, int d2)
    {
        bfs=" ";
        inO=" ";
        postO=" ";
        preO=" ";
        
        bfss=new StringBuilder(bfs);
        inn=new StringBuilder(inO);
        postt=new StringBuilder(postO);
        pree=new StringBuilder(preO);        
        KDNode temp = new KDNode(d1,d2);
        if (root==null)
        {
            root=temp;
            size++;
        }
        else
        {
            KDNode temp2=root;
            int count=1;
            while (true)
            {
                if (count%dimension!=0)
                {
                    if (d1<temp2.data[0])
                    {
                        if (temp2.left==null)
                        {
                            temp2.left=temp;
                            size++;
                            return;
                        }
                        temp2=temp2.left;
                        count++;
                    }
                    else if(d1>temp2.data[0])
                    {
                        if (temp2.right==null)
                        {
                            temp2.right=temp;
                            size++;
                            return;
                        }
                        temp2=temp2.right;
                        count++;
                    }
                    else{
                    JOptionPane.showMessageDialog(null, "This value is already present in tree");
                    }
                }
                else
                {
                    if (d2<temp2.data[1])
                    {
                        if (temp2.left==null)
                        {
                            temp2.left=temp;
                            size++;
                            return;
                        }
                        temp2=temp2.left;
                        count++;
                    }
                    else if(d2>temp2.data[1])
                    {
                        if (temp2.right==null)
                        {
                            temp2.right=temp;
                            size++;
                            return;
                        }
                        temp2=temp2.right;
                        count++;
                    }
                   else{
                        JOptionPane.showMessageDialog(null, "This value is already present in tree");
                    }
                }
            }
        }
    }    
    public class KDNode {
        int data[];
        KDNode right;
        KDNode left;
        public KDNode(int a, int b)
        {
            data = new int[dimension];
            data[0]=a;
            data[1]=b;
            left=null;
            right=null;   
        }
    }
    public void BFS()                       //Shows the elements in BFS mode
    {
        Queue<KDNode> q=new Queue(size);
        q.enqueue(root);
        while(!q.isEmpty())
        {
            KDNode node=q.dequeue();
//            System.out.print(node.data[0]+","+node.data[1]+" ");
            bfss.append("("+node.data[0]+","+node.data[1]+"),");
            if (node.left!=null)
            {
                q.enqueue(node.left);
            }
            if (node.right!=null)
            {
                q.enqueue(node.right);
            }
        }
    }
    public boolean search(int d1, int d2)
    {
        int found=0;
        Queue<KDNode> q=new Queue(size);
        q.enqueue(root);
        while(!q.isEmpty())
        {
            KDNode node=q.dequeue();
            if (node.data[0]==d1 && node.data[1]==d2)
            {
                return true;
//                System.out.println("The node with data "+d1+","+d2+" is present.");
//                found++;
            }
            //System.out.print(node.data[0]+","+node.data[1]+" ");
            if (node.left!=null)
            {
                q.enqueue(node.left);
            }
            if (node.right!=null)
            {
                q.enqueue(node.right);
            }
        }
        return false;
    }
    public void preorder(KDNode temp)
    {
        if (temp!=null)
        {
            pree.append("("+temp.data[0]+","+temp.data[1]+"),");            
//            System.out.print(temp.data[0]+","+temp.data[1]+" ");
            preorder(temp.left);
            preorder(temp.right);
        }
    }
    public void inorder(KDNode temp)
    {
        if (temp!=null)
        {
            inorder(temp.left);
//            System.out.print(temp.data[0]+","+temp.data[1]+" ");
            inn.append("("+temp.data[0]+","+temp.data[1]+"),");
            inorder(temp.right);
        }
    }
    public void postorder(KDNode temp)
    {
        if (temp!=null)
        {
            postorder(temp.left);
            postorder(temp.right);
//            System.out.print(temp.data[0]+","+temp.data[1]+" ");
            postt.append("("+temp.data[0]+","+temp.data[1]+"),");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KDTree kd1 = new KDTree(2);
        kd1.insert(3, 7);
        kd1.insert(8, 1);
        kd1.insert(6, 6);
        kd1.insert(2, 6);
        kd1.insert(1, 7);
        kd1.insert(8, 6);
        kd1.insert(5, 9);
        kd1.search(1, 7);
        System.out.print("BFS: ");
        kd1.BFS();
        System.out.print("\nPRE: ");
        kd1.preorder(kd1.root);
        System.out.print("\nIN: ");
        kd1.inorder(kd1.root);
        System.out.print("\nPOST: ");
        kd1.postorder(kd1.root);
        System.out.println();
    }
    
}
