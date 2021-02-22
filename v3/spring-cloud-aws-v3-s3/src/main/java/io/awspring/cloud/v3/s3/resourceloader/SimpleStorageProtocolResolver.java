package io.awspring.cloud.v3.s3.resourceloader;

import org.springframework.core.io.ProtocolResolver;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class SimpleStorageProtocolResolver implements ProtocolResolver {

	@Override
	public Resource resolve(String location, ResourceLoader resourceLoader) {
		return null;
	}
}
