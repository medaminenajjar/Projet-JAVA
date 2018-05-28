package com.app.controller;

//import com.app.entity.*;

public interface ActionPerformed<T> {

	public void SearchPerformed(String cl);

	public void addPerformed(T cl);

	public void modifyPerformed(String cl, String[] tabContenu);

	public void removePerformed(String cl);
}

