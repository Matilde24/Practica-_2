
fun main()
{
    //numeros
val int = 123
val long = 123456L
val double = 12.34
val float = 12.34F
val hexadecimal = 0xAB
val binary = 0b01010101

println("int $int, long $long, double $double, float $float, hexadecimal $hexadecimal, binary $binary")

//cadenas
val string = "string con \n una línea nueva"
val rawString = """
 raw string es útil para
 cadenas con muchas líneas
 """
println(" $string $rawString")

    //booleanos 
    val x = 1 
    val y = 2 
    val z = 2 
    val esTrue = x < y && x < z 
    val otroTrue = x == y || y == z

    
}