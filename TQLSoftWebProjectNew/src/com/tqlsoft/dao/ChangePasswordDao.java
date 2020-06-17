package com.tqlsoft.dao;
import java.util.List;
import java.util.Set;
import com.tqlsoft.entity.Usermessage;

public interface ChangePasswordDao {

		public List<Usermessage> updatePassword(String username,String password,String passwordNew);
}
