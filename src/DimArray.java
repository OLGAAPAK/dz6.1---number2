public class DimArray {
    public DimArray() {}

    public void ArrayPrint(int[] arr){
        for(int i =0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public void ArrayPrint(String[] arr){
        for(int i =0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public void ArrayPrint(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void ArrayPrint(float[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
