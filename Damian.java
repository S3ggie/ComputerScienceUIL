import java.util.*;
import java.io.*;
public class Damian{
  public static boolean isGrowingNumber(int x){
    String num = ""+x;
    for(int i=0;i<num.length();i++){
      if(i==num.length()-1){break;}
      if((int)num.charAt(i)>=(int)num.charAt(i+1)){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args)throws IOException{
    Scanner sc = new Scanner(new File("damian.dat"));
    int x = sc.nextInt();
    for(int i=0;i<x;i++){
      int y = sc.nextInt();
      for(int j=1;j<=y;j++){
        if(y%j==0 && isGrowingNumber(j)){
          System.out.print(j+" ");
        }
      }
      System.out.println();
    }
  }
}