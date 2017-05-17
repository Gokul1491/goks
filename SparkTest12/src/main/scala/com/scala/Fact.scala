package com.scala

class Fact {
  
  def factorial (i:Int) : Int = {
    var  res =1
    
    for(a <- i to 1 by -1)
      res = res * a
      
    return res
    
  }
}