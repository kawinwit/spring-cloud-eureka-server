package com.smile.service.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class AgentEntity {

    @Id
    private String agentId;
    private String agentLevelId;

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public String getAgentLevelId() {
        return agentLevelId;
    }

    public void setAgentLevelId(String agentLevelId) {
        this.agentLevelId = agentLevelId;
    }

}
