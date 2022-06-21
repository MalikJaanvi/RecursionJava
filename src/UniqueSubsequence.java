import java.util.HashSet;

public class UniqueSubsequence {
    // using hashset

    public static void uniqueSubsequences(String s,int idx,String newString,HashSet<String> set){
        if (idx == s.length()){
            if (!set.contains(newString)) {
                System.out.println(newString);
                set.add(newString);
                return;
            }
            else{
                return;
            }
        }
        char currchar = s.charAt(idx);
        uniqueSubsequences(s,idx+1,newString+currchar,set);
        uniqueSubsequences(s, idx+1, newString,set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> hashSet = new HashSet<>();
        uniqueSubsequences(str,0,"",hashSet);
    }
}

// timeComplexity = O(n)