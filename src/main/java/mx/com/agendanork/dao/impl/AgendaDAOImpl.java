package mx.com.agendanork.dao.impl;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import mx.com.agendanork.dao.DB;
import mx.com.agendanork.entidades.Agenda;


public class AgendaDAOImpl implements DB<Agenda> {

	enum Column {
		INSTRUMENT,
		MARKET,
		PRICE,
		DATE;
	}

	public static final String TABLE_NAME_AGENDA = "AGENDA";
	public static final String TABLE_NAME_AGENDA_TIPO_TELEFONO = "TIPO_TELEFONO";
	public static final String TABLE_NAME_AGENDA_TELEFONO = "TELEFONO";
	public static final String TABLE_NAME_AGENDA_EMAIL = "EMAIL";
	
	public static final String SQL_SELECT_ALL = "SELECT * FROM " + TABLE_NAME_AGENDA;
	
	public static final String SQL_CREATE = "CREATE TABLE " + TABLE_NAME_AGENDA + " (" + Column.INSTRUMENT + " VARCHAR(30), "
			+ Column.MARKET + " VARCHAR(30), " + Column.PRICE + " FLOAT, " + Column.DATE
			+ " TIMESTAMP,   primary key (" + Column.INSTRUMENT + ", " + Column.MARKET + ", " + Column.DATE + "))";
	
	public static final String SQL_INSERT = "INSERT INTO " + TABLE_NAME_AGENDA
			+ " (INSTRUMENT, MARKET, PRICE, DATE) VALUES (?,?,?,?)";

	public static final String SQL_UPDATE = "UPDATE " + TABLE_NAME_AGENDA + " SET " + Column.PRICE + " = ? WHERE "
			+ Column.INSTRUMENT + " = ?";
	public static final String DATABASE_NAME = "dbs/myjavadbtest";
	protected final Connection conn;

	public AgendaDAOImpl(String driver, String url) throws Exception {
		Class.forName(driver).newInstance();
		conn = DriverManager.getConnection(url);
		conn.setAutoCommit(false);
	}

	public void insert(Agenda agenda) throws SQLException {
		
		PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT);
		
		preparedStatement.setString(1, agenda.getInstrument());
		preparedStatement.setString(2, agenda.getMarket());
		preparedStatement.setDouble(3, agenda.getPrice());
		preparedStatement.setTimestamp(4, new Timestamp(agenda.getDate().getTime()));
		preparedStatement.addBatch();
		
		preparedStatement.executeBatch();
		preparedStatement.close();
		conn.commit();
		
	}

	public void createTable() {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public void update(Agenda t) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public Set<Agenda> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
