package com.yy.crf.dao;

import com.yy.crf.entity.Ordersdetail;

public interface OrdersdetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ordersdetail record);

    int insertSelective(Ordersdetail record);

    Ordersdetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ordersdetail record);

    int updateByPrimaryKey(Ordersdetail record);
}