package com.doing.activiti.listener;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.ExecutionListener;
import org.springframework.stereotype.Component;

/**
 * 流程开始前执行监听器 demo
 * @author doing
 */
@Component
public class StartExecListener implements ExecutionListener {

    @Override
    public void notify(DelegateExecution execution) {
//        String processDefinitionId = execution.getProcessDefinitionId();
//        System.out.println("[StartExecListener]当前流程定义id：" + processDefinitionId);
//
//        IBizExampleDemoService bizExampleDemoService = SpringUtils.getBean("bizExampleDemoServiceImpl");
//        System.out.println("bizExampleDemoService=" + bizExampleDemoService);
    }
}
