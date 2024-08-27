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


import com.cl.dao.QinshishenqingDao;
import com.cl.entity.QinshishenqingEntity;
import com.cl.service.QinshishenqingService;
import com.cl.entity.view.QinshishenqingView;

@Service("qinshishenqingService")
public class QinshishenqingServiceImpl extends ServiceImpl<QinshishenqingDao, QinshishenqingEntity> implements QinshishenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QinshishenqingEntity> page = this.selectPage(
                new Query<QinshishenqingEntity>(params).getPage(),
                new EntityWrapper<QinshishenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QinshishenqingEntity> wrapper) {
		  Page<QinshishenqingView> page =new Query<QinshishenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<QinshishenqingView> selectListView(Wrapper<QinshishenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QinshishenqingView selectView(Wrapper<QinshishenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
