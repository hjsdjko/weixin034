package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.QinshixinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.QinshixinxiView;


/**
 * 寝室信息
 *
 * @author 
 * @email 
 * @date 2024-04-02 17:36:39
 */
public interface QinshixinxiService extends IService<QinshixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QinshixinxiView> selectListView(Wrapper<QinshixinxiEntity> wrapper);
   	
   	QinshixinxiView selectView(@Param("ew") Wrapper<QinshixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QinshixinxiEntity> wrapper);
   	

}

