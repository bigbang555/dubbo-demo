package com.deepexi.product.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.deepexi.user.domain.eo.Cuser;
import com.deepexi.user.service.UserService;
import com.deepexi.util.config.Payload;
import com.deepexi.util.constant.ContentType;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@Path("/api/v1/users")
@Consumes({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Reference(version = "${demo.service.version}")
    private UserService userService;

    @GET
    @Path("/")
    public Payload getUserList(@QueryParam("page") @DefaultValue("1") Integer page,
            @QueryParam("size") @DefaultValue("10") Integer size) {
        return new Payload(userService.getUserList(page, size));
    }

    @GET
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload getProductById(@PathParam("id") String id) {
        return new Payload(userService.getUserById(id));
    }

    @POST
    public Payload createProduct(Cuser user) {
        return new Payload(userService.createUser(user));
    }

    @PUT
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload updateProductById(@PathParam("id") String id, Cuser user) {
        return new Payload(userService.updateUser(id, user));
    }


    @DELETE
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload deleteProductById(@PathParam("id") String id) {
        return new Payload(userService.deleteUserById(id));
    }


}
