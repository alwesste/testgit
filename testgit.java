import java.util.Scanner;

class testgit {
    public static void main(String[] args) {
        System.out.println("Bonjour dev222222!");
        //test

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Décommenté pour attendre l'entrée utilisateur
        // String name = "John"; // Commenté pour ne pas attribuer une valeur fixe

        switch (name.toLowerCase()) {
            case "john":
                System.out.println("Hello, John!");
                break;
            case "leopold":
                System.out.println("Hello, Leopold!");
                break;
            case "alice":
                System.out.println("Hello, Alice!");
                break;
            default:
                System.out.println("Personne ne vous connais !");
                break;
        }

        scanner.close();
        System.out.println("Goodbye, " + name + "!");
    }
}