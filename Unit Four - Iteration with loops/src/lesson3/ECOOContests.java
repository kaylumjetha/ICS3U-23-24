package lesson3;

public class ECOOContests {
    public static void main(String[] args) {
        frame2010(3,4,1,2);
    }
    private static void frame2010(int m, int n, int p, int q){
    int width=q+q+p+p+n;

   for(int i=0; i<q; i++) {
        for(int j=0; j<width; j++){
            System.out.print("#"); 
        }
        System.out.println("");
    }

    for(int i=0; i<p; i++){
        for(int j=0; j<q; j++){
            System.out.print("#");
        }
        for(int k=0; k < p+n+p; k++){
            System.out.print("+");
        }
        for(int l=0; l < q; l++){
            System.out.print("#");
        }
        System.out.println("");
    }
    for(int i=0; i<m;i++){
        for(int j=0; j<q; j++){
            System.out.print("#");
        }
        for(int k=0; k<p; k++){
            System.out.print("+");
        }
        for(int l=0; l<n; l++){
            System.out.print(".");
        }
        for(int r=0; r<p; r++){
            System.out.print("+");
        }
        for(int o=0; o<q; o++){
            System.out.print("#");
        }
        System.out.println("");
    }
    for(int i=0; i<p; i++){
        for(int j=0; j<q; j++){
            System.out.print("#");
        }
        for(int k=0; k<p+p+n; k++){
            System.out.print("+");
        }
        for(int l=0; l<q; l++){
            System.out.print("#");
        }
        System.out.println("");
    }
    for(int i=0; i<q; i++){
        for(int j=0; j<width; j++){
            System.out.print("#");
        }
        System.out.println("");
    }

    }
}