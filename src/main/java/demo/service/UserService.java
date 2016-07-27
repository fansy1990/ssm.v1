package demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.dao.UserMapper;
import demo.model.User;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	public User getUser(String username) {
		User user = this.userMapper.selectByName(username);

		return user;

	}

	public int insert(User user) {
		int i = this.userMapper.insert(user);

		return i;
	}

	public int delete(int i) {
		return this.userMapper.deleteByPrimaryKey(i);

	}

	public int update(User user) {
		return this.userMapper.updateByPrimaryKey(user);
	}

	public List<User> query() {
		return this.userMapper.query();
	}

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
}
