package com.itheima.health.mapper;

import com.github.pagehelper.Page;
import com.itheima.health.pojo.CheckItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**CheckItem持久层
 * @author: phx
 * @date: 2020/6/27
 * @time: 19:17
 */
public interface CheckItemMapper {
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
     * 条件查询
     * @param checkItem
     * @return
     */
    List<CheckItem> findByCondition(CheckItem checkItem);

    /**
     * 添加
     * @param checkItem
     */
    void add(CheckItem checkItem);

    /**
     * 修改
     * @param checkItem
     */
    void update(CheckItem checkItem);

    /**
     * 删除
     * @param id
     */
    void delete(Integer id);
}
