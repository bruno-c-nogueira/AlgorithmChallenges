import java.util.*

class FloodFill {
    data class Coordinate(val row: Int, val col: Int)

    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
        var colorToChange = image[sr][sc]
        val visited = Array(image.size) {
            BooleanArray(
                image.size
            )
        }
        var queue: Queue<Coordinate> = ArrayDeque<Coordinate>()
        queue.add(Coordinate(sr, sc))
        while (!queue.isEmpty()) {
            val current: Coordinate = queue.poll()
            val row = current.row
            val col = current.col

            image[row][col] = color
            visited[row][col] = true
            if (isValid(image, visited, row + 1, col, colorToChange)) queue.add(Coordinate(row + 1, col))
            if (isValid(image, visited, row - 1, col, colorToChange)) queue.add(Coordinate(row - 1, col))
            if (isValid(image, visited, row , col+1, colorToChange)) queue.add(Coordinate(row , col+1))
            if (isValid(image, visited, row , col-1, colorToChange)) queue.add(Coordinate(row , col -1))
        }
        return image
    }

    fun isValid(image: Array<IntArray>, visited: Array<BooleanArray>, r: Int, c: Int, oldColor: Int): Boolean {
        val n = image.size
        val m = image[0].size
        return r in 0 until n && c >= 0 && c < m && image[r][c] == oldColor && !visited[r][c]
    }
}