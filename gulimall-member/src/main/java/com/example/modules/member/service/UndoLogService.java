package com.example.modules.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.modules.member.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author zhen
 * @email 810911851@qq.com
 * @date 2020-12-04 09:22:12
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

