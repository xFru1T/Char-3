import java.util.Scanner;
class Char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print symbol for checking on number: ");
        char letter = scanner.next().charAt(0);
        System.out.println(letter + " is number? " + Character.isDigit(letter));
        }
    }
