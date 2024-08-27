package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.YonghuqiandaoEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YonghuqiandaoView;


/**
 * 用户签到
 *
 * @author 
 * @email 
 * @date 2024-04-02 17:36:40
 */
public interface YonghuqiandaoService extends IService<YonghuqiandaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghuqiandaoView> selectListView(Wrapper<YonghuqiandaoEntity> wrapper);
   	
   	YonghuqiandaoView selectView(@Param("ew") Wrapper<YonghuqiandaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghuqiandaoEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<YonghuqiandaoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<YonghuqiandaoEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<YonghuqiandaoEntity> wrapper);



}

