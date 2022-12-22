import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inpout=new Scanner(System.in);
        System.out.println("Dimmi quanto valgono i  2 lati diversi del rettangolo");
        double l1;
        l1=inpout.nextDouble();
        double l2;
        l2=inpout.nextDouble();
        double Area;
        Area=l1*l2;
        double perimetro= (l1+l2)*2;
        System.out.println("Il perimetro del rettagolo è: "+perimetro+" L'area del rettangolo è: "+Area);
        System.out.println("Dimmi i valori dei 2 lati del triangolo, poi la base e poi dell'altezza");
        l1=inpout.nextDouble();
        l2=inpout.nextDouble();
        double b;
        b=inpout.nextDouble();
        double h;
        h=inpout.nextDouble();
        double AreaT;
        AreaT=(b*h)/2;
        double perimetrot= (l1+l2+b);
        System.out.println("Il perimetro del triangolo è: "+perimetrot+" L'area del triangolo è: "+AreaT);
        System.out.println("Dimmi il lato del quadrato");
        l1=inpout.nextDouble();
        Area=l1*l1;
        perimetro= l1*4;
        System.out.println("Il perimetro del quadrato è: "+perimetro+" L'area del quadrato è: "+Area);
        System.out.println("Dimmi il valore del raggio del cerchio");
       double r=inpout.nextDouble();
        Area= Math.PI *(r*r);
        double circonferenza=2*Math.PI*r ;
        System.out.println("La circonferenza del cerchio è: "+circonferenza+" L'area del cerchio è: "+Area);
        inpout.close();
    }
}