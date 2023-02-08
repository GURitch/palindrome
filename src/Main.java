import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

//        Я нем и рад я, так, трамвай, январь равняй, а в март катя, дари меня

        String textChange = text.toLowerCase().replace(" ", "").replace(",","");
        char[] symbols = textChange.toCharArray();

        for (int i = 0; symbols.length / 2 > i; i++) {

            if (symbols[i] != symbols[symbols.length - i - 1]) {
                System.out.println("Строка '"+text+"' НЕ является палиндромом");
                return;
            }
        }
        System.out.println("Строка '"+text+"' является палиндромом");
    }
}