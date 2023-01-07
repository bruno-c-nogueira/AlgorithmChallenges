class ShuffleString {
    fun restoreString(s: String, indices: IntArray): String {
        val map = HashMap<Int, Char>()
        val stringChar = s.toCharArray()
        indices.forEachIndexed {index, position ->
            map[position] = stringChar[index]
        }
        return map.values.joinToString(separator = "")
    }
}

fun main() {
    ShuffleString().restoreString("codeleet", intArrayOf(4,5,6,7,0,2,1,3))
}