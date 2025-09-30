import java.util.Scanner;
public class DebugFour3
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int w, l, h;
        DebugBox box1;

        System.out.print("Enter width for the box >> ");
        w = input.nextInt();

        System.out.print("Enter length for the box >> ");
        l = input.nextInt(); 

        System.out.print("Enter height for the box >> ");
        h = input.nextInt(); 
        
        box1 = new DebugBox(w, l, h);

        System.out.println("Box 1 :");
        box1.showData();
        System.out.println("Volume: " + box1.getVolume());

        input.close();
    }
}