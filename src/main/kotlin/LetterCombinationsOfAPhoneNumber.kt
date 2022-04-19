class LetterCombinationsOfAPhoneNumber {
    fun letterCombinations(digits: String): List<String> {
        val digitsMap = hashMapOf<Char,String>(
            '2' to "abc",
            '3' to "def",
            '4' to "ghi",
            '5' to "jkl",
            '6' to "mno",
            '7' to "pqrs",
            '8' to "tuv",
            '9' to "wxyz"
        )

        if (digits.isNullOrBlank()) return emptyList()
        if (digits.length == 1)return digitsMap[digits.toCharArray().first()]?.map { it.toString() }?.toList()!!

        var result = arrayListOf<String>()
        if (digits.length == 2) {
            while (digits.length - 1 > 0) {
                digitsMap[digits[0]]?.forEach { a ->
                    digitsMap[digits[ 1]]?.forEach { b ->
                        result.add("$a$b")
                    }
                }
            }
        }
        if (digits.length == 3) {
                digitsMap[digits[0]]?.forEach { a ->
                    digitsMap[digits[ 1]]?.forEach { b ->
                        digitsMap[digits[ 2]]?.forEach { c ->
                            result.add("$a$b$c")
                        }
                    }
                }
            }


        return result
    }
}