import kotlin.math.max
import kotlin.math.min

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class BestTimeToBuySellStock {
    fun maxProfit(prices: IntArray): Int {
        if (prices.isEmpty()) return 0

        var maxProfit = 0
        var lowestPrice = prices[0]

        prices.forEach { currentPrice ->
            lowestPrice = min(lowestPrice, currentPrice)
            maxProfit = max(currentPrice - lowestPrice, maxProfit)
        }

        return maxProfit


    }
}