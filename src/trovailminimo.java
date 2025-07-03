public class trovailminimo {
    //     Trova il valore massimo all'interno di un array di interi.
// Esempio: int [] a = {1, 2, 3, 4, 5}
// Output: 5

public static void main(String[] args) {

int [] numeri = {10, 5, 31, 44, 56};
        
int min = numeri[0];

for (int i = 0; i < numeri.length; i++) {
    if (numeri[i] < min) {
        min = numeri[i];
    }
}

System.out.println("il minimo è : " + min);

}

}
