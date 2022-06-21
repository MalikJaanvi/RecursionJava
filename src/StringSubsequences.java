public class StringSubsequences {
    // having only unique element
    public static void subsequences(String str,int idx,String newString){
        if (idx== str.length()){
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(idx);
        // to be in subsequence
        subsequences(str,idx+1,newString+currentChar);

        // not to be
        subsequences(str, idx+1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        subsequences(str,0,"");
    }
}

// time complexity --> 2^n + 2^n-1 + 2^n-3 .......1(gp) = formula of gp = a(r^n-1)/r-1
//              =1(2^n+1-1)/2-1         (r:common diff)
//                =(2^n+1-1)
//  ==>  O(2^n)