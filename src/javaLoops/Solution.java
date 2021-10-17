package javaLoops;

import java.util.*;
import java.io.*;
import java.lang.Math;



class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        double previous=0,current=0,count=0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++){
                if(j==0){
                    current=previous+(a+Math.pow(2,count)*b);
                    System.out.print((int)current+" ");
                }
                else{
                current=previous+Math.pow(2,count)*b;
                System.out.print((int)current+" ");
            }
                previous=current;
                count++;
            }
            previous=0;current=0;count=0;
            System.out.println();
        }
        
        
        in.close();
    }
}
