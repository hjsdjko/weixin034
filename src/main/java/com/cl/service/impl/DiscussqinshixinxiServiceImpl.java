package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.DiscussqinshixinxiDao;
import com.cl.entity.DiscussqinshixinxiEntity;
import com.cl.service.DiscussqinshixinxiService;
import com.cl.entity.view.DiscussqinshixinxiView;

@Service("discussqinshixinxiService")
public class DiscussqinshixinxiServiceImpl extends ServiceImpl<DiscussqinshixinxiDao, DiscussqinshixinxiEntity> implements DiscussqinshixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussqinshixinxiEntity> page = this.selectPage(
                new Query<DiscussqinshixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussqinshixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussqinshixinxiEntity> wrapper) {
		  Page<DiscussqinshixinxiView> page =new Query<DiscussqinshixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscussqinshixinxiView> selectListView(Wrapper<DiscussqinshixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussqinshixinxiView selectView(Wrapper<DiscussqinshixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
