public class Main{
    public static void main(String[] args){
        int n=4;
        int m=5;
        
        //Printing patterns
        for(int i=1; i<=n; i++){
            System.out.println("*");
        }

        //printing a 2D pattern
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //Using some pattern printing
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

         for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=m; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            //going to the next line
            System.out.println();
        }

    }
}