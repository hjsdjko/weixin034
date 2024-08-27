package com.cl.dao;

import com.cl.entity.YonghuqiandaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YonghuqiandaoView;


/**
 * 用户签到
 * 
 * @author 
 * @email 
 * @date 2024-04-02 17:36:40
 */
public interface YonghuqiandaoDao extends BaseMapper<YonghuqiandaoEntity> {
	
	List<YonghuqiandaoView> selectListView(@Param("ew") Wrapper<YonghuqiandaoEntity> wrapper);

	List<YonghuqiandaoView> selectListView(Pagination page,@Param("ew") Wrapper<YonghuqiandaoEntity> wrapper);
	
	YonghuqiandaoView selectView(@Param("ew") Wrapper<YonghuqiandaoEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YonghuqiandaoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YonghuqiandaoEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YonghuqiandaoEntity> wrapper);



}
