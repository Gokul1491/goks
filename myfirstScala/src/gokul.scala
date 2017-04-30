

object gokul {
   /* This is my first java program.  
   * This will print 'Hello World' as the output
   */
  var  name: String ="gokul"
  val  age: Int = 25
  var sum : Int = 0
  def sumFunc( a:Int):Unit = {
    sum+= a
  }
  
  
    def main(args: Array[String]) {
      println("Hello, world!") // prints Hello World
      println(name +"\t"+ age)
      name ="Raj"
      println("changed name is :: " +name);
      //println(sumFunc(10,15));
      
      for( i <- (1 to 10))
         sumFunc(i)
          
       println(sum)   
       
       val str = "Adding few more lines!!!"
  }
}