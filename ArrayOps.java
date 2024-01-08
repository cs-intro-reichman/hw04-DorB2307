public class ArrayOps {
    public static void main(String[] args) {
    }
    
    public static int findMissingInt (int [] array) {
        int missingInt = 0;
        boolean isIn;
        for (int i = 0; i < array.length; i++) {
            isIn = false;
            for (int j = 0; j < array.length; j++) {
                if (array.length - i == array[j]) isIn = true;
            }
            if (!isIn) {
                missingInt = array.length - i;
                return missingInt;
            }
        }
        return missingInt;
    }

    public static int secondMaxValue(int [] array) {
        int max = array[0], secondMax = array[0], maxCount = 0;
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] == max){
                maxCount++;
                if (maxCount >= 2) return max;
            }
            else if (secondMax < array[i]) secondMax = array[i];
        }
        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean isIn;
        for (int i = 0; i < array1.length; i++) {
            isIn = false;
            for (int j = 0; j < array2.length; j++) {
               if (array1[i] == array2[j]) {
                isIn = true;
                j = array2.length; 
               }
            }
            if (!isIn) return false;
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        boolean isSortUp = true, isSortDown = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i+1]) isSortDown = false;
            if (array[i] > array[i+1]) isSortUp = false;
        }
        return (isSortUp || isSortDown);
    }

}
