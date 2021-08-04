package in.pinkumaroti.dao;

import java.util.*;

import in.pinkumaroti.entity.create;


public interface createDAO {
	
boolean get(create c);
List<create> get();
boolean update(create c);
boolean delete(int id);
create gett(int id);

}
