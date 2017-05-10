package mx.com.agendanork.dao;


import java.sql.SQLException;
import java.util.Set;

public interface DB<T> {

	public void insert(T t) throws SQLException;

	public void createTable();

	public void deleteAll();

	public void update(T t) throws SQLException;

	public Set<T> selectAll();

}