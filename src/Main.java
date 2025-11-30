import java.util.Scanner;
public class Main
{
  public  static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String nam=sc.nextLine();
        sc.close();


        int size=nam.length();
        StringBuilder nam2= new StringBuilder();


        for (int i=0; i<size; i+=1)
        {
            if( i==0 &&Character.isLetter(nam.charAt(i)) ) nam2.append(Character.toUpperCase(nam.charAt(i)));
           else if( !Character.isLetter(nam.charAt(i-1)) )  nam2.append(Character.toUpperCase(nam.charAt(i)));
            else nam2.append(nam.charAt(i));
        }
        System.out.print(nam2);

    }
}
