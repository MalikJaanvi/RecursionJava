public class PrintOccurance {

    static int first =-1;
    static int last =-1;
    //print first occurance and last occurance of given character
    public static void printOccurance(String s,int idx,char chrctr){
        if (idx == s.length()){
            System.out.println("First occurance of "+chrctr+" is at "+first);
            System.out.println("Last occurance of "+chrctr+" is at "+last);
            return;
        }

        char currchar = s.charAt(idx);
        if (currchar == chrctr){
            if (first == -1){
                first = idx;
            }
            else {
                last = idx;
            }
        }
        printOccurance(s,idx+1,chrctr);
    }

    public static void main(String[] args) {
        String str = "dscfkjehodsfmcc";
        printOccurance(str,0,'c');
    }
}

//  time complexity = O(n)