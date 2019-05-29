package com.itheima.service.impl;

import com.itheima.entity.TbBrand;
import com.itheima.entity.TbBrandExample;
import com.itheima.mapper.TbBrandMapper;
import com.itheima.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 详情
 *
 * @author wz
 * @date 2019-05-28-19:50
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private TbBrandMapper tbBrandMapper;

    @Override
    public List<TbBrand> findAll(TbBrandExample example) {
        return tbBrandMapper.selectByExample(example);
    }

    @Override
    public void insert(TbBrand brand) {
        tbBrandMapper.insertSelective(brand);
    }
}
