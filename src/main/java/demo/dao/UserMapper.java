package demo.dao;

import java.util.List;

import demo.model.User;

public interface UserMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer id);

	User selectByName(String name);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	List<User> query();
}