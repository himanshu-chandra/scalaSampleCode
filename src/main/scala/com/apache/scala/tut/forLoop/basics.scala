package com.apache.scala.tut.forLoop

object basics {

  def main(args: Array[String]): Unit ={
    //println("hellow people...")
    println("for list inclusive last-START");
    for( i <- 1 to 5){
      println(i);
    }
    println("for list inclusive last-END");

    println("for list exclusive last-START");
    for (i <- 1 until 5){
      println(i);
    }
    println("for list exclusive last-END");


    println("for list inclusive last & filter-START");
    for (i <- 1 to 5 if i==2){
      println(i);
    }
    println("for list inclusive last & filter-END");

    println("for list exclusive last & filter-START");
    for (i <- 1 until 5 if i!=2){
      println(i);
    }
    println("for list exclusive last & filter-END");

    println("for loop for assigning value to a variable--START");
    var data=List("1","2","3","himanshu");
    val vr = for{ i <- data if (i=="himanshu" || i=="1" || i=="2")} yield i
    println(vr)
    println("for loop for assigning value to a variable--END");

    println("2-D array handling--START");
    val twoDimensionalArray = Array.ofDim[String](2,2)
    twoDimensionalArray(0)(0) = "flour"
    twoDimensionalArray(0)(1) = "sugar"
    twoDimensionalArray(1)(0) = "egg"
    twoDimensionalArray(1)(1) = "syrup"

    for { x <- 0 until 2
          y <- 0 until 2
        } println(s"Donut ingredient at index ${(x,y)} is: ${twoDimensionalArray(x)(y)}");
    println("2-D array handling--END");



  }

}
