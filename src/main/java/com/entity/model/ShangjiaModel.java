package com.entity.model;

import com.entity.ShangjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 商家
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-20 14:00:36
 */
public class ShangjiaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 商家名称
	 */
	
	private String shangjiamingcheng;
		
	/**
	 * 商家类型
	 */
	
	private String shangjialeixing;
		
	/**
	 * 商家图片
	 */
	
	private String shangjiatupian;
		
	/**
	 * 联系人
	 */
	
	private String lianxiren;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 商家地址
	 */
	
	private String shangjiadizhi;
		
	/**
	 * 商家介绍
	 */
	
	private String shangjiajieshao;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：商家名称
	 */
	 
	public void setShangjiamingcheng(String shangjiamingcheng) {
		this.shangjiamingcheng = shangjiamingcheng;
	}
	
	/**
	 * 获取：商家名称
	 */
	public String getShangjiamingcheng() {
		return shangjiamingcheng;
	}
				
	
	/**
	 * 设置：商家类型
	 */
	 
	public void setShangjialeixing(String shangjialeixing) {
		this.shangjialeixing = shangjialeixing;
	}
	
	/**
	 * 获取：商家类型
	 */
	public String getShangjialeixing() {
		return shangjialeixing;
	}
				
	
	/**
	 * 设置：商家图片
	 */
	 
	public void setShangjiatupian(String shangjiatupian) {
		this.shangjiatupian = shangjiatupian;
	}
	
	/**
	 * 获取：商家图片
	 */
	public String getShangjiatupian() {
		return shangjiatupian;
	}
				
	
	/**
	 * 设置：联系人
	 */
	 
	public void setLianxiren(String lianxiren) {
		this.lianxiren = lianxiren;
	}
	
	/**
	 * 获取：联系人
	 */
	public String getLianxiren() {
		return lianxiren;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：商家地址
	 */
	 
	public void setShangjiadizhi(String shangjiadizhi) {
		this.shangjiadizhi = shangjiadizhi;
	}
	
	/**
	 * 获取：商家地址
	 */
	public String getShangjiadizhi() {
		return shangjiadizhi;
	}
				
	
	/**
	 * 设置：商家介绍
	 */
	 
	public void setShangjiajieshao(String shangjiajieshao) {
		this.shangjiajieshao = shangjiajieshao;
	}
	
	/**
	 * 获取：商家介绍
	 */
	public String getShangjiajieshao() {
		return shangjiajieshao;
	}
			
}
