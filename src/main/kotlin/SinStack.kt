//https://leetcode.com/problems/min-stack/submissions/
class MinStack() {
    val normStack = java.util.Stack<Int>()
    val minStack = java.util.Stack<Int>()

    fun push(value: Int) {
        normStack.push(value)
        if (minStack.isEmpty()) {
            minStack.push(value)
        } else {
            minStack.push(minOf(value, minStack.peek()))
        }
    }

    fun pop() {
        if (!normStack.isEmpty()) {
            minStack.pop()
            normStack.pop()
        }

    }

    fun top(): Int {
        if (!normStack.isEmpty()) {
            return normStack.peek()
        }
        return 0
    }

    fun getMin(): Int {
        if (!minStack.isEmpty()) {
            return minStack.peek()
        }
        return 0
    }

}

fun main() {
    val minStack = MinStack()
    minStack.push(-2)
    minStack.push(0)
    minStack.push(-3)
    minStack.getMin()
    minStack.pop()
    minStack.top()
    minStack.getMin()


}