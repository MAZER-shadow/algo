import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> mapForS = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            mapForS.put(a, mapForS.getOrDefault(a, 0) + 1);
            mapForS.put(b, mapForS.getOrDefault(b, 0) - 1);
        }
        for (Integer some: mapForS.values()) {
            if (some != 0) {
                return false;
            }
        }
        return true;
    }
}
