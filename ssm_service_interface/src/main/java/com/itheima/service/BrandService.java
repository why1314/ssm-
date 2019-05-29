package com.itheima.service;

import com.itheima.entity.TbBrand;
import com.itheima.entity.TbBrandExample;

import java.util.List;

/**
 * 详情
 *
 * @author wz
 * @date 2019-05-28-19:48
 */
public interface BrandService {
    //查询所有
    List<TbBrand> findAll(TbBrandExample example);
    void insert(TbBrand brand);
}
