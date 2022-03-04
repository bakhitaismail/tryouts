fun main() {
    var name = "Bakky"
    println("Hello, ${name}")
    var x = division(75, 15)
    println(x)
    var y = addition(15, 25, 35, 45)
    println(y)
    println(interestingFact())
}
fun division(num1: Int, num2:Int): Int {
    var divide = num1/num2
    return divide
}
fun addition(num1: Int, num2: Int, num3: Int, num4: Int): Int {
    var sum = num1+num2+num3+num4
    return sum
}
fun interestingFact(): String {
    var fact = "I love football."
    return fact
}