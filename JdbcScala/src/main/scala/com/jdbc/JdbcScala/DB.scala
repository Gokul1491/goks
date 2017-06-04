package com.jdbc.JdbcScala

import java.sql.Connection
import java.sql.DriverManager
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class DB {
  
  val logger = LoggerFactory.getLogger(classOf[DB])
  logger.info("Entering tinto db session!!")
  
    val driver = "com.mysql.jdbc.Driver"
    val url = "jdbc:mysql://localhost:3306/testenv"
    val username = "hadoop"
    val password = "hadoop"

    // there's probably a better way to do this
    var connection:Connection = _

  
  def scalaDb() :Connection = {
    
    logger.info("Entering tinto scalaDB session!!")
     Class.forName(driver)
     connection = DriverManager.getConnection(url, username, password)
    logger.info("Exting from scala db session!!")
     connection
  }
}