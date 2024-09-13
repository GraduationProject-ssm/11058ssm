package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussremenjianzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussremenjianzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussremenjianzhiView;


/**
 * 热门兼职评论表
 *
 * @author 
 * @email 
 * @date 2021-01-20 14:00:36
 */
public interface DiscussremenjianzhiService extends IService<DiscussremenjianzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussremenjianzhiVO> selectListVO(Wrapper<DiscussremenjianzhiEntity> wrapper);
   	
   	DiscussremenjianzhiVO selectVO(@Param("ew") Wrapper<DiscussremenjianzhiEntity> wrapper);
   	
   	List<DiscussremenjianzhiView> selectListView(Wrapper<DiscussremenjianzhiEntity> wrapper);
   	
   	DiscussremenjianzhiView selectView(@Param("ew") Wrapper<DiscussremenjianzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussremenjianzhiEntity> wrapper);
   	
}

