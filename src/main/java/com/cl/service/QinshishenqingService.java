package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.QinshishenqingEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.QinshishenqingView;


/**
 * 寝室申请
 *
 * @author 
 * @email 
 * @date 2024-04-02 17:36:39
 */
public interface QinshishenqingService extends IService<QinshishenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QinshishenqingView> selectListView(Wrapper<QinshishenqingEntity> wrapper);
   	
   	QinshishenqingView selectView(@Param("ew") Wrapper<QinshishenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QinshishenqingEntity> wrapper);
   	

}

