import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("inserisci i 2 valori da cui fare la somma, divisione, moltiplicazione e divisione");
        double v1= in.nextDouble();
        double v2=in.nextDouble();
        double riss= v1+v2;
        double risss=v1-v2;
        double rism=v1*v2;
        double risd=v1/v2;
        System.out.println("Il risultato della somma dei valori è:"+riss+", Il risultato della sottrzione dei valori è:"+risss+", Il risultato della moltiplicazione dei valori è:"+rism+", Il risultato della divisione dei valori è:"+risd);
        in.close();
    }
}