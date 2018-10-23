package com.yczd.api.aio.good.repository.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.yczd.api.aio.good.model.Good;
import com.yczd.api.aio.good.model.GoodCriteria;

public interface GoodMapper {
    long countByExample(GoodCriteria example);

    int deleteByExample(GoodCriteria example);

    int deleteByPrimaryKey(Integer goodId);

    int insert(Good record);

    int insertSelective(Good record);

    List<Good> selectByExampleWithRowbounds(GoodCriteria example, RowBounds rowBounds);

    List<Good> selectByExample(GoodCriteria example);
    List<Good> selectAll();

    Good selectByPrimaryKey(Integer goodId);

    int updateByExampleSelective(@Param("record") Good record, @Param("example") GoodCriteria example);

    int updateByExample(@Param("record") Good record, @Param("example") GoodCriteria example);

    int updateByPrimaryKeySelective(Good record);

    int updateByPrimaryKey(Good record);

}
