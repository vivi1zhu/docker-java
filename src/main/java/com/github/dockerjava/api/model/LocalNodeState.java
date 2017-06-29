package com.github.dockerjava.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * https://github.com/moby/moby/blob/master/api/types/swarm/swarm.go#L174-L188
 *
 * @since 1.24
 */
public enum LocalNodeState {

    @JsonProperty("inactive")
    INACTIVE,

    @JsonProperty("pending")
    PENDING,

    @JsonProperty("active")
    ACTIVE,

    @JsonProperty("error")
    ERROR,

    @JsonProperty("locked")
    LOCKED,

    /**
     * Can not construct instance of com.github.dockerjava.api.model.LocalNodeState
     * from String value '': value not one of declared Enum instance names: [error, locked, inactive, active, pending]
     */
    @JsonProperty("")
    EMPTY

}
