
class BallsEachBox {
    fun minOperations(boxes: String): IntArray {
        var answer = IntArray(boxes.length)
        var ops = 0
        var count = 0

        for (i in 0 until boxes.length){
            answer[i] += ops
            count += boxes.charAt(i) - '0'
            ops += count
        }

        ops = 0
        count =0

        for (i in boxes.length -1 downTo 0){
            answer[i] += ops
            count += boxes.toCharArray()[i] - '0'
            ops += count
        }

        return answer
    }
}
fun String.charAt(index: Int) = this[index]



fun main() {

    BallsEachBox().minOperations("110")
}