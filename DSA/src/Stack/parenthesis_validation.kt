package Stack

fun main(){
    val parenthesis = "9090(){"
    println("Status : ${isValidParenthesis(parenthesis)}")
}

fun isValidParenthesis(parenthesis: String): Boolean{
    val stack = StackWithLL()
    var isValid = true
    parenthesis.forEach { char ->
        when {
            isOpenBracket(char) -> stack.push(char)
            isClosedBracket(char) -> {
                val popedBrac = stack.pop() as Char?
                print(popedBrac)
                if(!isMatchingBrackets(popedBrac, char)) isValid = false
            }
        }
    }
    if(stack.pop() != null) isValid = false

    return isValid
}

fun isOpenBracket(bracket: Char): Boolean = bracket == '{' || bracket == '[' || bracket == '('

fun isClosedBracket(bracket: Char): Boolean = bracket == '}' || bracket == ']' || bracket == ')'

fun isMatchingBrackets(openBrac: Char?, closedBrac: Char): Boolean{
   return when{
       openBrac == '(' && closedBrac == ')' -> true
       openBrac == '{' && closedBrac == '}' -> true
       openBrac == '[' && closedBrac == ']' -> true
       else -> false
    }
}