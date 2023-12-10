public class Main {
    public static void main(String[] args) {

       int[] array = new int[] {3, 26, 45};
       String[] array2 = new String[] {"Hello","World"};
       int[][] array3 = new int[][] {{23, 34, 45} , {33, 22, 45}};
       float[][] array4 = new float[][] {{2.3f, 2.4f}, {3.6f, 4.4f}};
       DimArray dimArray = new DimArray();
        dimArray.ArrayPrint(array);
        dimArray.ArrayPrint(array2);
        dimArray.ArrayPrint(array3);
        dimArray.ArrayPrint(array4);
    }

}