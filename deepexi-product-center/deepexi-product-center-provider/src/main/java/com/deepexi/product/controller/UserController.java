//package com.deepexi.product.controller;
//
//import com.alibaba.dubbo.config.annotation.Reference;
//import com.deepexi.product.domain.eo.Product;
//import com.deepexi.product.service.ProductService;
//import com.deepexi.user.domain.eo.User;
//import com.deepexi.user.service.UserService;
//import com.deepexi.util.config.Payload;
//import com.deepexi.util.constant.ContentType;
//import java.util.List;
//import javax.ws.rs.Consumes;
//import javax.ws.rs.DELETE;
//import javax.ws.rs.DefaultValue;
//import javax.ws.rs.GET;
//import javax.ws.rs.POST;
//import javax.ws.rs.PUT;
//import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.Produces;
//import javax.ws.rs.QueryParam;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//@Path("/api/v1/users")
//@Consumes({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
//@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
//public class UserController {
//
//    private final Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    @Reference
//    private UserService userService;
//
//    @GET
//    @Path("/")
//    public List<User> getAllUsers() {
//        return userService.getAllUser();
//    }
//
//}
