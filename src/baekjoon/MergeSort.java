package baekjoon;

import java.util.Arrays;
import java.util.List;

public class MergeSort {

    public static void main(String[] args) {
        List<Integer> dataList = List.of(4, 1, 2, 3, 5, 7);

        mergeSplitFunc();

        splitFunc(dataList);
    }

    private static void mergeSplitFunc() {

    }

    private static List<Integer> splitFunc(List<Integer> dataList) {
        if (dataList.size() <= 1) {
            return dataList;
        }

        int medium = dataList.size() / 2;

        List<Integer> leftArr = splitFunc(dataList.subList(0, medium));
        List<Integer> rightArr = splitFunc(dataList.subList(medium, dataList.size()));
        System.out.println("leftArr = " + Arrays.toString(new List[]{leftArr}));
        System.out.println("rightArr = " + Arrays.toString(new List[]{rightArr}));

//        return splitFunc();
        return null;
    }

}
