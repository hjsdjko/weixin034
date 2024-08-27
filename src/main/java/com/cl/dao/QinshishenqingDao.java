package com.cl.dao;

import com.cl.entity.QinshishenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.QinshishenqingView;


/**
 * 寝室申请
 * 
 * @author 
 * @email 
 * @date 2024-04-02 17:36:39
 */
public interface QinshishenqingDao extends BaseMapper<QinshishenqingEntity> {
	
	List<QinshishenqingView> selectListView(@Param("ew") Wrapper<QinshishenqingEntity> wrapper);

	List<QinshishenqingView> selectListView(Pagination page,@Param("ew") Wrapper<QinshishenqingEntity> wrapper);
	
	QinshishenqingView selectView(@Param("ew") Wrapper<QinshishenqingEntity> wrapper);
	

}
