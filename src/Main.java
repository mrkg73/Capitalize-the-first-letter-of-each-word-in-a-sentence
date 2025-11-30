import java.util.Scanner;
public class Main
{
  public  static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");

        Scanner newscan = new Scanner(sc.nextLine());
        sc.close();
        newscan.tokens().map(s-> Character.toUpperCase(s.charAt(0)) + s.substring(1) ).forEach(s->System.out.print(s+" "));
    }
}
