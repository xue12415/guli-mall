package com.example.modules.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.modules.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author zhen
 * @email 810911851@qq.com
 * @date 2020-12-04 09:22:11
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

