package com.example.modules.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.modules.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author zhen
 * @email 810911851@qq.com
 * @date 2020-12-03 10:25:26
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

