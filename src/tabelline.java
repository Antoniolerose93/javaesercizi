import java.util.Scanner;

public class tabelline {
    public static void main(String[] args){
//         Tabellina
// Obiettivo: Chiedere all'utente di quale numero stampare la tabellina e fino a quale numero arrivare.
// Esempio: numeroTabellina 5, numeroFineTabellina 10
// Output: 0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50
        Scanner scan = new Scanner(System.in);

        //chiedo un numero all'utente
        System.out.print("Inserisci un numero di cui vuoi stampare la tabellina");
        int numeroUtente = scan.nextInt();


        //chiedo il moltiplicatore
        System.out.print("Inserisci il moltiplicatore fino a cui devo arrivare");
        int moltiplicatoreFinale = scan.nextInt();

        //effettuo il calcolo
        for (int i = 0; i <= moltiplicatoreFinale; i++) {
            System.out.println(numeroUtente *i);

        }

    }
}
