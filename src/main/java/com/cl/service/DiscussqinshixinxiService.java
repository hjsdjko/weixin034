package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscussqinshixinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussqinshixinxiView;


/**
 * 寝室信息评论表
 *
 * @author 
 * @email 
 * @date 2024-04-02 17:36:40
 */
public interface DiscussqinshixinxiService extends IService<DiscussqinshixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussqinshixinxiView> selectListView(Wrapper<DiscussqinshixinxiEntity> wrapper);
   	
   	DiscussqinshixinxiView selectView(@Param("ew") Wrapper<DiscussqinshixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussqinshixinxiEntity> wrapper);
   	

}

