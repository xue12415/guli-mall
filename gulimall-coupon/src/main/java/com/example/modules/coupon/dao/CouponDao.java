package com.example.modules.coupon.dao;

import com.example.modules.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zhen
 * @email 810911851@qq.com
 * @date 2020-12-04 15:54:29
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
