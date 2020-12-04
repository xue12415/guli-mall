package com.example.modules.member.dao;

import com.example.modules.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhen
 * @email 810911851@qq.com
 * @date 2020-12-04 09:22:11
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
