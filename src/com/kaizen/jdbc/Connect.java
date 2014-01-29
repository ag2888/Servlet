package com.kaizen.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public final class Connect {
 private Connection conn;
 public Connect(){
  conn = null;
  try{
   String userName = "root";
   String password = "nyu2659";
   String url = "jdbc:mysql://localhost/test";
   Class.forName ("com.mysql.jdbc.Driver").newInstance ();
   conn = DriverManager.getConnection(url, userName, password);
  }
  catch(Exception e){
   System.out.println("Exception found");
  }
 }
 public Connection getConnection(){
  return conn;
 }
 public void closeConnection(){
  try{
   conn.close ();
  }catch (Exception e) {
   System.out.println ("Connection close error");
  }
 }
}

