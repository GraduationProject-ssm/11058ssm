package com.entity.model;

import com.entity.WanchengpingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 完成评价
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-20 14:00:36
 */
public class WanchengpingjiaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商家编号
	 */
	
	private String shangjiabianhao;
		
	/**
	 * 总薪资
	 */
	
	private String zongxinzi;
		
	/**
	 * 任务名称
	 */
	
	private String renwumingcheng;
		
	/**
	 * 任务要求
	 */
	
	private String renwuyaoqiu;
		
	/**
	 * 完成时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date wanchengshijian;
		
	/**
	 * 附件信息
	 */
	
	private String fujianxinxi;
		
	/**
	 * 兼职评价
	 */
	
	private String jianzhipingjia;
		
	/**
	 * 内容详情
	 */
	
	private String neirongxiangqing;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：商家编号
	 */
	 
	public void setShangjiabianhao(String shangjiabianhao) {
		this.shangjiabianhao = shangjiabianhao;
	}
	
	/**
	 * 获取：商家编号
	 */
	public String getShangjiabianhao() {
		return shangjiabianhao;
	}
				
	
	/**
	 * 设置：总薪资
	 */
	 
	public void setZongxinzi(String zongxinzi) {
		this.zongxinzi = zongxinzi;
	}
	
	/**
	 * 获取：总薪资
	 */
	public String getZongxinzi() {
		return zongxinzi;
	}
				
	
	/**
	 * 设置：任务名称
	 */
	 
	public void setRenwumingcheng(String renwumingcheng) {
		this.renwumingcheng = renwumingcheng;
	}
	
	/**
	 * 获取：任务名称
	 */
	public String getRenwumingcheng() {
		return renwumingcheng;
	}
				
	
	/**
	 * 设置：任务要求
	 */
	 
	public void setRenwuyaoqiu(String renwuyaoqiu) {
		this.renwuyaoqiu = renwuyaoqiu;
	}
	
	/**
	 * 获取：任务要求
	 */
	public String getRenwuyaoqiu() {
		return renwuyaoqiu;
	}
				
	
	/**
	 * 设置：完成时间
	 */
	 
	public void setWanchengshijian(Date wanchengshijian) {
		this.wanchengshijian = wanchengshijian;
	}
	
	/**
	 * 获取：完成时间
	 */
	public Date getWanchengshijian() {
		return wanchengshijian;
	}
				
	
	/**
	 * 设置：附件信息
	 */
	 
	public void setFujianxinxi(String fujianxinxi) {
		this.fujianxinxi = fujianxinxi;
	}
	
	/**
	 * 获取：附件信息
	 */
	public String getFujianxinxi() {
		return fujianxinxi;
	}
				
	
	/**
	 * 设置：兼职评价
	 */
	 
	public void setJianzhipingjia(String jianzhipingjia) {
		this.jianzhipingjia = jianzhipingjia;
	}
	
	/**
	 * 获取：兼职评价
	 */
	public String getJianzhipingjia() {
		return jianzhipingjia;
	}
				
	
	/**
	 * 设置：内容详情
	 */
	 
	public void setNeirongxiangqing(String neirongxiangqing) {
		this.neirongxiangqing = neirongxiangqing;
	}
	
	/**
	 * 获取：内容详情
	 */
	public String getNeirongxiangqing() {
		return neirongxiangqing;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
