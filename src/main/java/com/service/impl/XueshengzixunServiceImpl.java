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


import com.dao.XueshengzixunDao;
import com.entity.XueshengzixunEntity;
import com.service.XueshengzixunService;
import com.entity.vo.XueshengzixunVO;
import com.entity.view.XueshengzixunView;

@Service("xueshengzixunService")
public class XueshengzixunServiceImpl extends ServiceImpl<XueshengzixunDao, XueshengzixunEntity> implements XueshengzixunService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengzixunEntity> page = this.selectPage(
                new Query<XueshengzixunEntity>(params).getPage(),
                new EntityWrapper<XueshengzixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengzixunEntity> wrapper) {
		  Page<XueshengzixunView> page =new Query<XueshengzixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengzixunVO> selectListVO(Wrapper<XueshengzixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengzixunVO selectVO(Wrapper<XueshengzixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengzixunView> selectListView(Wrapper<XueshengzixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengzixunView selectView(Wrapper<XueshengzixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
