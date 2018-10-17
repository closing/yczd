package com.yczd.api.aio.shop.repository.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yczd.api.aio.shop.domain.Shop;
import com.yczd.api.aio.shop.repository.ShopRepository;
import com.yczd.api.aio.shop.repository.dao.mapper.ShopMapper;

@Repository
public class ShopDao implements ShopRepository {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public Shop getShopById(Integer id) {

		return sqlSession.getMapper(ShopMapper.class).selectByPrimaryKey(id);
	}

}
