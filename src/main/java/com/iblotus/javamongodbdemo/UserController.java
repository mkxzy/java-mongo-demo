package com.iblotus.javamongodbdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private CreateCollectionService collectionService;

    @RequestMapping("save")
    public void save(){
        collectionService.save();
    }
}
