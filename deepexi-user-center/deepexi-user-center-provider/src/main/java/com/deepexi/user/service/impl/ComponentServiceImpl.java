package com.deepexi.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.deepexi.user.domain.eo.Component;
import com.deepexi.user.mapper.ComponentMapper;
import com.deepexi.user.service.ComponentService;
import com.deepexi.util.pageHelper.PageBean;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Component
@Service(version = "${demo.service.version}")
public class ComponentServiceImpl implements ComponentService {

    @Autowired
    private ComponentMapper componentMapper;

    @Override
    public PageBean getComponentList(final Map<String, Object> par) {
        return null;
    }

    @Override
    public Component getComponentById(String id) {
        return componentMapper.selectById(id);
    }

    @Override
    public Object createComponent(Component component) {
        return componentMapper.insert(component);
    }

    @Override
    public Boolean deleteComponentByIds(List<String> ids) {
        try {
            componentMapper.deleteBatchIds(ids);
        } catch (RuntimeException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Boolean UpdateComponent(Component component) {
        componentMapper.updateById(component);
        return true;
    }

    @Override
    public Integer countComponents(Map<String, Object> par) {
        return null;
    }


}
