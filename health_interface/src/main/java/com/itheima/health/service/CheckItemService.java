package com.itheima.health.service;


import com.itheima.health.health.entity.PageResult;
import com.itheima.health.pojo.CheckItem;

import java.util.List;

/**
 * @author: phx
 * @date: 2020/6/27
 * @time: 19:42
 */
public interface CheckItemService {

    /**
     * 查询所有
     * @return
     */
    List<CheckItem> findAll();

    /**
     * 查询单个
     * @param id
     * @return
     */
    CheckItem findOne(Integer id);

    /**
     * 分页条件查询
     * @param pageNum
     * @param pageSize
     * @param checkItem
     * @return
     */
    PageResult findByPage(Integer pageNum,Integer pageSize,CheckItem checkItem);

    /**
     * 添加
     * @param checkItem
     */
    void add(CheckItem checkItem);

    /**
     * 修改
     * @param checkItem
     */
    void update(CheckItem checkItem,Integer id);

    /**
     * 删除
     * @param id
     */
    void delete(Integer id);
}
