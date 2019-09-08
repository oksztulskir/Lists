import java.util.HashSet;
import java.util.Set;

/**
 */
public class CommonSubstrings {
    public static void main(String[] args) {
        whatComplexity(2, 100);
        System.out.println(getMaxCommonSubstring(split("AAABBA"), split("ABAABBAAA")));
    }

    private static Set<String> split(String in) {

        Set<String> splitted = new HashSet<String>();

        for (int i = 0; i <= in.length(); i++) {
            for (int j = i+1; j <= in.length(); j++)
            splitted.add(in.substring(i, j));
        }

        return splitted;
    }

    private static String getMaxCommonSubstring(Set<String> list1, Set<String> list2) {
        String maxStr = "";
        for (String element1: list1) {
            for (String element2: list2) {
                if (element1.equals(element2) && element1.length() >= maxStr.length()) {
                    maxStr = element1;
                }
            }
        }

        return maxStr;
    }

    private static boolean isPrime(int number) {
        int count = 0;
        for (int i = 2; i < Math.sqrt((double)number); i++) {
            count++;
            if (number % i == 0) {
//                System.out.println("Dla liczby:  + number + ” opeacji wykonanych: ” + count);
                return false;
            }
        }
//        System.out.println(“Dla liczby: ” + number + ” opeacji wykonanych: ” + count);
        return true;
    }
    private static void whatComplexity (int from, int to) {
        for (int i = from; i <= to; i++) {
            System.out.println(isPrime(i));
        }
    }
}
