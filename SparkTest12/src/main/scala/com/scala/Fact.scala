package com.scala

class Fact {
  
  def factorial (i:Int) : Int = {
    var  res =1
    
    for(a <- i to 1 by -1)
      res = res * a
      
    return res
    
  }
  
  // fibonacci Series::
  // 0 1 1 2 3 5 8 13 21 34 ...
   
   def fibo(i : Int ) : Unit = {
     
     var a = 0
     var b = 1 
     print("\t" +a+ "\t" +b)
     var res = 0
     for( k <- i to 2 by -1){
        res = a + b
        a  = b
        b = res
        print("\t" +res)
     }
     
     
   }
}