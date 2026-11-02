import java.util.Scanner;

public class App{
 public static void main(String[] args){
  Scanner sc = new  Scanner(System.in);
  int x,y;
  x=sc.nextInt();
  y=sc.nextInt();
  System.out.printf("%d\n",x+y);
  System.out.printf("%d\n",x-y);
  sc.close();
 }
}
