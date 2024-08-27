package com.cl.entity.view;

import com.cl.entity.YonghuqiandaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 用户签到
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-02 17:36:40
 */
@TableName("yonghuqiandao")
public class YonghuqiandaoView  extends YonghuqiandaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YonghuqiandaoView(){
	}
 
 	public YonghuqiandaoView(YonghuqiandaoEntity yonghuqiandaoEntity){
 	try {
			BeanUtils.copyProperties(this, yonghuqiandaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
