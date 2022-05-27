import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        var i = 0;
        var j = 0;

        System.out.println("Ciclo while...");
        while(i < 3){
            System.out.println("i= " + i);
            i++;
        }
        System.out.println();
        System.out.println("Ciclo do-while...");
        do{
            System.out.println("j= " + j);
            j++;
        } while(j < 3);
    }
}
