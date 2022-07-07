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
//    Trash code I made
//    fun findMiddleNode(): T?{
//        var currentNode: Node<T>? = this
//        var listSize = 0
//        while (currentNode?.next != null){
//            currentNode = currentNode.next
//            listSize++
//        }
//        currentNode = this
//        for (i in 0 until listSize.div(2)){
//            currentNode = currentNode?.next
//
//        }
//        return currentNode?.value
//    }

}
