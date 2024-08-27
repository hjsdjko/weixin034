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


import com.cl.dao.QinshixinxiDao;
import com.cl.entity.QinshixinxiEntity;
import com.cl.service.QinshixinxiService;
import com.cl.entity.view.QinshixinxiView;

@Service("qinshixinxiService")
public class QinshixinxiServiceImpl extends ServiceImpl<QinshixinxiDao, QinshixinxiEntity> implements QinshixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QinshixinxiEntity> page = this.selectPage(
                new Query<QinshixinxiEntity>(params).getPage(),
                new EntityWrapper<QinshixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QinshixinxiEntity> wrapper) {
		  Page<QinshixinxiView> page =new Query<QinshixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<QinshixinxiView> selectListView(Wrapper<QinshixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QinshixinxiView selectView(Wrapper<QinshixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
