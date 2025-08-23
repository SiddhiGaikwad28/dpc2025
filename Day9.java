class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        
        String prefix = strs[0];

        
        for (int i = 1; i < strs.length; i++) {
          
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

  
    public static void main(String[] args) {
        String[] test1 = {"flower", "flow", "flight"};
        String[] test2 = {"dog", "racecar", "car"};
        String[] test3 = {"apple", "ape", "april"};
        String[] test4 = {""};
        String[] test5 = {"alone"};
        String[] test6 = {}; 

        System.out.println(longestCommonPrefix(test1));
        System.out.println(longestCommonPrefix(test2)); 
        System.out.println(longestCommonPrefix(test3));
        System.out.println(longestCommonPrefix(test4)); 
        System.out.println(longestCommonPrefix(test5)); 
        System.out.println(longestCommonPrefix(test6)); 
    }
}
