package com.yczd.api.aio.good.repository.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.yczd.api.aio.good.model.entity.Good;
import com.yczd.api.aio.good.model.entity.GoodCriteria;

public interface GoodMapper {
    long countByExample(GoodCriteria example);

    int deleteByExample(GoodCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(Good record);

    int insertSelective(Good record);

    List<Good> selectByExampleWithBLOBsWithRowbounds(GoodCriteria example, RowBounds rowBounds);

    List<Good> selectByExampleWithBLOBs(GoodCriteria example);

    List<Good> selectByExampleWithRowbounds(GoodCriteria example, RowBounds rowBounds);

    List<Good> selectByExample(GoodCriteria example);

    Good selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Good record, @Param("example") GoodCriteria example);

    int updateByExampleWithBLOBs(@Param("record") Good record, @Param("example") GoodCriteria example);

    int updateByExample(@Param("record") Good record, @Param("example") GoodCriteria example);

    int updateByPrimaryKeySelective(Good record);

    int updateByPrimaryKeyWithBLOBs(Good record);

    int updateByPrimaryKey(Good record);

    List<Good> selectAll();
}
