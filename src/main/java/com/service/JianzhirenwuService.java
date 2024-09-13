package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianzhirenwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianzhirenwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianzhirenwuView;


/**
 * 兼职任务
 *
 * @author 
 * @email 
 * @date 2021-01-20 14:00:36
 */
public interface JianzhirenwuService extends IService<JianzhirenwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianzhirenwuVO> selectListVO(Wrapper<JianzhirenwuEntity> wrapper);
   	
   	JianzhirenwuVO selectVO(@Param("ew") Wrapper<JianzhirenwuEntity> wrapper);
   	
   	List<JianzhirenwuView> selectListView(Wrapper<JianzhirenwuEntity> wrapper);
   	
   	JianzhirenwuView selectView(@Param("ew") Wrapper<JianzhirenwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianzhirenwuEntity> wrapper);
   	
}

