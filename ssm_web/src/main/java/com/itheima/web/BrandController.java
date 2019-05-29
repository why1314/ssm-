package com.itheima.web;


import com.itheima.entity.Result;
import com.itheima.entity.TbBrand;
import com.itheima.entity.TbBrandExample;
import com.itheima.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 详情
 *
 * @author wz
 * @date 2019-05-28-20:00
 */
@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @RequestMapping("/findAll")
    public List<TbBrand> findAll() {
        TbBrandExample example = new TbBrandExample();
        return brandService.findAll(example);
    }

    @RequestMapping("/insert")
    public Result insert(@RequestBody TbBrand brand){
        try {
            brandService.insert(brand);
            return new Result(true, "新增成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "新增失败");
        }
    }

}
