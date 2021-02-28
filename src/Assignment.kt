fun main() {
    name()
    var result =modulus(33,7)
    println(result)
    var total =add(8,6,9,10)
    println(total)
    me()

}
fun name() {
    var name="veronicah"
    println("Hello${name}")


}
fun modulus(num1:Int,num2:Int):Int {
    var modulus=num1%num2
    return modulus


}
fun add(a:Int,b:Int,c:Int,d:Int):Int{
    var sum=a+b+c+d
    return sum

}
fun me() {
    var me= "Am loving person"
    println(me)

}