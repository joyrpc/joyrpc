package io.joyrpc.protocol.message.heartbeat;

/*-
 * #%L
 * joyrpc
 * %%
 * Copyright (C) 2019 joyrpc.io
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import io.joyrpc.apm.health.HealthState;

import static io.joyrpc.apm.health.HealthState.HEALTHY;

/**
 * 默认心跳应答
 *
 * @date: 2019/8/23
 */
public class DefaultHeartbeatResponse implements HeartbeatResponse {
    /**
     * 健康状态
     */
    protected HealthState healthState;

    /**
     * 构造函数
     */
    public DefaultHeartbeatResponse() {
        this(HEALTHY);
    }

    /**
     * 构造函数
     *
     * @param healthState
     */
    public DefaultHeartbeatResponse(HealthState healthState) {
        this.healthState = healthState;
    }

    @Override
    public HealthState getHealthState() {
        return healthState;
    }
}
