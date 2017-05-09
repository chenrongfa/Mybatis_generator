package com.yy.crf.dao;

import com.yy.crf.entity.Orders;

public interface OrdersMapper {
    int deleteByPrimaryKey(Integer number);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer number);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}