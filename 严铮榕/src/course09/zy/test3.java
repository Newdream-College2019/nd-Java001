package course09.zy;

class Array {
    public void sort(char arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    char t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }
}

public class test3 {
    public static void main(String[] args) {
        char arr[] = {'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z'};
        System.out.println("升序前：");
        for(int i=0;i<arr.length;i++){
            System.out.printf(arr[i]+"\t");
        }
        System.out.println();
        Array ar = new Array();
        ar.sort(arr);
        System.out.println("升序后：");
        for(int i=0;i<arr.length;i++){
            System.out.printf(arr[i]+"\t");
        }
        System.out.println();
        System.out.println("逆序后：");
        for(int i=arr.length-1;i>=0;i--){
            System.out.printf(arr[i]+"\t");
        }
    }


}
