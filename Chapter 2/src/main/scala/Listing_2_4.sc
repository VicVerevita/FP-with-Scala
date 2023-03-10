def findFirst[A] (as: Array[A], p:A => Boolean): Int = {
  @annotation.tailrec
  def loop(n: Int): Int = {
    if(n >= as.length) {
      -1
    }
    else if(p(as(n))){
      n
    }
    else {
      loop(n+1)
    }
  }

  loop(0)
}

def isSorted[A] (as: Array[A], ordered: (A, A) => Boolean): Boolean = {
  @annotation.tailrec
  def loop(n: Int): Boolean = {
    if(n >= as.length-1) {
      true
    }
    else if(!ordered(as(n), as(n-1))) {
      false
    }
    else {
      loop(n+1)
    }
  }

  loop(0)
}

val numbers1 = Array(1, 2, 3, 4)
val numbers2 = Array(2, 3, 4, 1)

//isSorted(numbers1, )
//isSorted(numbers2)