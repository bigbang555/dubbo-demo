//package com.deepexi.product.controller;
//
//import com.alibaba.dubbo.config.annotation.Reference;
//import com.deepexi.user.domain.eo.Component;
//import com.deepexi.user.service.ComponentService;
//import com.deepexi.user.util.ResultUtil;
//import com.deepexi.util.config.Payload;
//import com.deepexi.util.constant.ContentType;
//import com.deepexi.util.pageHelper.PageBean;
//import java.util.List;
//import java.util.Map;
//import javax.ws.rs.Consumes;
//import javax.ws.rs.DefaultValue;
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.Produces;
//import javax.ws.rs.QueryParam;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@Service
//@Path("/api/v1/components")
//@Consumes({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
//@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
//public class ComponentController {
//
//
//    @Reference
//    private ComponentService componentService;
//
//    @GET
//    @Path("/")
//    public Payload getProductList(@QueryParam("page") @DefaultValue("1") Integer page,
//            @QueryParam("size") @DefaultValue("5") Integer size,
//            @QueryParam("name") String name,
//            @QueryParam("category") String catgeory,
//            @QueryParam("category") String version,
//            @QueryParam("status") String status) {
//        return new Payload(componentService.getProductList(page, size, price));
//    }
//
//
//    @GET
//    @Path("/{id:[a-zA-Z0-9]+}")
//    public Payload getProductById(@PathParam("id") String id) {
//        return new Payload(componentService.getComponentById(id));
//    }
//
//
//}
