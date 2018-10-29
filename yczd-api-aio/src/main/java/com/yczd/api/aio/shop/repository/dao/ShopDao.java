package com.yczd.api.aio.shop.repository.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.yczd.api.aio.shop.model.entity.Shop;
import com.yczd.api.aio.shop.repository.ShopRepository;
import com.yczd.api.aio.shop.repository.dao.mapper.ShopMapper;

@Repository
@Scope("prototype")
public class ShopDao implements ShopRepository {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public Shop getShopById(Integer id) {

		return sqlSession.getMapper(ShopMapper.class).selectByPrimaryKey(id);
	}

	@Override
	public List<Shop> getAll() {
		return sqlSession.selectList("com.yczd.api.aio.shop.repository.dao.mapper.ShopMapper.selectAll");
	}

	@Override
	public int insert(Shop shop) {
		return sqlSession.getMapper(ShopMapper.class).insert(shop);
	}

	@Override
	public int update(Shop shop) {
		return sqlSession.getMapper(ShopMapper.class).updateByPrimaryKey(shop);
	}

	@Override
	public int delete(Shop shop) {
		return deleteById(shop.getShopId());

	}

	@Override
	public int deleteById(Integer shopId) {
		return sqlSession.getMapper(ShopMapper.class).deleteByPrimaryKey(shopId);
	}
}
