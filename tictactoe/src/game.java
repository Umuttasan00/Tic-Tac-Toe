import java.util.Scanner;

public class game {

    static String array[][] = new String[3][3];
    public int a,b;


    public void lets (){
        System.out.println("X baslar.");


        array[0][0]="a";
        array[0][1]="b";
        array[0][2]="c";
        array[1][0]="d";
        array[1][1]="e";
        array[1][2]="f";
        array[2][0]="g";
        array[2][1]="h";
        array[2][2]="j";


        for(int rep=0;rep<10;rep++) {
            Scanner xy = new Scanner(System.in);
            System.out.println("Once satir sonra sutun sayisi giriniz");
            a = xy.nextInt();
            b = xy.nextInt();
            if ((rep % 2) == 0) {
                array[(a - 1)][(b - 1)] = "X";
            } else {
                array[(a - 1)][(b - 1)] = "O";
            }
            System.out.println((array[0][0]) + "  |  " + (array[0][1]) + "  |  " + (array[0][2]));
            System.out.println("---|-----|----");
            System.out.println((array[1][0]) + "  |  " + (array[1][1]) + "  |  " + (array[1][2]));
            System.out.println("---|-----|----");
            System.out.println((array[2][0]) + "  |  " + (array[2][1]) + "  |  " + (array[2][2]));

            if (array[0][0].equals(array[0][1]) && array[0][1].equals(array[0][2])) {
                System.out.println("Congra you won !!");
                break;

            } else if (array[1][0].equals(array[1][1]) && array[1][1].equals(array[1][2])) {
                System.out.println("Congra you won !!");
                break;
            } else if (array[2][0].equals(array[2][1]) && array[2][1].equals(array[2][2])) {
                System.out.println("Congra you won !!");
                break;
            } else if (array[0][0].equals(array[1][0]) && array[1][0].equals(array[2][0])) {
                System.out.println("Congra you won !!");
                break;
            } else if (array[0][1].equals(array[1][1]) && array[1][1].equals(array[2][1])) {
                System.out.println("Congra you won !!");
                break;
            } else if (array[0][2].equals(array[1][2]) && array[1][2].equals(array[2][2])) {
                System.out.println("Congra you won !!");
                break;
            } else if (array[0][0].equals(array[1][1]) && array[1][1].equals(array[2][2])) {
                System.out.println("Congra you won !!");
                break;
            } else if (array[0][2].equals(array[1][1]) && array[1][1].equals(array[2][0])) {
                System.out.println("Congra you won !!");
                break;
            }
        }

    }

}
