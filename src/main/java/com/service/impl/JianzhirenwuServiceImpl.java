package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JianzhirenwuDao;
import com.entity.JianzhirenwuEntity;
import com.service.JianzhirenwuService;
import com.entity.vo.JianzhirenwuVO;
import com.entity.view.JianzhirenwuView;

@Service("jianzhirenwuService")
public class JianzhirenwuServiceImpl extends ServiceImpl<JianzhirenwuDao, JianzhirenwuEntity> implements JianzhirenwuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianzhirenwuEntity> page = this.selectPage(
                new Query<JianzhirenwuEntity>(params).getPage(),
                new EntityWrapper<JianzhirenwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianzhirenwuEntity> wrapper) {
		  Page<JianzhirenwuView> page =new Query<JianzhirenwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianzhirenwuVO> selectListVO(Wrapper<JianzhirenwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianzhirenwuVO selectVO(Wrapper<JianzhirenwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianzhirenwuView> selectListView(Wrapper<JianzhirenwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianzhirenwuView selectView(Wrapper<JianzhirenwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
