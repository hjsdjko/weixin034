package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 用户签到
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-02 17:36:40
 */
@TableName("yonghuqiandao")
public class YonghuqiandaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YonghuqiandaoEntity() {
		
	}
	
	public YonghuqiandaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 寝室号
	 */
					
	private String qinshihao;
	
	/**
	 * 寝室类型
	 */
					
	private String qinshileixing;
	
	/**
	 * 寝室位置
	 */
					
	private String qinshiweizhi;
	
	/**
	 * 签到时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date qiandaoshijian;
	
	/**
	 * 签到状态
	 */
					
	private String qiandaozhuangtai;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：寝室号
	 */
	public void setQinshihao(String qinshihao) {
		this.qinshihao = qinshihao;
	}
	/**
	 * 获取：寝室号
	 */
	public String getQinshihao() {
		return qinshihao;
	}
	/**
	 * 设置：寝室类型
	 */
	public void setQinshileixing(String qinshileixing) {
		this.qinshileixing = qinshileixing;
	}
	/**
	 * 获取：寝室类型
	 */
	public String getQinshileixing() {
		return qinshileixing;
	}
	/**
	 * 设置：寝室位置
	 */
	public void setQinshiweizhi(String qinshiweizhi) {
		this.qinshiweizhi = qinshiweizhi;
	}
	/**
	 * 获取：寝室位置
	 */
	public String getQinshiweizhi() {
		return qinshiweizhi;
	}
	/**
	 * 设置：签到时间
	 */
	public void setQiandaoshijian(Date qiandaoshijian) {
		this.qiandaoshijian = qiandaoshijian;
	}
	/**
	 * 获取：签到时间
	 */
	public Date getQiandaoshijian() {
		return qiandaoshijian;
	}
	/**
	 * 设置：签到状态
	 */
	public void setQiandaozhuangtai(String qiandaozhuangtai) {
		this.qiandaozhuangtai = qiandaozhuangtai;
	}
	/**
	 * 获取：签到状态
	 */
	public String getQiandaozhuangtai() {
		return qiandaozhuangtai;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}

}
