//https://leetcode.com/submissions/detail/849341471/
class MaxWidthOfVerticalArea {
    fun maxWidthOfVerticalArea(points: Array<IntArray>): Int {
        points.sortBy { point ->
            point[0]
        }
        var maxWidthOfArea = 0

        for (i in 1 .. points.lastIndex) {
            maxWidthOfArea = maxOf(maxWidthOfArea, points[i][0] - points[i-1][0])
        }
        return maxWidthOfArea
    }
}