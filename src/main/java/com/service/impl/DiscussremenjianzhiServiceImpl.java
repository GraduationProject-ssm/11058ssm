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


import com.dao.DiscussremenjianzhiDao;
import com.entity.DiscussremenjianzhiEntity;
import com.service.DiscussremenjianzhiService;
import com.entity.vo.DiscussremenjianzhiVO;
import com.entity.view.DiscussremenjianzhiView;

@Service("discussremenjianzhiService")
public class DiscussremenjianzhiServiceImpl extends ServiceImpl<DiscussremenjianzhiDao, DiscussremenjianzhiEntity> implements DiscussremenjianzhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussremenjianzhiEntity> page = this.selectPage(
                new Query<DiscussremenjianzhiEntity>(params).getPage(),
                new EntityWrapper<DiscussremenjianzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussremenjianzhiEntity> wrapper) {
		  Page<DiscussremenjianzhiView> page =new Query<DiscussremenjianzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussremenjianzhiVO> selectListVO(Wrapper<DiscussremenjianzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussremenjianzhiVO selectVO(Wrapper<DiscussremenjianzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussremenjianzhiView> selectListView(Wrapper<DiscussremenjianzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussremenjianzhiView selectView(Wrapper<DiscussremenjianzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
