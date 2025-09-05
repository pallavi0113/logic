

import java.util.*;

class Sort {

    // static {
    //     for (int i = 0; i < 500; i++) {
    //         frequencySort(new String());
    //     }
    // }

    // public static int findMaxI(int[] f) {
    //     int maxi = 0;
    //     int max = 0;
    //     for (int i = 0; i < f.length; i++) {
    //         if (f[i] > max) {
    //             maxi = i;
    //             max = f[i];
    //         }
    //     }
    //     return maxi;
    // }

    public static String frequencySort(String s) {
        // int[] f = new int[128];
        // for (char c : s.toCharArray()) {
        //     f[c] += 1;
        // }
        // char[] res = new char[s.length()];
        // int i = 0;
        // while (i < s.length()) {
        //     int maxi = findMaxI(f);
        //     int freq = f[maxi];
        //     while (freq > 0) {
        //         res[i++] = (char) (maxi);
        //         freq--;
        //     }
        //     f[maxi] = 0;
        // }
        // return new String(res);

         Map<Character,Integer> freq=new HashMap<>();
        for(char c: s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(freq.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());
        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character,Integer>entry:list){
            char c=entry.getKey();
            int count=entry.getValue();
            for(int i=0;i<count;i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="cccaaa";
        System.out.println("result: "+ frequencySort(s));
    }
}