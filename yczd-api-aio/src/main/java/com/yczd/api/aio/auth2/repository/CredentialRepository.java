package com.yczd.api.aio.auth2.repository;

import com.yczd.api.aio.auth2.model.entity.Credentials;

public interface CredentialRepository {
	Credentials getByName(String name);
}
