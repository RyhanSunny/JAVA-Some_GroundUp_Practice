public class _2D_Arrays_Ex {
    public static void main (String[] args){

        //declare a multidimentional array
        int[][] table = new int[4][5];
        int sum = 0;

        for (int[] ints : table) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
                sum += anInt;
                System.out.println(sum);

            }
            System.out.println();
        }

    }

    //a method to search an array of integers

    public static int search(int[] a, int searchValue){
        int location = -1;
        for (int i = 0; i< a.length; i++){
            if (a[i] == searchValue){
                location = i;
                break;
            }
        } return location;
    }
}
