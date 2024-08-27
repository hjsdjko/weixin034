package com.cl.dao;

import com.cl.entity.QinshixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.QinshixinxiView;


/**
 * 寝室信息
 * 
 * @author 
 * @email 
 * @date 2024-04-02 17:36:39
 */
public interface QinshixinxiDao extends BaseMapper<QinshixinxiEntity> {
	
	List<QinshixinxiView> selectListView(@Param("ew") Wrapper<QinshixinxiEntity> wrapper);

	List<QinshixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<QinshixinxiEntity> wrapper);
	
	QinshixinxiView selectView(@Param("ew") Wrapper<QinshixinxiEntity> wrapper);
	

}
