import java.util.Scanner

fun main() {
   val scanner = Scanner(System.`in`)
  //declaration
   var steps:Int
   var kilo:Int
   var dayoftheweek:String
   var weightlost:Double
   var weightlostperkilo:Double=0.5

   println("enter steps taken")
    steps=scanner.nextInt()

    println("enter day of the week")
   dayoftheweek= scanner.next()

    kilo=steps/2000
    weightlost=weightlostperkilo*kilo

     println("day of the week : $dayoftheweek")
    println("distance : $kilo KM")
    println("weight lost : $weightlost")

    scanner.close()

}