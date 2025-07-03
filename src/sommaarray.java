
public class sommaarray {
    public static void main(String[] args) {
    
//     Calcola la somma di tutti gli elementi di un array.
// Esempio: int [] a = {1, 2, 3, 4, 5}
// Output: 15
    
        int [] numeri = {10, 50, 31, 44, 56};
        int somma = 0;      
        for (int i = 0; i < numeri.length; i++) {
            somma += numeri[i];
  }

System.out.println("la somma è: " + somma);

}

}