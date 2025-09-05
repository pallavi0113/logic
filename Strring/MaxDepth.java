class MaxDepth {
    public static int maxDepth(String s) {
    //      int maxDepth = 0;
    // int currentDepth = 0;

    // for (char c : s.toCharArray()) {
    //     if (c == '(') {
    //         currentDepth++;
    //         maxDepth = Math.max(maxDepth, currentDepth);
    //     } else if (c == ')') {
    //         currentDepth--;
    //     }
    // }

    // return maxDepth;

        int maxD=0;
        int currD=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                currD++;
                maxD=Math.max(maxD,currD);
            }
            else if(s.charAt(i)==')'){
                currD--;
            }
        }
        return maxD;
    }

    public static void main(String[] args) {
        String s="(1+(2*3)+((8)/4))+1";
        System.out.println("Result depth: " + maxDepth(s));
    }
}