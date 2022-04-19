class ClimbingStars {
    fun climbingStars(n : Int) : Int{
        var result = 0
        var prev = 1
        var prevPrev = 2

        if (n == 1) return 1
        if (n == 2) return 2

        for (i in 3..n){
            result = prev + prevPrev
            prevPrev = prev
            prev = result
        }

        return result
    }
}