package com.thoughtworks.ak.distributed.consensus.raft;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by abhijeek on 20/02/17.
 */
@Component
public class RaftNode {

    private RaftStateMachine stateMachine;

    private List<String> nodes;

    public RaftNode(RaftConfig config) {
        this.nodes = config.getNodes();
        System.out.println("nodes = " + nodes);
       // new ZQServer(this).start();
    }
}
