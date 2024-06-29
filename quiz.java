//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.HashSet;

public class quiz {
    public quiz() {
    }

    public static ArrayList<Integer> findCommonElements(int[] array1, int[] array2) {
        HashSet<Integer> set1 = new HashSet();
        ArrayList<Integer> common = new ArrayList();
        int[] var4 = array1;
        int var5 = array1.length;

        int var6;
        int num;
        for(var6 = 0; var6 < var5; ++var6) {
            num = var4[var6];
            set1.add(num);
        }

        var4 = array2;
        var5 = array2.length;

        for(var6 = 0; var6 < var5; ++var6) {
            num = var4[var6];
            if (set1.contains(num)) {
                common.add(num);
            }
        }

        return common;
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{2, 3, 4};
        ArrayList<Integer> commonElements = findCommonElements(array1, array2);
        System.out.println(commonElements);
    }

    public class RemoveDuplicates {
        public RemoveDuplicates(quiz this$0) {
        }

        public static ArrayList<Integer> removeDuplicates(int[] array) {
            HashSet<Integer> set = new HashSet();
            ArrayList<Integer> uniqueElements = new ArrayList();
            int[] var3 = array;
            int var4 = array.length;

            for(int var5 = 0; var5 < var4; ++var5) {
                int num = var3[var5];
                if (!set.contains(num)) {
                    set.add(num);
                    uniqueElements.add(num);
                }
            }

            return uniqueElements;
        }

        public static void main(String[] args) {
            int[] array = new int[]{1, 2, 2, 3, 4, 4, 5};
            ArrayList<Integer> uniqueElements = removeDuplicates(array);
            System.out.println(uniqueElements);
        }
    }
}
