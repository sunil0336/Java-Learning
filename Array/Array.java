public class Array {
    public static void main(String[] args) {
        // int arr[] = new int[4];
        // arr[0] = 1;
        // arr[1] = 2;
        // arr[2] = 5;
        // arr[3] = 4;

        // int a[] = {9,8,7,6};

        // for(int i=0;i<4;i++){
        //     System.out.println(arr[i]);
        // }
        // System.out.println("\n");
            
        // for(int i=0;i<4;i++){
        //     System.out.println(a[i]);
        // }


        //multidimensional array 

        int ar[][] = new int[3][4];
//assinging random values to array 
        for(int i=0; i<3; i++){
            for(int j=0;j<4;j++){
                ar[i][j]= (int)(Math.random()*10);
            }
        }

        //printing array
        for(int i=0; i<3; i++){
            for(int j=0;j<4;j++){
                System.out.print(" "+ar[i][j]);
            }
            System.out.println();
        }
//enhanced for loop
        for(int n[] : ar){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
