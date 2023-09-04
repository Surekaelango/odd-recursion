public class Main {
    public static void main(String[] args) {
        System.out.println(oddnumbers(12));
    }
    static int oddnumbers(int n){
        if (n==1){
            System.out.println(n);
            return 0;
        }
        if(n%2!=0){
            System.out.println(n);
            oddnumbers(n-2);
        }
        if (n%2==0){
            oddnumbers(n-1);
        }
        return 1;
    }
}