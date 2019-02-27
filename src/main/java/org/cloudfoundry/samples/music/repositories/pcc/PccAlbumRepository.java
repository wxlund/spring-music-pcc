package org.cloudfoundry.samples.music.repositories.pcc;

import org.cloudfoundry.samples.music.domain.Album;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.data.gemfire.repository.GemfireRepository;
import org.springframework.stereotype.Repository;

@Profile("pcc")
public interface PccAlbumRepository extends GemfireRepository<Album, String> {
	

}
