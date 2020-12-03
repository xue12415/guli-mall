package com.example.modules.product.dao;

import com.example.modules.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhen
 * @email 810911851@qq.com
 * @date 2020-12-03 10:25:27
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
