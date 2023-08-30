// Name: Sarah Mohammed Althobiti , Student ID: 444004881.
public class lap1 {

    puplic
    static void insertElement(int[] A, int count, int key) {

        if (count == A.length) {
            System.out.println("The array is full! ");
        } else {
            A[count] = key;
            count++;
        }

    }

    public static int Sarah(int[] A, int count, int key) {

        for (int i = 0; i < count; i++) {
            if (A[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static void delete(int[] A, int count, int key) {
        if (count == 0) {
            System.out.println("The Array is empty");
        } else {
            i = Search(A, count, key);
            if (i == -1) {
                System.out.println("The element not found");
            } else {
                for (int s = i; s < count - 1; s++) {
                    A[j] = A[j + 1];
                }
                count--;
            }
        }
    }

    public static void sort(int[] A, int count){
        int temp;
        for(int i = 0; i < count; i++){
            for(int j = i+1 ; j < count ; j++)
             if(A[i] > A[j]){
                temp =  A[i]
                A[i] =  A[j];
                A[j] = temp;
             }
        }
    }

    public static void removeDuplicat(int[] A, int count){
        for(int i = 0; i < count; i++ ){
            for(int j = i + 1; j < count; j++){
                if(A[i] == A[j]){
                 delete(A, count, A[j]);

                }
            }
        }
    }

}