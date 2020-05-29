package com.tqlsoft.dao;

import java.util.ArrayList;
import java.util.Set;

import com.tqlsoft.entity.Registeres;

public interface UserDao {

	public ArrayList<String> LoginCheck(String username);

	public String Regitser(Set<Registeres> rre);


}
