import java.util.Scanner;

public class CaesarCipherExample   
{   
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";   
      
    public static String encryptData(String inputStr, int shiftKey)   
    {   
        boolean isLowerCase = Character.isLowerCase(inputStr.charAt(0));
        inputStr = inputStr.toLowerCase();   
        String encryptStr = "";   
          
        for (int i = 0; i < inputStr.length(); i++)   
        {   
            int pos = ALPHABET.indexOf(inputStr.charAt(i));   
            int encryptPos = (shiftKey + pos) % 26;   
            char encryptChar = ALPHABET.charAt(encryptPos);   
            encryptStr += encryptChar;   
        }   
        
        return isLowerCase ? encryptStr.toUpperCase() : encryptStr.toLowerCase();   
    }   
      
    public static String decryptData(String inputStr, int shiftKey)   
    {   
        boolean isLowerCase = Character.isLowerCase(inputStr.charAt(0));
        inputStr = inputStr.toLowerCase();   
        String decryptStr = "";   
          
        for (int i = 0; i < inputStr.length(); i++)   
        {   
            int pos = ALPHABET.indexOf(inputStr.charAt(i));   
            int decryptPos = (pos - shiftKey) % 26;   
            if (decryptPos < 0) {   
                decryptPos = ALPHABET.length() + decryptPos;   
            }   
            char decryptChar = ALPHABET.charAt(decryptPos);   
            decryptStr += decryptChar;   
        }   
        
        return isLowerCase ? decryptStr.toUpperCase() : decryptStr.toLowerCase();   
    }   
    
    public static int findKey(String plainText, String cipherText) {
        plainText = plainText.toLowerCase();
        cipherText = cipherText.toLowerCase();
        int key = -1;
        
        for (int i = 0; i < plainText.length(); i++) {
            int plainPos = ALPHABET.indexOf(plainText.charAt(i));
            int cipherPos = ALPHABET.indexOf(cipherText.charAt(i));
            
            if (plainPos != -1 && cipherPos != -1) {
                key = (cipherPos - plainPos + 26) % 26;
                break;
            }
        }
        
        return key;
    }

    public static void main(String[] args)   
    {   
        Scanner sc = new Scanner(System.in);   
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Encrypt");
            System.out.println("2. Decrypt");
            System.out.println("3. Find Key");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.valueOf(sc.nextLine());
            
            if (choice == 1) {
                System.out.println("Enter a string for encryption using Caesar Cipher: ");   
                String inputStr = sc.nextLine();   
                  
                System.out.println("Enter the value by which each character in the plaintext message gets shifted: ");   
                int shiftKey = Integer.valueOf(sc.nextLine());   
                  
                String encryptedData = encryptData(inputStr, shiftKey);
                System.out.println("Encrypted Data ===> " + encryptedData); 
                
            } else if (choice == 2) {
                System.out.println("Enter a string for decryption using Caesar Cipher: ");   
                String inputStr = sc.nextLine();   
                  
                System.out.println("Enter the value by which each character in the ciphertext message was shifted: ");   
                int shiftKey = Integer.valueOf(sc.nextLine());   
                  
                String decryptedData = decryptData(inputStr, shiftKey);
                System.out.println("Decrypted Data ===> " + decryptedData); 
                
            } else if (choice == 3) {
                System.out.println("Enter the plaintext to find the key: ");
                String plainText = sc.nextLine();
                System.out.println("Enter the ciphertext to find the key: ");
                String cipherText = sc.nextLine();
                
                int foundKey = findKey(plainText, cipherText);
                System.out.println("Found Key ===> " + foundKey);
                
            } else if (choice == 4) {
                System.out.println("Exiting the program...");
                break;
            } else {
                System.out.println("Invalid choice! Please choose a valid option.");
            }
        }
        
        sc.close();   
    }   
}  
