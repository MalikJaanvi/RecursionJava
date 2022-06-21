public class Shift_X {

    public static void shiftX(String s,int idx,int count,String newString){
        if(idx == s.length()){
            for (int i=0;i<count;i++){
                newString += 'x';

            }
            System.out.println(newString);
            return;
        }
        if (s.charAt(idx)=='x'){
            count++;
            shiftX(s,idx+1,count,newString);
        }
        else{
            newString +=s.charAt(idx);
            shiftX(s,idx+1,count,newString);
        }
    }

    public static void main(String[] args) {
        shiftX("skxdsjxkxxxkfx",0,0,"");
    }
}

//  time complexity = O(n+count(n)) = O(n+n) = o(2n)