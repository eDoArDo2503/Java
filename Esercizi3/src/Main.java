import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("inserisci il numero di giorni");
        int giorni=in.nextInt();
        System.out.println("inserisci il numero di ore");
        int ore=in.nextInt();
        System.out.println("inserisci il numero di minuti");
        int minuti=in.nextInt();
        System.out.println("inserisci il numero di secondi");
        int secondi=in.nextInt();
        int sectot=(giorni*86400+ore*3600+minuti*60+secondi);
        System.out.println("I secondi totali sono: "+sectot);
        in.close();
    }
}