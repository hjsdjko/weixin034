package com.cl.entity.view;

import com.cl.entity.QinshishenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 寝室申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-02 17:36:39
 */
@TableName("qinshishenqing")
public class QinshishenqingView  extends QinshishenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QinshishenqingView(){
	}
 
 	public QinshishenqingView(QinshishenqingEntity qinshishenqingEntity){
 	try {
			BeanUtils.copyProperties(this, qinshishenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
