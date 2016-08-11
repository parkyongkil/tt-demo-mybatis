package tt.demo.mybatis.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomeController {

	@RequestMapping("home")
	public String home() throws NamingException, SQLException {
		Context context = new InitialContext();
		DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/testDB");
		Connection con = dataSource.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("show tables");
		ResultSetMetaData m = rs.getMetaData();
		int n = m.getColumnCount();
		String[] ns = new String[n];
		String[] ts = new String[n];
		for (int i = 0; i < n; i++) {
			ns[i] = m.getColumnName(i + 1);
			ts[i] = m.getColumnTypeName(i + 1);
		}
		String s = StringUtils.join(ns, " | ");
		System.out.println(s);
		Object[] os = new Object[n];
		while (rs.next()) {
			for (int i = 0; i < n; i++) {
				os[i] = rs.getObject(i + 1);
			}
			s = StringUtils.join(os, " | ");
			System.out.println(s);
		}
		rs.close();
		st.close();
		con.close();
		return "OK";
	}
}
