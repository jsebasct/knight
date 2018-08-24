package org.playground.atomic.knight;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = {"org.playground.atomic.knight"})
@ImportResource("/knight_beans.xml")
public class MixedMasterConfig {
}
