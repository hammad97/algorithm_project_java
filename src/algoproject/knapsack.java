/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoproject;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class knapsack {
    public int W;
    public int myI;
    public int v[];
    public int w[];
    public int result[][];
    public String finalResult;
    public int keep[][];
    public String table1;
    public String table2;
    knapsack(int tW,int tmyI){
        W=tW;
        myI=tmyI;
        v= new int[myI+1];
        w= new int[myI+1];
	v[0]=0;
	w[0]=0;
        result = new int [myI+1][W+1];
        keep = new int [myI+1][W+1];
        finalResult=" ";
    }
    
    public void calculate(){
//        Scanner in=new Scanner(System.in);
//	System.out.println("Enter value for W:");
//	W=in.nextInt();
//	System.out.println("Enter value for i:");
//	myI=in.nextInt();
//        v= new int[myI+1];
//        w= new int[myI+1];
	
//	System.out.println("Enter values for v[]");
//	for(int j=1;j<myI+1;j++){               //nope
//		v[j]=in.nextInt();
//	}
//	
//	System.out.println("Enter values for w[]");
//	for(int j=1;j<myI+1;j++){               //nope
//		w[j]=in.nextInt();
//	}	
//	v[0]=0;
//	w[0]=0;
//        result = new int [myI+1][W+1];
//        keep = new int [myI+1][W+1];
	
	for(int j=0;j<myI+1;j++){
		for(int k=0;k<W+1;k++){
			result[j][k]=0;
			keep[j][k]=0;
		}
	}

	for(int j=1;j<myI+1;j++){
		for(int k=0;k<W+1;k++){
			if(w[j]<=k){
				int a=result[j-1][k];
				int b=v[j]+result[j-1][k-w[j]];
				result[j][k] = Integer.max(a, b);
			}
			else
				result[j][k] = result[j-1][k];
		}
	}
	
	for(int j=1;j<myI+1;j++){
		for(int k=0;k<W+1;k++){
			if(result[j][k]!=result[j-1][k])
				keep[j][k]=1;
			else	
				keep[j][k]=0;
		}
	}
        table1="<html>";
	StringBuilder sb=new StringBuilder(table1);
        
	for(int j=0;j<myI+1;j++){              //table1
		for(int k=0;k<W+1;k++){
                        sb.append(result[j][k]+"     ");
		}
                sb.append("<br>");
//		System.out.println();
		
	}
        sb.append("</html>");
        table1=sb.toString();
        table2="<html>";
	StringBuilder sb2=new StringBuilder(table2);	
//	System.out.println();
//        System.out.println();
	for(int j=0;j<myI+1;j++){              //table2
		for(int k=0;k<W+1;k++){
//                    System.out.print(keep[j][k]+"       ");
                    sb2.append(keep[j][k]+"       ");
		}
                sb2.append("<br>");
//		System.out.println();
        }
        sb2.append("</html>");
        table2=sb2.toString();
        
        StringBuilder sb3=new StringBuilder(finalResult);
        sb3.append("Best Combination:");
        int k =W;
        for(int a=myI;a>=1;a--){
            if(keep[a][k]==1){
                sb3.append(a);
                if(a!=1)
                    sb3.append(',');
                k=k-w[a];
            }
        }
        finalResult=sb3.toString();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        knapsack obj=new knapsack(10,4);
//        obj.calculate();
//        System.out.println(obj.table1);
//        System.out.println(obj.table2);
    }    
}
