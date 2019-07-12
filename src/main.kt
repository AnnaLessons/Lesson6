

fun main() {
    print("Введите количество элементов: ")
    val N: Int = readLine()!!.toInt()

    val arr1 = Array(size = N, init = {0})
    val arr2 = Array(size = N, init = {0.0})

    println("Введите значения первого массива")
    for (index: Int in 0 until N) {
        arr1[index] = readLine()!!.toInt()
    }

    println("Введите значения второго массива")
    for (index: Int in 0 until N) {
        arr2[index] = readLine()!!.toDouble()
    }
    println("Значения первого массива")
    printArray(arr1 as Array<Number>)
    println()

    println("Значения второго массива")
    printArray(arr2 as Array<Number>)
    println()

    println("S1 = " + avg(arr1))
    println("S2 = ${avg(arr2)}")

}

fun avg(arr: Array<Int>): Double {

    var sum: Int = 0
    for (number in arr) {
        sum += number
    }

    return sum / arr.size.toDouble()

}

fun avg(arr: Array<Double>): Double {

    var sum: Double = 0.0
    for (number in arr) {
        sum += number
    }
    return  sum / arr.size
}


fun printArray(arr: Array<Number>) {
    for (index: Int in arr.indices) {
        println("${arr[index]} ")
    }
}