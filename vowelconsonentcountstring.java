import java.util.*;
public class vowelconsonentcountstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        int vol = 0;
        int consonant = 0;
    
      s = s.toUpperCase();

        for (int i = 0; i < s.length(); i++) {
            char h = s.charAt(i);

            if (h != ' ') { // space ignore karna
                if (h == 'A' || h == 'E' || h == 'I' || h == 'O' || h == 'U') {
                    vol++;
                } else  { 
                    consonant++;
                }
            }
        }

        System.out.println("Vowels: " + vol);
        System.out.println("Consonants: " + consonant);
    }
}
