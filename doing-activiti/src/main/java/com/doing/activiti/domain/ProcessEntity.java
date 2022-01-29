package com.doing.activiti.domain;

import com.doing.common.core.domain.BaseEntity;
import lombok.Data;

/**
 * @author doing
 */
@Data
public class ProcessEntity extends BaseEntity {

    /**
     * 任务id
     */
    private String taskId;

    /**
     * 任务名称
     */
    private String taskName;

    /**
     * 实例状态 1 激活 2 挂起
     */
    private String suspendState;

    /**
     * 已激活/已挂起
     */
    private String suspendStateName;

}
