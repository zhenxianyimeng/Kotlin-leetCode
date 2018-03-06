package org.zjb.leetcode.easy

import java.util.*


/**
 * @author zjb
 * @date 2018/3/6.
 */

//Jewels and Stones
fun main(args: Array<String>) {
    while (true){
        val sc = Scanner(System.`in`)
        var J = sc.nextLine()
        var S = sc.nextLine()
        println(numJewelsInStones(J, S))
    }
}

fun numJewelsInStones(J: String, S: String): Int {
    var set = hashSetOf<Char>()
    for (ch in J.toCharArray()){
        set.add(ch)
    }
    var num = 0
    for(ch in S.toCharArray()){
        if(set.contains(ch)){
            num++
        }
    }
    return num
}