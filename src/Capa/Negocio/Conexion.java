package Capa.Negocio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Conexion {

	private Connection con;
	private Statement stmt;

	public Conexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			this.con = DriverManager.getConnection("jdbc:mysql://localhost:3308/aeropuerto?useSSL=false", "root", "");

			this.stmt = con.createStatement();

		} catch (Exception e) {
			System.out.println("Error en la conexion con la BBDD");
			e.printStackTrace();
		}
	}

	public boolean insertOrUpdateOrDelete(String consulta) {
		try {
			this.stmt.execute(consulta);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public ResultSet select(String consulta) {
		try {
			ResultSet rs = this.stmt.executeQuery(consulta);
			return rs;
		} catch (Exception e) {
			return null;
		}

	}
}

