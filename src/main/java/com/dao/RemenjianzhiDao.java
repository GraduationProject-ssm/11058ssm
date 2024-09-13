package com.dao;

import com.entity.RemenjianzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RemenjianzhiVO;
import com.entity.view.RemenjianzhiView;


/**
 * 热门兼职
 * 
 * @author 
 * @email 
 * @date 2021-01-20 14:00:36
 */
public interface RemenjianzhiDao extends BaseMapper<RemenjianzhiEntity> {
	
	List<RemenjianzhiVO> selectListVO(@Param("ew") Wrapper<RemenjianzhiEntity> wrapper);
	
	RemenjianzhiVO selectVO(@Param("ew") Wrapper<RemenjianzhiEntity> wrapper);
	
	List<RemenjianzhiView> selectListView(@Param("ew") Wrapper<RemenjianzhiEntity> wrapper);

	List<RemenjianzhiView> selectListView(Pagination page,@Param("ew") Wrapper<RemenjianzhiEntity> wrapper);
	
	RemenjianzhiView selectView(@Param("ew") Wrapper<RemenjianzhiEntity> wrapper);
	
}
