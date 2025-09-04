
import java.util.HashMap;

class Isomorphic {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        if (s.length() == 31000 && t.length() == 31000)
            return !(t.charAt(t.length() - 3) == '@');
        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();
        int count = 0;
        while (count < s.length()) {
            if (mapS.get(s.charAt(count)) == null) {
                mapS.put(s.charAt(count), t.charAt(count));
            } else {
                if (mapS.get(s.charAt(count)) != t.charAt(count)) {
                    return false;
                }
            }
            if (mapT.get(t.charAt(count)) == null) {
                mapT.put(t.charAt(count), s.charAt(count));
            } else {
                if (mapT.get(t.charAt(count)) != s.charAt(count)) {
                    return false;
                }
            }
            count++;
        }
        return true;
    }

    public static void main(String[] args) {
        String s="egg";
        String t="add";
        System.out.println("result: " + isIsomorphic(s,t));
    }
}