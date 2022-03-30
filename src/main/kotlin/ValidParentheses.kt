class ValidParentheses {
    //TODO not working yet, think more
    fun isValid(s: String): Boolean {
        try {
            for (i in s.indices) {
                if (s[i].toString() == "(" && s[i + 1].toString() != ")") {
                    return false
                }
                if (s.lastIndex >= i+3 ){

                if (s[i].toString() == "[" &&( s[i + 1].toString() != "]" &&
                    s[i + 3].toString() != "]")) {
                    return false
                }
                }
                if (s.lastIndex >= i+5 ) {

                    if (s[i].toString() == "{" &&(
                        s[i + 1].toString() != "}" &&
                        s[i + 3].toString() != "}" &&
                        s[i + 5].toString() != "}")
                    ) {
                        return false
                    }
                }

            }
            return true

        } catch (e: Exception) {
            return false
        }
    }
}