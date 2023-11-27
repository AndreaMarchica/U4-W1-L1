import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la prima stringa");
        String str1 = scanner.nextLine();
        System.out.println("Inserisci la seconda stringa");
        String str2 = scanner.nextLine();
        System.out.println("Inserisci la terza stringa");
        String str3 = scanner.nextLine();

 System.out.println(str1 + " " + str2 + " " + str3);
        scanner.close();
}}