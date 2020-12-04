package com.example.modules.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.modules.product.entity.SpuInfoEntity;
import com.example.modules.product.vo.SpuSaveVo;

import java.util.Map;

/**
 * spu信息
 *
 * @author zhen
 * @email 810911851@qq.com
 * @date 2020-12-03 10:25:28
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void savesupInfo(SpuSaveVo vo);

    void saveBaseSpuInfo(SpuInfoEntity spuInfoEntity);
}

