import java.util.*;

public class ReverseWords {
    public static String reverseWords(String s) {
        
        s = s.trim();

        
        String[] words = s.split("\\s+");

  
        Collections.reverse(Arrays.asList(words));

       
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(reverseWords("the sky is blue"));       
        System.out.println(reverseWords("  hello world  "));       
        System.out.println(reverseWords("a good   example"));      
        System.out.println(reverseWords("    "));                  
        System.out.println(reverseWords("word"));                  
    }
}
