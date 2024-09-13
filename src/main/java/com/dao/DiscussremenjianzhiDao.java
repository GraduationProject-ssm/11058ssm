package com.dao;

import com.entity.DiscussremenjianzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussremenjianzhiVO;
import com.entity.view.DiscussremenjianzhiView;


/**
 * 热门兼职评论表
 * 
 * @author 
 * @email 
 * @date 2021-01-20 14:00:36
 */
public interface DiscussremenjianzhiDao extends BaseMapper<DiscussremenjianzhiEntity> {
	
	List<DiscussremenjianzhiVO> selectListVO(@Param("ew") Wrapper<DiscussremenjianzhiEntity> wrapper);
	
	DiscussremenjianzhiVO selectVO(@Param("ew") Wrapper<DiscussremenjianzhiEntity> wrapper);
	
	List<DiscussremenjianzhiView> selectListView(@Param("ew") Wrapper<DiscussremenjianzhiEntity> wrapper);

	List<DiscussremenjianzhiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussremenjianzhiEntity> wrapper);
	
	DiscussremenjianzhiView selectView(@Param("ew") Wrapper<DiscussremenjianzhiEntity> wrapper);
	
}
