package studentGrades

import java.util.Scanner

class Marks {
    var total:Int=0
    val input = Scanner(System.`in`)

    //inputting marks in the array
    fun inputMarks(marks:Array<Int?>){
        for (i in marks.indices){
            println("please enter marks for subject:${i+1}")
            marks[i]=input.nextInt()
            total += marks[i]?:0
        }
    }

    //determining grade by average mark
    fun determineGrade(average:Double): String? {
        var result:String?=null
        if (average>0 && average<50){
            result="Failed"
        }else if (average>=50 && average<75){
            result="Pass"
        }else if (average in 75.0..100.0){
            result="Pass with distinction"
        }
        return result
    }
}