public class trovailmassimo {
//     Trova il valore massimo all'interno di un array di interi.
// Esempio: int [] a = {1, 2, 3, 4, 5}
// Output: 5

public static void main(String[] args) {

int [] numeri = {10, 50, 31, 44, 56};
        
int max = numeri[0];

for (int i = 0; i < numeri.length; i++) {
    if (numeri[i] > max) {
        max = numeri[i];
    }
}

System.out.println("il massimo è : " + max);

}

}
