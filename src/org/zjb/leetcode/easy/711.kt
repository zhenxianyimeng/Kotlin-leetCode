package org.zjb.leetcode.easy

/**
 * @author zjb
 * @date 2018/3/6.
 */

//Jewels and Stones
fun main(args: Array<String>) {
    var J = "kkKK"
    var S = "kK"
    println(numJewelsInStones(J, S))
}

fun numJewelsInStones(J: String, S: String): Int {
    var set = J.chars().toArray().toSet()
    return S.chars().filter(set::contains).count().toInt()
}