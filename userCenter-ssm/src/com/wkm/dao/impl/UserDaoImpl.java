package com.wkm.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wkm.dao.UserDao;
import com.wkm.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public User getUserById(String id) {
		//
		//SqlSession sqlSession = sqlSessionTemplate.();
		User user = (User)sqlSessionTemplate.selectOne("com.wkm.mapper.UserMapper.selectUser", id);
	
		return user;
	}

}
