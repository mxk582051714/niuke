package com.mxk.test;

import java.sql.*;

/**
 * ʹ��JDBC�������ݿ�MySQL�Ĺ��� DataBase��fuck�� table��person��
 * ʹ��myeclipse��mysql���ݿ������ɾ�Ĳ�Ļ���������
 */
public class JDBCTest {
	public static Connection getConnection() throws SQLException, java.lang.ClassNotFoundException {
		// ��һ��������MySQL��JDBC������
		Class.forName("com.mysql.jdbc.Driver");
		// ȡ�����ӵ�url,�ܷ���MySQL���ݿ���û���,���룻jsj�����ݿ���
		String url = "jdbc:mysql://localhost:3306/ydone";
		String username = "root";
		String password = "1514509mxk";
		// �ڶ�����������MySQL���ݿ���������ʵ��
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("���ݿ����ӳɹ�");
		return con;
	}

	public static void main(String args[]) {
		try {
			System.out.println("���");
			// ����������ȡ������ʵ��con����con����Statement������ʵ�� sql_statement
			Connection con = getConnection();
			Statement sql_statement = con.createStatement();
			// ���ͬ�����ݿ���ڣ�ɾ��
			// sql_statement.executeUpdate("drop table if exists student");
			// ִ����һ��sql���������һ����Ϊstudent�ı�
			// sql_statement.executeUpdate("create table student (id int not null
			// auto_increment, name varchar() not null default 'name', math int not null
			// default , primary key (id) ); ");
			// ��person���в�������
			sql_statement.executeUpdate("insert person values(, 'liying', )");
			sql_statement.executeUpdate("insert person values(, 'jiangshan', )");
			sql_statement.executeUpdate("insert person values(, 'wangjiawu', )");
			sql_statement.executeUpdate("insert person values(, 'duchangfeng', )");
			// ���Ĳ���ִ�в�ѯ����ResultSet��Ķ��󣬷��ز�ѯ�Ľ��
			String query = "select * from person";
			ResultSet result = sql_statement.executeQuery(query);
			// ��ʾ������person���е����ݣ�
			System.out.println("person���е���������:");
			System.out.println("------------------------");
			System.out.println("���" + " " + "����" + " " + "����");
			System.out.println("------------------------");
			// �Ի�õĲ�ѯ������д�����Result��Ķ�����в���
			while (result.next()) {
				int number = result.getInt("number");
				String name = result.getString("name");
				String mathsorce = result.getString("mathsorce");
				// ȡ�����ݿ��е�����
				System.out.println(" " + number + " " + name + " " + mathsorce);
			}
			// �ر����Ӻ�����
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
