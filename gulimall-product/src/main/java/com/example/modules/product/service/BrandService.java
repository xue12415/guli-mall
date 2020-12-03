package com.example.modules.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.modules.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author zhen
 * @email 810911851@qq.com
 * @date 2020-12-03 10:25:28
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void updateDetail(BrandEntity brand);
}

