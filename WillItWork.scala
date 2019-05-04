package ScalaApp

object WillItWork extends App {
  /*
  delta is the difference in percentage between length of
  the word input and of the benchmark  work
   */
  def delta(b:Int,n:Int):Double= {
    val d:Int = n-b;
    val res = (d.abs / b).toDouble
    res
  }
  /*
  the function compare is to compare letter by letter
  Accuracy is the matching percentage of letters minus
  the inaccuracy of the word length
   */
  def compare(b:String,w:String): Unit = {
    var c:Int =0
    val l:Int = b.length
    for (i <- 0 until l) {
      if (b(i) == w(i)) c += 1
      else if(b(i) == w(i+1)) c+=1
      else if (b(i+1) ==w(1)) c+=1
    }
    val off = delta(l,w.length)
    val accuracy = (c/l.toDouble) - off
    accuracy.round


  }
}
