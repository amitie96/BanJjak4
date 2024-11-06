package com.mysite.banjjak.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	SqlSession sql;

	@Override
	public void join() {
		sql.insert("user.join");
	}

}
