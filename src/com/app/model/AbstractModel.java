package com.app.model;

import java.sql.Connection;

//import com.app.entity.*;

public abstract class AbstractModel<T> {
	protected Connection connection = null;

	public AbstractModel(Connection connection) {
		this.connection = connection;
	}

	public abstract void create(T obj);

	public abstract boolean find(T a);
	
	
	public abstract boolean find(String a);


	public abstract boolean find();

	public abstract void remove(String cl);

	public abstract void modify(String cl, String[] tabContenu);
}
