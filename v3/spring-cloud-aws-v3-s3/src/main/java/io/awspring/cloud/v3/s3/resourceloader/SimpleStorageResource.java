package io.awspring.cloud.v3.s3.resourceloader;

import org.springframework.core.io.AbstractResource;
import org.springframework.core.io.WritableResource;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class SimpleStorageResource extends AbstractResource implements WritableResource {
	@Override
	public OutputStream getOutputStream() throws IOException {
		return null;
	}

	@Override
	public String getDescription() {
		return null;
	}

	@Override
	public InputStream getInputStream() throws IOException {
		return null;
	}
}
