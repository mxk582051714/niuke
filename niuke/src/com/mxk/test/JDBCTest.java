package com.mxk.test;

import java.sql.*;

/**
 * 使用JDBC连接数据库MySQL的过程 DataBase：fuck， table：person；
 * 使用myeclipse对mysql数据库进行增删改查的基本操作。
 */
public class JDBCTest {
	public static Connection getConnection() throws SQLException, java.lang.ClassNotFoundException {
		// 第一步：加载MySQL的JDBC的驱动
		Class.forName("com.mysql.jdbc.Driver");
		// 取得连接的url,能访问MySQL数据库的用户名,密码；jsj：数据库名
		String url = "jdbc:mysql://localhost:3306/ydone";
		String username = "root";
		String password = "1514509mxk";
		// 第二步：创建与MySQL数据库的连接类的实例
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("数据库连接成功");
		return con;
	}

	public static void main(String args[]) {
		try {
			System.out.println("你好");
			// 第三步：获取连接类实例con，用con创建Statement对象类实例 sql_statement
			Connection con = getConnection();
			Statement sql_statement = con.createStatement();
			// 如果同名数据库存在，删除
			// sql_statement.executeUpdate("drop table if exists student");
			// 执行了一个sql语句生成了一个名为student的表
			// sql_statement.executeUpdate("create table student (id int not null
			// auto_increment, name varchar() not null default 'name', math int not null
			// default , primary key (id) ); ");
			// 向person表中插入数据
			sql_statement.executeUpdate("insert person values(, 'liying', )");
			sql_statement.executeUpdate("insert person values(, 'jiangshan', )");
			sql_statement.executeUpdate("insert person values(, 'wangjiawu', )");
			sql_statement.executeUpdate("insert person values(, 'duchangfeng', )");
			// 第四步：执行查询，用ResultSet类的对象，返回查询的结果
			String query = "select * from person";
			ResultSet result = sql_statement.executeQuery(query);
			// 显示数据中person表中的内容：
			System.out.println("person表中的数据如下:");
			System.out.println("------------------------");
			System.out.println("序号" + " " + "姓名" + " " + "分数");
			System.out.println("------------------------");
			// 对获得的查询结果进行处理，对Result类的对象进行操作
			while (result.next()) {
				int number = result.getInt("number");
				String name = result.getString("name");
				String mathsorce = result.getString("mathsorce");
				// 取得数据库中的数据
				System.out.println(" " + number + " " + name + " " + mathsorce);
			}
			// 关闭连接和声明
			sql_statement.close();
			con.close();
		} catch (java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException");
			System.err.println(e.getMessage());
		} catch (SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}
	}
}
