import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

String [] ros1 = new String [10];
String [] ros2 = new String [12];
Scanner Scan = new Scanner(System.in);

for(int i=0; i<ros1.length; i++)
    {
      System.out.println("What's your name?");
      ros1[i] = Scan.next();
      ros2[i] =ros1[i];
    }

      ros2[10] = "Duncann";
      ros2[11] = "Lacey";

      for(int i=0; i<ros2.length; i++)
      {
    
        System.out.println("In Our class there is " + ros2[i]);
      };

  }
}