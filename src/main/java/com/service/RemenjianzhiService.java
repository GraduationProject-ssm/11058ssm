package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RemenjianzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RemenjianzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RemenjianzhiView;


/**
 * 热门兼职
 *
 * @author 
 * @email 
 * @date 2021-01-20 14:00:36
 */
public interface RemenjianzhiService extends IService<RemenjianzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RemenjianzhiVO> selectListVO(Wrapper<RemenjianzhiEntity> wrapper);
   	
   	RemenjianzhiVO selectVO(@Param("ew") Wrapper<RemenjianzhiEntity> wrapper);
   	
   	List<RemenjianzhiView> selectListView(Wrapper<RemenjianzhiEntity> wrapper);
   	
   	RemenjianzhiView selectView(@Param("ew") Wrapper<RemenjianzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RemenjianzhiEntity> wrapper);
   	
}

