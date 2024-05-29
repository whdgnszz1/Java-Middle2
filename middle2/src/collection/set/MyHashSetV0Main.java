package collection.set;
/***************************************************
 * Copyright(c) 2021-2023 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * Jonghun Hong                   5/30/24
 *
 ****************************************************/


/**
 * @author : Jonghun Hong
 * @Project : middle2
 * @FileName : MyHashSetV0Main
 * @Date : 5/30/24
 * @description :
 */

public class MyHashSetV0Main {

    public static void main(String[] args) {
        MyHashSetV0 set = new MyHashSetV0();
        set.add(1); // O(1)
        set.add(2); // O(n)
        set.add(3); // O(n)
        set.add(4); // O(n)
        set.add(5); // O(n)
        System.out.println(set);

        boolean result = set.add(4); // 중복데이터 저장
        System.out.println("중복 데이터 저장 결과 = " + result);

        System.out.println("set.contains(3) = " + set.contains(3)); // O(n)
        System.out.println("set.contains(99) = " + set.contains(99)); // O(n)
    }
}
