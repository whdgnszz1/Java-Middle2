package collection.array;
/***************************************************
 * Copyright(c) 2021-2023 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * Jonghun Hong                   5/28/24
 *
 ****************************************************/


import java.util.Arrays;

/**
 * @author : Jonghun Hong
 * @Project : middle2
 * @FileName : ArrayMain1
 * @Date : 5/28/24
 * @description :
 */

public class ArrayMain1 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        // Index 입력: O(1)
        System.out.println("==Index 입력: O(1)==");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));

        // index 변경: O(1)
        System.out.println("==Index 입력: O(1)==");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        System.out.println("==Index 조회: O(1)==");
        System.out.println("arr[2] = " + arr[2]);

        System.out.println("==배열 검색: O(n)==");
        System.out.println(Arrays.toString(arr));
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]: " + arr[i]);
            if(arr[i] == value) {
                System.out.println(value + " 찾음");
                break;
            }
        }
    }
}
