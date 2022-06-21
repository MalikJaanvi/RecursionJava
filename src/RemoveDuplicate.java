public class RemoveDuplicate {
// only applied to lower case Sentences.
    static boolean[] map = new boolean[26];
    public static void removeDuplicate(String s,int idx, String newString){
        if (idx == s.length()){
            System.out.println(newString);
            return;
        }
        char currchar = s.charAt(idx);
        if (map[currchar-'a']){
            removeDuplicate(s,idx+1,newString);
        }else {
            newString+=currchar;
            map[currchar-'a']=true;
            removeDuplicate(s,idx+1,newString);
        }
    }

    public static void main(String[] args) {
        String str = "jaanvi";
        removeDuplicate(str,0,"");
    }
}

//  time complexity = O(n)