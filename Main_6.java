import java.io .PrintStream;
import java.util.Scanner;

public class Main_6 {
    public static Scanner in = new Scanner( System.in );
    public static PrintStream out = System.out;
    public static void main(String[] Args) {
        double x = in.nextDouble();
        double y = in.nextDouble();
        double R = 6;
        if (((x*x+y*y <= R*R) && (x<=0) && (y>=0) && ((x+2)*(x+2) + (y-3)*(y-3) >=2*2) && (y>=0.2*x+1) || (((x+1)*(x+1) + (y-3)*(y-3) <= 1*1) && (x<=0) && (y>=0))) || ((x*x+y*y <=R*R) && (x<=-5) && (y<=0)) || ((x*x+y*y <=R*R) && (x<=0) && (y<=-3) && (y<=-0.4*x-5)) || ((x+3)*(x+3) + (y+1)*(y+1) <= 1*1) || ((x+1)*(x+1) + (y+3)*(y+3) <= 1*1))    {

            out.println("YES");
        }
        else{
            out.println("NO");
        }
    }
}