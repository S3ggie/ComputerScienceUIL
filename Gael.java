import java.util.*;
import java.io.*;
public class Gael{
  public static void main(String[] args)throws IOException{
    Scanner sc = new Scanner(new File("gael.dat"));
    int x = sc.nextInt();
    for(int i=0;i<x;i++){
      String word = sc.next();
      String word1 = word.substring(1,word.length()-1);
      System.out.println(word);
      for(int j=0;j<word1.length();j++){
        System.out.print(word1.charAt(j));
        for(int k=0;k<word1.length();k++){
          System.out.print(" ");
        }
        System.out.println(word1.charAt(word1.length()-1-j));
      }
      for(int j=word.length()-1;j>-1;j--){
        System.out.print(word.charAt(j));
      }
      System.out.println();
    }
  }
}