package com.jdbc.JdbcScala

import org.slf4j.LoggerFactory

object Test {
  
  
  val logger = LoggerFactory.getLogger(classOf[DB])
  logger.info("Entering into the main function session!!")
  
  def main(args: Array[String]) {
    // connect to the database named "mysql" on the localhost
    val db = new DB()
    val connection = db.scalaDb()
    
    try {
      // make the connection
      // create the statement, and run the select query
      val statement = connection.createStatement()
      val resultSet = statement.executeQuery("select cid,cfname from customers limit 10")
      while (resultSet.next() ) 
      {
        val cid = resultSet.getInt("cid")
        val cfame = resultSet.getString("cfname")
        println("cid, cfame=" + cid + "--" +cfame)
      }
      connection.close()
      logger.info("Exiting  the main function session!!")
      
      println("Saving your task in remote")
      print("Doing another change here!!!")
      
    } 
    catch 
    {
      case e => e.printStackTrace
    }
    finally {
        connection.close()
    }

  }
}