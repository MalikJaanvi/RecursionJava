public class ReverseString {
    public static void printReverse(String h ,int index){
        if (index<0){
            return;
        }
        System.out.print(h.charAt(index));
        printReverse(h,index-1);
    }

    public static void main(String[] args) {
        String name = "Jaanvi";
        printReverse(name,name.length()-1);
    }
}

//  time complexity = O(n)