import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("inserisci i 2 valori da sommare");
        double v1= in.nextDouble();
        double v2=in.nextDouble();
        double ris= v1+v2;
        System.out.println("Il risultato della somma dei valori è:"+ris);
        in.close();

    }
}