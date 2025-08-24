import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars); // Sorted word as key

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] input1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] input2 = {""};
        String[] input3 = {"a"};
        String[] input4 = {"abc", "bca", "cab", "xyz", "zyx", "yxz"};
        String[] input5 = {"abc", "def", "ghi"};

        System.out.println(groupAnagrams(input1));
        System.out.println(groupAnagrams(input2));
        System.out.println(groupAnagrams(input3));
        System.out.println(groupAnagrams(input4));
        System.out.println(groupAnagrams(input5));
    }
}
