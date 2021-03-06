package it.discovery.balancer.server;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class ServerDefinition {
    @NotNull
    private String id;

    @NotNull
    @Size(min = 6)
    private String url;

    @NotNull
    @Size(min = 3)
    private String zone;

    private boolean enabled = true;
}
