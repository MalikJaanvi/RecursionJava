public class TowerOfHanoi {
    public static void towerOfHanoi(int n,String src,String helper ,String dest){
        if (n==1){
            System.out.println("transfer disk from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,helper);
        System.out.println("transfer disk from "+src+" to "+dest);
        towerOfHanoi(n-1,helper,src,dest);
    }

    public static void main(String[] args) {
        towerOfHanoi(3,"Source","helper","destination");
    }
}

//  time complexity = O(2^n)
// t(n) = 2T(n-1)+1             -->n-3 ---->1 :x=n-1
// t(n-1) = 4T(n-2)+3 => 2^n-1T(1)+2^n-2+2^n-3.....
//2^n-1+2^n-1+1   -->o(2^n)
