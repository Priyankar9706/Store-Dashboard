package in.pinkumaroti.dao;

import in.pinkumaroti.entity.Login;

public interface LoginDAO {
	String authenticate(Login login);
	String uauthenticate(Login login);
}
