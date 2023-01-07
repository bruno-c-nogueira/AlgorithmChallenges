class HappyNumber {
    var lastValue = 0
    fun isHappy(n: Int): Boolean {
        print( isHarryVerify(n,n,true))
        return isHarryVerify(n,n,true)
    }

    fun isHarryVerify(n: Int, first: Int, isFirstStep: Boolean): Boolean{
        if (n == 1) return true
        if (n == first * first && !isFirstStep) return false

        var counter = 0
        for (i in 0 until n.toString().toCharArray().size){
            counter += n.toString().toCharArray()[i].toString().toInt()* n.toString().toCharArray()[i].toString().toInt()
        }
        return isHarryVerify(counter, first, false)

    }
}

fun main() {
    HappyNumber().isHappy(7)
}