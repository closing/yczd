package com.yczd.api.aio.auth2.repository.dao.mapper;

import com.yczd.api.aio.auth2.model.entity.Credentials;
import com.yczd.api.aio.auth2.model.entity.CredentialsCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CredentialsMapper {
    long countByExample(CredentialsCriteria example);

    int deleteByExample(CredentialsCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Credentials record);

    int insertSelective(Credentials record);

    List<Credentials> selectByExampleWithRowbounds(CredentialsCriteria example, RowBounds rowBounds);

    List<Credentials> selectByExample(CredentialsCriteria example);

    Credentials selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Credentials record, @Param("example") CredentialsCriteria example);

    int updateByExample(@Param("record") Credentials record, @Param("example") CredentialsCriteria example);

    int updateByPrimaryKeySelective(Credentials record);

    int updateByPrimaryKey(Credentials record);
}
