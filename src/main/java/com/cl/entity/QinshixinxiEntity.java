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
 * 寝室信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-02 17:36:39
 */
@TableName("qinshixinxi")
public class QinshixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QinshixinxiEntity() {
		
	}
	
	public QinshixinxiEntity(T t) {
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
	 * 寝室图片
	 */
					
	private String qinshitupian;
	
	/**
	 * 寝室类型
	 */
					
	private String qinshileixing;
	
	/**
	 * 寝室位置
	 */
					
	private String qinshiweizhi;
	
	/**
	 * 可住人数
	 */
					
	private Integer kezhurenshu;
	
	/**
	 * 床位数
	 */
					
	private Integer chuangweishu;
	
	/**
	 * 已住人数
	 */
					
	private Integer yizhurenshu;
	
	/**
	 * 寝室设施
	 */
					
	private String qinshisheshi;
	
	/**
	 * 寝室规定
	 */
					
	private String qinshiguiding;
	
	/**
	 * 收藏数量
	 */
					
	private Integer storeupnum;
	
	
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
	 * 设置：寝室图片
	 */
	public void setQinshitupian(String qinshitupian) {
		this.qinshitupian = qinshitupian;
	}
	/**
	 * 获取：寝室图片
	 */
	public String getQinshitupian() {
		return qinshitupian;
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
	 * 设置：可住人数
	 */
	public void setKezhurenshu(Integer kezhurenshu) {
		this.kezhurenshu = kezhurenshu;
	}
	/**
	 * 获取：可住人数
	 */
	public Integer getKezhurenshu() {
		return kezhurenshu;
	}
	/**
	 * 设置：床位数
	 */
	public void setChuangweishu(Integer chuangweishu) {
		this.chuangweishu = chuangweishu;
	}
	/**
	 * 获取：床位数
	 */
	public Integer getChuangweishu() {
		return chuangweishu;
	}
	/**
	 * 设置：已住人数
	 */
	public void setYizhurenshu(Integer yizhurenshu) {
		this.yizhurenshu = yizhurenshu;
	}
	/**
	 * 获取：已住人数
	 */
	public Integer getYizhurenshu() {
		return yizhurenshu;
	}
	/**
	 * 设置：寝室设施
	 */
	public void setQinshisheshi(String qinshisheshi) {
		this.qinshisheshi = qinshisheshi;
	}
	/**
	 * 获取：寝室设施
	 */
	public String getQinshisheshi() {
		return qinshisheshi;
	}
	/**
	 * 设置：寝室规定
	 */
	public void setQinshiguiding(String qinshiguiding) {
		this.qinshiguiding = qinshiguiding;
	}
	/**
	 * 获取：寝室规定
	 */
	public String getQinshiguiding() {
		return qinshiguiding;
	}
	/**
	 * 设置：收藏数量
	 */
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	/**
	 * 获取：收藏数量
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}

}
