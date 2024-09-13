package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengzixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengzixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengzixunView;


/**
 * 学生咨询
 *
 * @author 
 * @email 
 * @date 2021-01-20 14:00:36
 */
public interface XueshengzixunService extends IService<XueshengzixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengzixunVO> selectListVO(Wrapper<XueshengzixunEntity> wrapper);
   	
   	XueshengzixunVO selectVO(@Param("ew") Wrapper<XueshengzixunEntity> wrapper);
   	
   	List<XueshengzixunView> selectListView(Wrapper<XueshengzixunEntity> wrapper);
   	
   	XueshengzixunView selectView(@Param("ew") Wrapper<XueshengzixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengzixunEntity> wrapper);
   	
}

