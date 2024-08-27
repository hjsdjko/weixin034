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

import com.cl.entity.QinshishenqingEntity;
import com.cl.entity.view.QinshishenqingView;

import com.cl.service.QinshishenqingService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 寝室申请
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-02 17:36:39
 */
@RestController
@RequestMapping("/qinshishenqing")
public class QinshishenqingController {
    @Autowired
    private QinshishenqingService qinshishenqingService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,QinshishenqingEntity qinshishenqing,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			qinshishenqing.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<QinshishenqingEntity> ew = new EntityWrapper<QinshishenqingEntity>();

		PageUtils page = qinshishenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qinshishenqing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,QinshishenqingEntity qinshishenqing, 
		HttpServletRequest request){
        EntityWrapper<QinshishenqingEntity> ew = new EntityWrapper<QinshishenqingEntity>();

		PageUtils page = qinshishenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qinshishenqing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( QinshishenqingEntity qinshishenqing){
       	EntityWrapper<QinshishenqingEntity> ew = new EntityWrapper<QinshishenqingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( qinshishenqing, "qinshishenqing")); 
        return R.ok().put("data", qinshishenqingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(QinshishenqingEntity qinshishenqing){
        EntityWrapper< QinshishenqingEntity> ew = new EntityWrapper< QinshishenqingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( qinshishenqing, "qinshishenqing")); 
		QinshishenqingView qinshishenqingView =  qinshishenqingService.selectView(ew);
		return R.ok("查询寝室申请成功").put("data", qinshishenqingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        QinshishenqingEntity qinshishenqing = qinshishenqingService.selectById(id);
		qinshishenqing = qinshishenqingService.selectView(new EntityWrapper<QinshishenqingEntity>().eq("id", id));
        return R.ok().put("data", qinshishenqing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        QinshishenqingEntity qinshishenqing = qinshishenqingService.selectById(id);
		qinshishenqing = qinshishenqingService.selectView(new EntityWrapper<QinshishenqingEntity>().eq("id", id));
        return R.ok().put("data", qinshishenqing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QinshishenqingEntity qinshishenqing, HttpServletRequest request){
    	qinshishenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qinshishenqing);
        qinshishenqingService.insert(qinshishenqing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody QinshishenqingEntity qinshishenqing, HttpServletRequest request){
    	qinshishenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qinshishenqing);
        qinshishenqingService.insert(qinshishenqing);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody QinshishenqingEntity qinshishenqing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(qinshishenqing);
        qinshishenqingService.updateById(qinshishenqing);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<QinshishenqingEntity> list = new ArrayList<QinshishenqingEntity>();
        for(Long id : ids) {
            QinshishenqingEntity qinshishenqing = qinshishenqingService.selectById(id);
            qinshishenqing.setSfsh(sfsh);
            qinshishenqing.setShhf(shhf);
            list.add(qinshishenqing);
        }
        qinshishenqingService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        qinshishenqingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
