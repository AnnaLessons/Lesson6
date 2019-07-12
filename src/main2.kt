

fun main() {

    val arr = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, -1, 3),
        arrayOf(1, 5, 3)
    )

    for(i in arr.indices) {
        for(j in arr[i].indices){
            print("${arr[i][j]}\t")
        }
        println()
    }
}