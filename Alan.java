import java.io.*;
import java.util.*;
public class Alan{
  public static void main(String[] args)throws IOException{
    Scanner sc = new Scanner(new File("alan.dat"));
    int x = sc.nextInt();
    for(int i=0;i<x;i++){
      int num = sc.nextInt();
      System.out.print(num+" degrees Fahrenheit is equal to ");
      double kelvin = 5.0/9 * (num-32) + 273.15;
      System.out.printf("%.2f Kelvin\n",kelvin);
    }
  }
}