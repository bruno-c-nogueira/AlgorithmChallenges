class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""

        var prefix: String = strs[0]
        for (currentWordIndex in strs.indices) {
            while (strs[currentWordIndex].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length - 1);
                if (prefix.isEmpty()) return "";
            }

        }
        return prefix
    }
}