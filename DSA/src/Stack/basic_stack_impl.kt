package Stack

fun main() {
//    val stackWithArr = StackWithArr()
//    stackWithArr.push(10)
//    stackWithArr.printArray()
//    stackWithArr.push(6)
//    stackWithArr.printArray()
//    stackWithArr.pop()
//    stackWithArr.printArray()
    val stackWithLL = StackWithLL()
    stackWithLL.push(99)
    stackWithLL.printStack()
    stackWithLL.push(32)
    stackWithLL.printStack()
    stackWithLL.pop()
    stackWithLL.printStack()
    stackWithLL.pop()
    stackWithLL.printStack()
    stackWithLL.pop()
    stackWithLL.printStack()
}

/**
 * Stack
 */
interface Stack {
    fun push(item: Any)
    fun pop(): Any?
}

/**
 * With Array Impl
 */
class StackWithArr : Stack {
    private val arr = Array<Any>(8) { _ ->
        0
    }
    private var top: Int = -1

    override fun push(item: Any) {
        if (top == arr.size)
            println("Stack Overflow")
        else {
            top++
            arr[top] = item
            println("$item pushed")
        }
    }

    override fun pop(): Any? {
        return if (top == -1) {
            println("Array is empty")
            null
        } else {
            val popedItem = arr[top]
            arr[top] = 0
            top--
            println("$popedItem poped")
            popedItem
        }
    }

    fun printArray() {
        println(arr.toList().toString())
    }
}

/**
 * With LinkedList Impl
 */
class Node(var info: Any, var next: Node? = null)

class StackWithLL : Stack {
    private var top: Node? = null
    override fun push(item: Any) {
        val newNode = Node(info = item)
        if (top == null) {
            top = newNode
        } else {
            val temp = top
            top = newNode
            top!!.next = temp
        }
    }

    override fun pop(): Any? {
        return if (top == null) {
            println("Stack is Empty")
            null
        } else {
            val temp = top
            top = temp!!.next
            temp.next = null
            temp.info
        }
    }

    fun printStack() {
        if (top == null)
            println("top -> null")
        else {
            print("top -> ${top!!.info}")
            var temp = top!!.next
            while (temp != null) {
                print(" -> ${temp.info}")
                temp = temp.next
            }
            println()
        }
    }

}