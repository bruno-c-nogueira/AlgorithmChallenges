//https://leetcode.com/problems/valid-parentheses/
class ValidParentheses {
    private companion object{
        private const val PAREN_OPEN1 = '('
        private const val PAREN_OPEN2 = '['
        private const val PAREN_OPEN3 = '{'
        private const val PAREN_CLOSED1 = ')'
        private const val PAREN_CLOSED2 = ']'
        private const val PAREN_CLOSED3 = '}'

    }
    fun isValid(s: String): Boolean {
        val stack = StackImpl<Char>()

        for (ch in s){
            when (ch){
                PAREN_OPEN1 -> stack.push(PAREN_CLOSED1)
                PAREN_OPEN2 -> stack.push(PAREN_CLOSED2)
                PAREN_OPEN3 -> stack.push(PAREN_CLOSED3)
                else -> {
                    if (stack.isEmpty){
                        return false
                    }
                    if (stack.pop() != ch){
                        return false
                    }
                }
            }
        }
        if (!stack.isEmpty){
            return false
        }
        return true
    }
}