package org.zjb.leetcode.easy

import java.util.*
import java.util.stream.Collectors
import kotlin.collections.ArrayList


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
    var set = J.toCharArray().toCollection(ArrayList()).stream().collect(Collectors.toSet<Char>())
    var num = 0

    S.toCharArray().toCollection(ArrayList()).stream().forEach { c->if(set.contains(c)){
        num++
    } }
    return num
}