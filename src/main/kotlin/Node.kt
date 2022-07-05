data class Node<T>(val value: T, var next: Node<T>? = null){
    override fun toString(): String {
        return if (next != null) {
            "$value -> ${next.toString()}"
        } else {
            "$value"
        }
    }

    fun printInReverseRecursive(){
        this.next?.printInReverseRecursive()

        if (this.next != null){
            print(" -> ")
        }
        print(this.value.toString())
    }

}
