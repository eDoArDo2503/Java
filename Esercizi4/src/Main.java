import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
        System.out.println("inserisci il tempo in secondi");
        int sec=in.nextInt();
        int g=sec/86400;
        int h=(sec-g*86400)/3600;
        int m=((sec-(g*86400))-(h*3600))/60;
        int s=(((sec-(g*86400))-(h*3600)))-(m*60);
        System.out.println("Il tempo da lei inserito equivale a:"+g+"g,"+h+"h,"+m+"m,"+s+"s");
        in.close();
    }
}