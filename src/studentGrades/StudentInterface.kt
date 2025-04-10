package studentGrades

import java.util.Scanner

fun main(){
    val input= Scanner(System.`in`)
    val marks= Marks()

    println("please enter the number of subjects")
    val subjects=input.nextInt()


    val score = Array<Int?>(subjects) { null }

    marks.inputMarks(score)
    val average: Double = (marks.total/subjects).toDouble()

    println("your average :$average")
   println( marks.determineGrade(average))

}