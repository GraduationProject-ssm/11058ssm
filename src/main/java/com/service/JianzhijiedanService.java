package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianzhijiedanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianzhijiedanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianzhijiedanView;


/**
 * 兼职接单
 *
 * @author 
 * @email 
 * @date 2021-01-20 14:00:36
 */
public interface JianzhijiedanService extends IService<JianzhijiedanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianzhijiedanVO> selectListVO(Wrapper<JianzhijiedanEntity> wrapper);
   	
   	JianzhijiedanVO selectVO(@Param("ew") Wrapper<JianzhijiedanEntity> wrapper);
   	
   	List<JianzhijiedanView> selectListView(Wrapper<JianzhijiedanEntity> wrapper);
   	
   	JianzhijiedanView selectView(@Param("ew") Wrapper<JianzhijiedanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianzhijiedanEntity> wrapper);
   	
}

