package com.jaay.gene.demo.mapper;

import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

public interface BaseMapper<T, ID extends Serializable> {

    /**
     * 根据ID集合查询
     */

    List<T> batchQueryById(List<ID> ids);


    /**
     * 单行新增
     */
    Long add(T t);

    /**
     * 批量新增
     *
     * @param list
     */
    void batchAdd(@Param("list") List<T> list);

    /**
     * 根据ID删除
     */
    void deleteById(ID id);

    /**
     * 根据ID查询
     */
    T queryById(ID id);

    /**
     * 统计行数
     * @return
     */
    int count();

    /**
     * 单行修改
     * @param t
     */
    void update(T t );

    /**
     * 批量修改
     */
    void batchUpdate(List<T> list);

    /**
     * 查询所有列表
     */
    List<T> queryAll();

}
