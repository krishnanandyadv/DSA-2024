import java.util.Scanner;

public class MultiplicativeCipher {

    // Encrypt function
    public static String encrypt(String plainText, int key) {
        StringBuilder cipherText = new StringBuilder();
        
        for (char ch : plainText.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toUpperCase(ch);
                char encryptedChar = (char) (((ch - 'A') * key % 26) + 'A');
                cipherText.append(encryptedChar);
            } else {
                cipherText.append(ch);
            }
        }
        
        return cipherText.toString();
    }

    // Decrypt function
    public static String decrypt(String cipherText, int key) {
        StringBuilder plainText = new StringBuilder();
        int keyInverse = modInverse(key, 26);

        for (char ch : cipherText.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toUpperCase(ch);
                char decryptedChar = (char) (((ch - 'A') * keyInverse % 26) + 'A');
                plainText.append(decryptedChar);
            } else {
                plainText.append(ch);
            }
        }
        
        return plainText.toString();
    }

    // Function to find the modular multiplicative inverse
    public static int modInverse(int a, int m) {
        a = a % m;
        for (int x = 1; x < m; x++) {
            if ((a * x) % m == 1) {
                return x;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Encrypt using Multiplicative Cipher");
            System.out.println("2. Decrypt using Multiplicative Cipher");
            System.out.println("3. Exit");
            System.out.print("Your choice: ");
            
            int choice = Integer.parseInt(sc.nextLine());

            if (choice == 1) {
                System.out.println("Enter a string for encryption: ");
                String inputStr = sc.nextLine();

                System.out.println("Enter the key for encryption: ");
                int key = Integer.parseInt(sc.nextLine());

                String encryptedData = encrypt(inputStr, key);
                System.out.println("Encrypted Data ===> " + encryptedData);

            } else if (choice == 2) {
                System.out.println("Enter a string for decryption: ");
                String inputStr = sc.nextLine();

                System.out.println("Enter the key for decryption: ");
                int key = Integer.parseInt(sc.nextLine());

                String decryptedData = decrypt(inputStr, key);
                System.out.println("Decrypted Data ===> " + decryptedData);

            } else if (choice == 3) {
                System.out.println("Exiting the program...");
                break;

            } else {
                System.out.println("Invalid choice! Please choose a valid option.");
            }
        }
        
        sc.close();
    }
}

