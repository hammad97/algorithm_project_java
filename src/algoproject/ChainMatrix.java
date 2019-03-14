/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoproject;

/**
 *
 * @author Moiz
 */
public class ChainMatrix {
        int n;
        int p[];
        String table1;
        String table2;
        int s[][];
        int m[][];
        int res;
    public ChainMatrix(int no, int parr[])
    {
        n=no;
        p=new int[parr.length];
        for (int i=0;i<parr.length;i++)
        {
            p[i]=parr[i];
        }
        table1=" ";
        table2=" ";
    }
    public void calculate()
    {
        m = new int[n+1][n+1];
        s = new int[n+1][n+1];
        for (int i = 1; i < n; i++)
        {
            m[i][i] = 0;
            s[i][i] = 0;
        }
        for (int l=2; l<=n; l++)
        {
            for (int i=1; i<=n-l+1; i++)
            {
                int j = i+l-1;
                m[i][j] = Integer.MAX_VALUE;
                for (int k=i; k<=j-1; k++)
                {
                    // q = cost/scalar multiplications
                    int q = m[i][k] + m[k+1][j] + p[i-1]*p[k]*p[j];
                    if (q < m[i][j])
                    {
                        m[i][j] = q;
                        s[i][j] = k;
                    }
                }
            }
        }
        table1="<html>";
	StringBuilder sb=new StringBuilder(table1);
        
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n;j++)
            {
                sb.append(m[i][j]+"     ");
//                System.out.print(m[i][j]+"\t");
            }
            sb.append("<br>");
            System.out.println();
        }
        sb.append("</html>");
        table1=sb.toString();
//        System.out.println();
//        System.out.println();
        table2="<html>";
	StringBuilder sb2=new StringBuilder(table2);
        
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n;j++)
            {
                sb2.append(s[i][j]+"       ");
//                System.out.print(s[i][j]+"\t");
            }
            sb2.append("<br>");
            System.out.println();
        }
        sb2.append("</html>");
        table2=sb2.toString();
        
        
        //res = mult(p,1,n);
            res = m[1][n];
        
//        System.out.println(res);
    }
    public String printOptimalParens(int i, int j)
    {
        if(i == j)
            return "A"+i;
        else
            return "(" + printOptimalParens(i, s[i][j]) + printOptimalParens(s[i][j] + 1, j) + ")";
    }    
//    public int mult(int p[], int i, int j)
//    {
//        if (i==j)
//        {
//            return 0;
//        }
//        int min = Integer.MAX_VALUE;
//        for (int k=i; k<j; k++)
//        {
//            int count = mult(p, i, k) + mult(p, k+1, j) + p[i-1]*p[k]*p[j];
//            if (count < min)
//            {
//                min = count;
//            }
//        }
//        return min;
//    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
