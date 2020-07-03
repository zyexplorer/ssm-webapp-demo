package com.wenwo.webapp.dao.demo;

import com.wenwo.webapp.entity.demo.User;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * (User)表数据库访问层
 *
 * @author ZY
 * @since 2020-07-03 14:06:17
 */
@Repository
public interface UserDao extends Mapper<User> {

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<User> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

}