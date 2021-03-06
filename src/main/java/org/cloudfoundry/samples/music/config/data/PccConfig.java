package org.cloudfoundry.samples.music.config.data;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;

@EnableEntityDefinedRegions(basePackages = "org.cloudfoundry.samples.music.domain")
@EnableGemfireRepositories(basePackageClasses = org.cloudfoundry.samples.music.repositories.pcc.PccAlbumRepository.class)
@Configuration
public class PccConfig {


}
