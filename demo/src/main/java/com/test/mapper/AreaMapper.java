package com.test.mapper;

import com.test.vo.Area;

public interface AreaMapper {
    /**
     *
     * @mbggenerated 2018-03-30
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-03-30
     */
    int insert(Area record);

    /**
     *
     * @mbggenerated 2018-03-30
     */
    int insertSelective(Area record);

    /**
     *
     * @mbggenerated 2018-03-30
     */
    Area selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2018-03-30
     */
    int updateByPrimaryKeySelective(Area record);

    /**
     *
     * @mbggenerated 2018-03-30
     */
    int updateByPrimaryKey(Area record);
}