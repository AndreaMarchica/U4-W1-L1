public class Main1 {
    public static int moltiplica(int num1 , int num2){
        return  num1 * num2;
    }
    public static String concat(String word, int num3){
        return (word + num3);
    }
    //public static String[] inserisciInArray(String[] array1 , String word2){
    //    return String[] array2 = new String[6]
   // };

    public static void main(String[] args) {
        // Invoca i tre metodi in sequenza e stampa i risultati
        int prodotto = moltiplica(3, 4);
        System.out.println("Prodotto: " + prodotto);

        String stringaConcatenata = concat("Aiuto", 5);
        System.out.println("Stringa concatenata: " + stringaConcatenata);
    }
}