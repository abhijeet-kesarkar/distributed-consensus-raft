package com.thoughtworks.ak.distributed.consensus.app;

import com.thoughtworks.ak.distributed.consensus.raft.RaftNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by abhijeek on 20/02/17.
 */
@RestController
public class MyService {

    @Autowired
    private RaftNode node;


    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET, produces = "application/json")
    public List<String> hello(@PathVariable("name") String name){
        System.out.println("service " + this );
        System.out.println("node " + node);
        return Arrays.asList("hello " + name);
    }
}
