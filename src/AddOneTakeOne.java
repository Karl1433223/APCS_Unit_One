import java.util.Scanner;

public class AddOneTakeOne {

    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter a number");
    int Enteranumber=scan.nextInt();
    Enteranumber--;
    System.out.println(Enteranumber);
    Enteranumber++;
    System.out.println(Enteranumber++);
    System.out.println(Enteranumber++);

    }
}
