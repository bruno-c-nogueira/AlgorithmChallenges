import org.junit.Test

import org.junit.Assert.*

class PartitioningIntoMinimumNumberOfDeciBinaryNumbersTest {

    @Test
    fun minPartitions() {
        assert(PartitioningIntoMinimumNumberOfDeciBinaryNumbers().minPartitions("82734") == 8)
    }
}