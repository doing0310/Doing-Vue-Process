package com.doing.activiti.service;

import com.github.pagehelper.Page;
import com.doing.activiti.domain.ProcessDefinition;

/**
 * @author doing
 */
public interface IProcessDefinitionService {

    Page<ProcessDefinition> listProcessDefinition(ProcessDefinition processDefinition);
    void deployProcessDefinition(String filePath);
    int deleteProcessDeploymentByIds(String deploymentIds) throws Exception;
    void suspendOrActiveDefinition(String id, String suspendState);

}
