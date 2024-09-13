package com.entity.view;

import com.entity.DiscussremenjianzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 热门兼职评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-20 14:00:36
 */
@TableName("discussremenjianzhi")
public class DiscussremenjianzhiView  extends DiscussremenjianzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussremenjianzhiView(){
	}
 
 	public DiscussremenjianzhiView(DiscussremenjianzhiEntity discussremenjianzhiEntity){
 	try {
			BeanUtils.copyProperties(this, discussremenjianzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
