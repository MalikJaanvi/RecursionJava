public class KeypadCombination {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printCombination(String str,int idx,String Combination){
        if(idx == str.length()){
            System.out.println(Combination);
            return;
        }
        char currentChar = str.charAt(idx);
        String mapping = keypad[currentChar -'0'];
        for (int i=0; i< mapping.length();i++){
            printCombination(str,idx+1,Combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String num = "12";
        printCombination(num,0,"");
    }
}

// timecomplexity = o(4^n) n=length of string , 4= maximum length of choice of mapping i.e pqrs