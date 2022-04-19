import org.junit.Test

import org.junit.Assert.*

class BestTimeToBuySellStockTest {

    @Test
    fun maxProfit() {
        val bestTime = BestTimeToBuySellStock()
        assert(bestTime.maxProfit(intArrayOf(7,1,5,3,6,4)) == 5)
    }

    @Test
    fun maxProfit2() {
        val bestTime = BestTimeToBuySellStock()
        assert(bestTime.maxProfit(intArrayOf(7,6,4,3,1)) == 0)
    }

    @Test
    fun maxProfit3() {
        val bestTime = BestTimeToBuySellStock()
        assert(bestTime.maxProfit(intArrayOf(2,4,1)) == 2)
    }

    @Test
    fun maxProfit4() {
        val bestTime = BestTimeToBuySellStock()
        assert(bestTime.maxProfit(intArrayOf(2,1,2,0,1)) == 1)
    }

    @Test
    fun maxProfit5() {
        val bestTime = BestTimeToBuySellStock()
        assert(bestTime.maxProfit(intArrayOf(3,2,6,5,0,3)) == 4)
    }
}