package com.scala

import org.apache.spark.sql.SQLContext
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import com.scala.Fact



object Testing {

  def main(args: Array[String]): Unit = {

    /*val conf = new SparkConf().setAppName("Conversion-par-csv").setMaster("local")

    val sc = new SparkContext(conf)

    val sqlContext = new SQLContext(sc)

    val parquet_file = sqlContext.parquetFile("hdfs://localhost:9000/gokl/raj/warehouse/retail_ods.db/orders_parquet/000000_0")

    parquet_file.printSchema()
*/
 //   parquet_file.write.format("csv").save("hdfs://localhost:9000/scala/out-parq14")

    for (i <- (1 to 10))
      println(i)

    println("tagging it to the development branch:::")
    println()

    println("Gokul raj ")

    val obj = new Sum()
    
    obj.calculate(10, 20)
    
    val s = Set(1,2,3,4,5)
    
    println (s)
    
    println("Gokul Raj learnt Git!!")
    
    val f = new Fact()
    
    
    println("The Factorial value:::" + f.factorial(args(0).toInt))
    println(f.fibo(args(0).toInt))
    

  }
}