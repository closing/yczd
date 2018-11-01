package com.yczd.api.aio.auth2.repository.dao.mapper;

import com.yczd.api.aio.auth2.model.entity.Authority;
import com.yczd.api.aio.auth2.model.entity.AuthorityCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AuthorityMapper {
    long countByExample(AuthorityCriteria example);

    int deleteByExample(AuthorityCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Authority record);

    int insertSelective(Authority record);

    List<Authority> selectByExampleWithRowbounds(AuthorityCriteria example, RowBounds rowBounds);

    List<Authority> selectByExample(AuthorityCriteria example);

    Authority selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Authority record, @Param("example") AuthorityCriteria example);

    int updateByExample(@Param("record") Authority record, @Param("example") AuthorityCriteria example);

    int updateByPrimaryKeySelective(Authority record);

    int updateByPrimaryKey(Authority record);
}
