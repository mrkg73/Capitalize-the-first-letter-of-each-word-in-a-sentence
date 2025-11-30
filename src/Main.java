import java.util.Scanner;
public class Main
{
  public  static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");

        Scanner newscan = new Scanner(sc.nextLine());
        sc.close();
        StringBuilder nam2 = new StringBuilder();


        while (newscan.hasNext())
        {
            String nm= newscan.next();
         nam2.append(Character.toUpperCase(nm.charAt(0)) +nm.substring(1) + " ");

        }
        System.out.print(nam2);

    }
}
