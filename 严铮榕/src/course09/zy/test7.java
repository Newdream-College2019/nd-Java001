package course09.zy;

public class test7 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, -1, 5, -2};
        int[] newArray = new int[array.length];
        int flag = array.length - 1;
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[flag];
            flag--;
        }
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] < 0) {
                newArray[i] = 0;
            }
            System.out.printf(newArray[i]+"\t");
        }

    }
}
