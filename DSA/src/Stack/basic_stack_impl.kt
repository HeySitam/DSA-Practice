package Stack

fun main(){
    val stackWithArr = StackWithArr()
//    stackWithArr.push(10)
//    stackWithArr.printArray()
//    stackWithArr.push(6)
//    stackWithArr.printArray()
    stackWithArr.pop()
    stackWithArr.printArray()
}

/**
 * With Array Impl
 */
class StackWithArr {
    private val arr = IntArray(8){_ ->
        0
    }
    private var top: Int = -1

    fun push(item: Int){
        if(top == arr.size)
            println("Stack Overflow")
        else{
            top++
            arr[top] = item
            println("$item pushed")
        }
    }

    fun pop():Int?{
        if(top == -1) {
            println("Array is empty")
            return null
        } else{
            val popedItem = arr[top]
            arr[top] = 0
            top --
            println("$popedItem poped")
            return popedItem
        }
    }

    fun printArray(){
        println(arr.toList().toString())
    }
}



/**
 * With LinkedList Impl
 */