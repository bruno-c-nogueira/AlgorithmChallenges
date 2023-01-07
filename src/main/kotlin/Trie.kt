class TrieNode<Char>(var key: kotlin.Char?, var parent: TrieNode<kotlin.Char>?) {
        val children: HashMap<Char, TrieNode<kotlin.Char>?> = HashMap()
        var isTerminating = false
    }
class Trie() {

    private val root = TrieNode<Char>(key = null, parent = null)
    private val storedLists: MutableSet<List<Char>> = mutableSetOf()
    val lists: List<List<Char>>
        get() = storedLists.toList()

    fun insert(word: String) {
        var current = root
        word.toCharArray().forEach {
            if (current.children[it] == null) {
                current.children[it] = TrieNode(it, current)
            }
            current = current.children[it]!!
        }
        current.isTerminating = true
        storedLists.add(word.toList())
    }

    fun search(word: String): Boolean {
        var current = root
        word.toCharArray().forEach {
            val child = current.children[it] ?: return false
            current = child
        }
        return current.isTerminating
    }

    fun startsWith(prefix: String): Boolean {
        var current = root
        prefix.toCharArray().forEach {
            val child = current.children[it] ?: return false
            current = child
        }
        return true
    }

}