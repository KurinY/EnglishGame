/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicpro;

import java.util.*;

/**
 *
 * @author kiwi906
 */
public class Games {
    
    public Games(){}
    
    public static String[][] table(ArrayList<String> words){
        String[][] ses = new String[10][10];
        for(int k=0;k<10;k++)
            for(int l=0;l<10;l++)
                ses[k][l]="*";
        int c=0,r,y;
        String wor;
        Random x = new Random();
        while(c<5){
            wor=words.get(x.nextInt(words.size()));
            r=x.nextInt(10);y=x.nextInt(10);
            
        }
        return ses;
    }
    
    public String anagramma(String s){
        char[] ses= new char[s.length()];
        for(int k=0;k<ses.length;k++)
            ses[k]=' ';
        String out="";
        int c=0;
        Random x = new Random();
        while(c<s.length()){
            int y= x.nextInt(s.length());
            if(ses[y]==' '){
                ses[y]=s.charAt(c);
                c++;
            }
        }
        out=String.valueOf(ses);
        return out;
    }
    
    private String[][] position(String w, int p0,int p1, String[][] mat){
        int[] ava=new int[8];
        Random x = new Random();
        
        
                
                
        
                
        return mat;
    }
    
    private int[] check(String w, int p0,int p1,String[][] mat){
        int n[]=new int[8];
        //Check up
        n[0]=0;
        if((p1-w.length()+1)<0)
            n[0]=-1;
        else
            for(int k=p1;k>p1-w.length()+1;k--){
                if(!mat[p0][k].equals("*")){
                    n[0]=1;
                    break;
                }
            }
        //Check up est

        //Check up west
                
        //Check down
        n[4]=0;
        if((p1+w.length()-1)<0)
            n[4]=-1;
        else
            for(int k=p1;k<p1+w.length()-1;k++){
                if(!mat[p0][k].equals("*")){
                    n[4]=1;
                    break;
                }
            }
                
        //Check down est
                
        //Check down west
                
        //Check right
        n[2]=0;
        if((p0+w.length()-1)<0)
            n[2]=-1;
        else
            for(int k=p0;k<p0+w.length()-1;k++){
                if(!mat[k][p1].equals("*")){
                    n[2]=1;
                    break;
                }
            }
        //Check left
        n[6]=0;
        if((p0-w.length()+1)<0)
            n[6]=-1;
        else
            for(int k=p0;k>p0-w.length()+1;k--){
                if(!mat[k][p1].equals("*")){
                    n[6]=1;
                    break;
                }
            }  
        
        return n;
    }
}
