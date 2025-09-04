class Rotate {
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        return (s + s).contains(goal);
    }

    public static void main(String[] args) {
        String s="abcde";
        String g="cdeab";
        System.out.print("rotate: " + rotateString(s, g));
    }
}