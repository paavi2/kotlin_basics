package org.kt.one

class Variables {


}
fun main() {
    println("Hello World!")
    //val(Final-Once initialized, then can't change value), var - Value can be changed
//    valAndVar()
    //dataTypes
    //operators
    stringTemplateAndFunction()

}

fun valAndVar(){
    val x = 5 //whole number
    val y: Int = 5 //Redundant (Similar to val y = 5)
    var z = 5
    println(x)
    println(y)
    //CE - Final variable x = 10
    z = 10
    println(z)
    operators()
}

fun dataTypes(){
    //Number, Char, Boolean, Array, String, Byte,SHort,Integer,Long,Double,Float
    val byteType:Byte = 112 //8 bits
    val shortType : Short = 234 //16 bits
    val intType : Int = 2333
    val longType : Long = 232324
    val doubleType : Double = 1.23
    val floatType:Float=1.23F
    val booleanType:Boolean=true
    val charType:Char='a'
    val stringType:String="pavi"
    val numberType:Number=12.1 //can have byte to double
}

fun operators(){
    //Arithmetic : + - * / %
    //Comparison : < > <= >= == !=
    //Assignment : = += -= *= /= %=
    //Increment/Decrement : ++ --
    //Order of precedence : ++, --, *, / %, +, -, <,>,<=,>=, ==, =, +=, -=, /=, %=, *=
    var x = 2
    var y = 3
    val z = 4
    x += z*y //x=>x+z*y //14
    println(x)

    val c = ++x - --y //
    println(c)
}

fun stringTemplateAndFunction(){
    var a = "This is a coder"
    var b:String="Hello"
    val c = "and my age is"
    val d = 27
    println("the length of the tstringis ${a.length}")
    println("String is => ${a}")
    println("String is => ${a}::"+a)
    /* String methods/functions*/
    //length(),get(index),subSequence(startIndex,endIndex),compareTo,equals,hashCode,plus,toString,lastIndex,indexOf
    //compareTo: Compares this object with the specified object for order,
    // returns zero if this object is equal to the specified other object,
    // a negative number if its less than other, or a positive number, if its greater than other
    println("1.Length of a => ${a.length}")
    println("2.The char at index 2 of b ${b.get(2)}")
    println("3. substring is, ${c.subSequence(1,5)}")
    println("3. substring is, ${c.substring(1,5)}")

}
