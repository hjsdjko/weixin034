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


import com.cl.dao.YonghuqiandaoDao;
import com.cl.entity.YonghuqiandaoEntity;
import com.cl.service.YonghuqiandaoService;
import com.cl.entity.view.YonghuqiandaoView;

@Service("yonghuqiandaoService")
public class YonghuqiandaoServiceImpl extends ServiceImpl<YonghuqiandaoDao, YonghuqiandaoEntity> implements YonghuqiandaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghuqiandaoEntity> page = this.selectPage(
                new Query<YonghuqiandaoEntity>(params).getPage(),
                new EntityWrapper<YonghuqiandaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghuqiandaoEntity> wrapper) {
		  Page<YonghuqiandaoView> page =new Query<YonghuqiandaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<YonghuqiandaoView> selectListView(Wrapper<YonghuqiandaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghuqiandaoView selectView(Wrapper<YonghuqiandaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<YonghuqiandaoEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<YonghuqiandaoEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<YonghuqiandaoEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
