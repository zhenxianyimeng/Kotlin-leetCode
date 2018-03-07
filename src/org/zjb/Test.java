package org.zjb;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author zjb
 * @date 2018/3/6.
 */
public class Test {
    public static void main(String[] args) {
        String a = "abcd";
        Set<Character> tSet = new HashSet(Arrays.asList(a.toCharArray()));
        Set<Character> set2 = tSet.stream().collect(Collectors.toSet());
    }
}
