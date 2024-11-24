import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double x,y,z,u,p,x1,y1,z1,u1,p1,x2,y2,z2,u2,p2,x3,y3,z3,u3,p3;
        double k1 = 0;
        double k2 = 0;
        double k3 = 0;
        double k4 = 0;
        double k1_temp = -10000;
        double k2_temp = -10000;
        double k3_temp = -10000;
        double k4_temp = -10000;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> k = new ArrayList<Double>();
        k.add(k1);
        k.add(k2);
        k.add(k3);
        k.add(k4);
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        z = scanner.nextDouble();
        u = scanner.nextDouble();
        p = scanner.nextDouble();
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        z1 = scanner.nextDouble();
        u1 = scanner.nextDouble();
        p1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        z2 = scanner.nextDouble();
        u2 = scanner.nextDouble();
        p2 = scanner.nextDouble();
        x3 = scanner.nextDouble();
        y3 = scanner.nextDouble();
        z3 = scanner.nextDouble();
        u3 = scanner.nextDouble();
        p3 = scanner.nextDouble();
        if (Math.abs(x) > Math.abs(y) + Math.abs(z) + Math.abs(u) && Math.abs(y1) > Math.abs(x1) + Math.abs(z1) + Math.abs(u1)
                && Math.abs(z2) > Math.abs(x2) + Math.abs(y2) + Math.abs(u2) && Math.abs(u3) > Math.abs(x3) + Math.abs(y3) + Math.abs(z3)
                || Math.abs(x) > Math.abs(x1) + Math.abs(x2) + Math.abs(x3) && Math.abs(y) > Math.abs(y1) + Math.abs(y2) + Math.abs(y3)
                && Math.abs(z) > Math.abs(z1) + Math.abs(z2) + Math.abs(z3) && Math.abs(u) > Math.abs(u1) + Math.abs(u2) + Math.abs(u3)) {
            while (k.get(0) - k1_temp > 0.05 || k.get(1) - k2_temp > 0.05 || k.get(2) - k3_temp > 0.05 || k.get(3) - k4_temp > 0.05) {
                k1_temp = k1;
                k2_temp = k2;
                k3_temp = k3;
                k4_temp = k4;
                k1 = (p - y * k.get(1) - z * k.get(2) - u * k.get(3)) / x;
                k2 = (p1 - x1 * k.get(0) - z1 * k.get(2) - u1 * k.get(3)) / y1;
                k3 = (p2 - x2 * k.get(0) - y2 * k.get(1) - u2 * k.get(3)) / z2;
                k4 = (p3 - x3 * k.get(0) - y3 * k.get(1) - z3 * k.get(2)) / u3;
                k.set(0, k1);
                k.set(1, k2);
                k.set(2, k3);
                k.set(3, k4);
            }
            System.out.println("x = " + k.get(0));
            System.out.println("y = " + k.get(1));
            System.out.println("z = " + k.get(2));
            System.out.println("u = " + k.get(3));
            System.out.println(10*k.get(0) - k.get(1) + 2*k.get(2)-k.get(3));
        }
        else {
            System.out.println("Метод Якоби не подходит для данных коэффицентов.");
        }

    }
}