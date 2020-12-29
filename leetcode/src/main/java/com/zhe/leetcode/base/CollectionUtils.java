package com.zhe.leetcode.base;

import java.util.List;

/**
 * @author zhangzhe
 */
public final class CollectionUtils {

    private final static String SPACE = "  ";

    private CollectionUtils() {

    }

    public static <T> void printList(List<T> list) {
        for(Object o: list) {
            System.out.print(o + SPACE);
        }
        System.out.println();
    }

}
