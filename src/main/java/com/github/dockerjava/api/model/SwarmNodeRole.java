package com.github.dockerjava.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.dockerjava.core.RemoteApiVersion;

/**
 * @since {@link RemoteApiVersion#VERSION_1_24}
 */
public enum SwarmNodeRole {

    @JsonProperty("worker")
    WORKER,

    @JsonProperty("manager")
    MANAGER
}
