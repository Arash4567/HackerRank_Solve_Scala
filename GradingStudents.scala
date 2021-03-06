import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.immutable._
import scala.collection.mutable._
import scala.collection.concurrent._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._

object Result {

  /*
   * Complete the 'gradingStudents' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts INTEGER_ARRAY grades as parameter.
   */

  def gradingStudents(grades: Array[Int]): Array[Int] = {
    // solve1
    
    // grades.map{
    //     case point if 5 - (point % 5) < 3 && point >= 38 => point + 5 - point % 5
    //     case point => point
    // }

    // solve2
    
    grades.map { point =>
      if (5 - (point % 5) < 3 && point >= 38) {
        point + 5 - point % 5
      } else {
        point
      }
    }

    // solve3
    // foreach bilan ham ishlasak bo`lar adi lekin foreach Unit qaytaradi!
    
  }

}

object Solution {
  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val gradesCount = StdIn.readLine.trim.toInt

    val grades = Array.ofDim[Int](gradesCount)

    for (i <- 0 until gradesCount) {
      val gradesItem = StdIn.readLine.trim.toInt
      grades(i) = gradesItem
    }

    val result = Result.gradingStudents(grades)

    printWriter.println(result.mkString("\n"))

    printWriter.close()
  }
}
