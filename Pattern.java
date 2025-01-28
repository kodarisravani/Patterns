public class Pattern {
    public static void Pattern(int n){
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.println("*" + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        Pattern(n);
        }
    }
        
