package SearchingAlgorthims;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {3, 5, 99, 7, 2, 8, 9, 33};

        int target = 9;
        boolean found = false;

        for (int i = 0; i <arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                System.out.println(target + " Element Found At Index:" + i);
                break;

            }

        }
        if(!found){
            System.out.println("Element Not Found" + target);
        }
    }
}
