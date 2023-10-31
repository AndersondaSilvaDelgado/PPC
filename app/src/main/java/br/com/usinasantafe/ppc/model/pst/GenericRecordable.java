package br.com.usinasantafe.ppc.model.pst;

import java.sql.SQLException;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.DeleteBuilder;
import com.j256.ormlite.stmt.PreparedDelete;

public class GenericRecordable<T> {

	private Dao dao;
	private DatabaseHelper instance;
	
	public GenericRecordable() {
		instance = DatabaseHelper.getInstance();
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void insert(T element, Class classe) {
		try {
			dao = instance.getDao(classe);
			dao.create(element);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void deleteAll(Class classe) {
		try {
			
			dao = instance.getDao(classe);
			DeleteBuilder<String, Object> deleteBuilder = dao.deleteBuilder();
			deleteBuilder.reset();
			PreparedDelete preparedDelete = deleteBuilder.prepare();
			dao.delete(preparedDelete);
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}
