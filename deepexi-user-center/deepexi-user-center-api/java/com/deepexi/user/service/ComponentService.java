package com.deepexi.user.service;

import com.deepexi.user.domain.eo.Component;
import com.deepexi.util.pageHelper.PageBean;
import java.util.List;
import java.util.Map;

public interface ComponentService {

    PageBean getComponentList(Map<String, Object> par);

    Component getComponentById(String id);

    Object createComponent(Component component);

    Boolean deleteComponentByIds(List<String> ids);

    Boolean UpdateComponent(Component component);

    Integer countComponents(Map<String, Object> par);

}
