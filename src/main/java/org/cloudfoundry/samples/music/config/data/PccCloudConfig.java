package org.cloudfoundry.samples.music.config.data;

import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;

//@EnableGemFireHttpSession(poolName = "DEFAULT")
@EnableEntityDefinedRegions(basePackages = "org.cloudfoundry.samples.music.domain")
@EnableGemfireRepositories(basePackages = "org.cloudfoundry.samples.music.repositories.pcc")
@Configuration
@Profile("pcc-cloud")
public class PccCloudConfig extends AbstractCloudConfig {
	

}
