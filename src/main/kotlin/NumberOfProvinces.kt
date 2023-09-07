class NumberOfProvinces {

    fun dfs(currentCity: Int, isConnected: Array<IntArray>, visited: BooleanArray) {
        if (visited[currentCity]) return
        visited[currentCity] =true

        for(neighbor in isConnected.indices){
            if (isConnected[currentCity][neighbor] == 1){
                dfs(neighbor, isConnected, visited)
            }
        }
    }
    fun findCircleNum(isConnected: Array<IntArray>): Int {
        var count = 0

        var visited = BooleanArray(isConnected.size)

        for (city in isConnected.indices) {
            if (!visited[city]){
                dfs(city, isConnected, visited)
                count++
            }
        }
        return count
    }
}