package com.cl.dao;

import com.cl.entity.DiscussqinshixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussqinshixinxiView;


/**
 * 寝室信息评论表
 * 
 * @author 
 * @email 
 * @date 2024-04-02 17:36:40
 */
public interface DiscussqinshixinxiDao extends BaseMapper<DiscussqinshixinxiEntity> {
	
	List<DiscussqinshixinxiView> selectListView(@Param("ew") Wrapper<DiscussqinshixinxiEntity> wrapper);

	List<DiscussqinshixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussqinshixinxiEntity> wrapper);
	
	DiscussqinshixinxiView selectView(@Param("ew") Wrapper<DiscussqinshixinxiEntity> wrapper);
	

}
