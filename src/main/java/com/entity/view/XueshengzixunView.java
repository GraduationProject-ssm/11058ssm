package com.entity.view;

import com.entity.XueshengzixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生咨询
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-20 14:00:36
 */
@TableName("xueshengzixun")
public class XueshengzixunView  extends XueshengzixunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengzixunView(){
	}
 
 	public XueshengzixunView(XueshengzixunEntity xueshengzixunEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengzixunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
