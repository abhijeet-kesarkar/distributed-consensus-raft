package com.thoughtworks.ak.distributed.consensus.raft;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Created by abhijeek on 20/02/17.
 */
@ConfigurationProperties(prefix = "raft")
@Configuration
@Data
public class RaftConfig {

    private List<String> nodes;

    @Value("${node.index}")
    private int nodeIndex;
}
