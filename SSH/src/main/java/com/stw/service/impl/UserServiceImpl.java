package com.stw.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stw.dao.BaseDao;
import com.stw.entity.User;
import com.stw.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private BaseDao<User> baseDAO;

	public void saveUser(User user) {
		baseDAO.save(user);
	}

	public void updateUser(User user) {
		baseDAO.update(user);
	}

	public User findUserById(int id) {
		return baseDAO.get(User.class, id);
	}

	public void deleteUser(User user) {
		baseDAO.delete(user);
	}

	public List<User> findAllList() {
		return baseDAO.find(" from User u order by u.createTime");
	}

	public User findUserByNameAndPassword(String username, String password) {
		return baseDAO.get(" from User u where u.userName = ? and u.password = ? ", new Object[] { username, password });
	}
}
