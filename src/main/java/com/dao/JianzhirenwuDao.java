package com.dao;

import com.entity.JianzhirenwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianzhirenwuVO;
import com.entity.view.JianzhirenwuView;


/**
 * 兼职任务
 * 
 * @author 
 * @email 
 * @date 2021-01-20 14:00:36
 */
public interface JianzhirenwuDao extends BaseMapper<JianzhirenwuEntity> {
	
	List<JianzhirenwuVO> selectListVO(@Param("ew") Wrapper<JianzhirenwuEntity> wrapper);
	
	JianzhirenwuVO selectVO(@Param("ew") Wrapper<JianzhirenwuEntity> wrapper);
	
	List<JianzhirenwuView> selectListView(@Param("ew") Wrapper<JianzhirenwuEntity> wrapper);

	List<JianzhirenwuView> selectListView(Pagination page,@Param("ew") Wrapper<JianzhirenwuEntity> wrapper);
	
	JianzhirenwuView selectView(@Param("ew") Wrapper<JianzhirenwuEntity> wrapper);
	
}
