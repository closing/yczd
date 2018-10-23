<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.yczd.api.aio.category.dao.CategoryMapper">
    <select id="findAll"
			resultType="com.yczd.api.aio.category.domain.Category">
        SELECT
        	cat_id AS catId
           ,cat_name AS catName
           ,cat_type AS catType
           ,banner AS banner
        FROM
        	category C
    </select>
    <select id="findById" parameterType="java.lang.String"
    		resultType="com.yczd.api.aio.category.domain.Category">
        SELECT
        	cat_id  AS catId
           ,cat_name  AS catName
           ,cat_type  AS catType
           ,banner  AS banner
        FROM
        	category C
        WHERE
        	c.cat_id = #{id}
    </select>
</mapper>
