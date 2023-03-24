import java.util.*;
import java.io.*;
public class Bianca{
  public static void main(String[] args)throws IOException{
    Scanner sc = new Scanner(new File("bianca.dat"));
    int x = sc.nextInt();
    for(int i=0;i<x;i++){
      int a = sc.nextInt();
      int b = sc.nextInt();
      double calculation = Math.sqrt(a*a+b*b);
      System.out.printf("%.2f\n",calculation);
    }
  }
}