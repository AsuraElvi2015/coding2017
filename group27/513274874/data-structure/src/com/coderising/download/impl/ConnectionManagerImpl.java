package com.coderising.download.impl;

import com.coderising.download.api.ConnectionException;
import com.coderising.download.api.Connection;
import com.coderising.download.api.ConnectionManager;

import java.net.MalformedURLException;
import java.net.URL;

public class ConnectionManagerImpl implements ConnectionManager {

	@Override
	public Connection open(String url) throws ConnectionException {

        Connection connection = null;
        try {
            if(url == null || "".equals(url.trim())) return null;

            URL urlO = new URL(url);
            connection = new ConnectionImpl(urlO);


        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return connection;
	}

}
