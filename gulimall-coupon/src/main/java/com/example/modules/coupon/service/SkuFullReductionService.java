package com.example.modules.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.to.SkuReductionTo;
import com.example.common.utils.PageUtils;
import com.example.modules.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author zhen
 * @email 810911851@qq.com
 * @date 2020-12-04 15:54:28
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
    void saveSkuReduction(SkuReductionTo skuReductionTo);
}

