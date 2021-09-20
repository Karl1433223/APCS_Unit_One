import java.util.Scanner;

public class PaintingARoom {
    public static void main(String[] args) {
        int gallon = 350;
        int areaofdoor = 15;
        int areaofwindow = 10;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the Width: ");
        int W = scan.nextInt();
        System.out.println("Please enter the Length: ");
        int L = scan.nextInt();
        System.out.println("Pleas enter the Height: ");
        int H = scan.nextInt();
        System.out.println("Please enter the number of windows: ");
        int numOfWindow = scan.nextInt();
        System.out.println("Please enter the number of doors: ");
        int numOfDoor = scan.nextInt();
        int area = L * W + (2 * L * H) + (2 * W * H) - numOfDoor*areaofdoor - numOfWindow * areaofwindow;
        double numberOfPaint = (int)(area/gallon) + 1;
        System.out.println(numberOfPaint);
    }
}