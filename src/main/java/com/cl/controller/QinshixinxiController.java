package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.QinshixinxiEntity;
import com.cl.entity.view.QinshixinxiView;

import com.cl.service.QinshixinxiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;
import com.cl.service.StoreupService;
import com.cl.entity.StoreupEntity;

/**
 * 寝室信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-02 17:36:39
 */
@RestController
@RequestMapping("/qinshixinxi")
public class QinshixinxiController {
    @Autowired
    private QinshixinxiService qinshixinxiService;

    @Autowired
    private StoreupService storeupService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,QinshixinxiEntity qinshixinxi,
		HttpServletRequest request){
        EntityWrapper<QinshixinxiEntity> ew = new EntityWrapper<QinshixinxiEntity>();

		PageUtils page = qinshixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qinshixinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,QinshixinxiEntity qinshixinxi, 
		HttpServletRequest request){
        EntityWrapper<QinshixinxiEntity> ew = new EntityWrapper<QinshixinxiEntity>();

		PageUtils page = qinshixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qinshixinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( QinshixinxiEntity qinshixinxi){
       	EntityWrapper<QinshixinxiEntity> ew = new EntityWrapper<QinshixinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( qinshixinxi, "qinshixinxi")); 
        return R.ok().put("data", qinshixinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(QinshixinxiEntity qinshixinxi){
        EntityWrapper< QinshixinxiEntity> ew = new EntityWrapper< QinshixinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( qinshixinxi, "qinshixinxi")); 
		QinshixinxiView qinshixinxiView =  qinshixinxiService.selectView(ew);
		return R.ok("查询寝室信息成功").put("data", qinshixinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        QinshixinxiEntity qinshixinxi = qinshixinxiService.selectById(id);
		qinshixinxi = qinshixinxiService.selectView(new EntityWrapper<QinshixinxiEntity>().eq("id", id));
        return R.ok().put("data", qinshixinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        QinshixinxiEntity qinshixinxi = qinshixinxiService.selectById(id);
		qinshixinxi = qinshixinxiService.selectView(new EntityWrapper<QinshixinxiEntity>().eq("id", id));
        return R.ok().put("data", qinshixinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QinshixinxiEntity qinshixinxi, HttpServletRequest request){
    	qinshixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qinshixinxi);
        qinshixinxiService.insert(qinshixinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody QinshixinxiEntity qinshixinxi, HttpServletRequest request){
    	qinshixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qinshixinxi);
        qinshixinxiService.insert(qinshixinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody QinshixinxiEntity qinshixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(qinshixinxi);
        qinshixinxiService.updateById(qinshixinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        qinshixinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
