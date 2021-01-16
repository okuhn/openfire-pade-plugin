package org.ifsoft.websockets;

import org.eclipse.jetty.util.ssl.SslContextFactory;

public class SslContextFactoryProvider {
	
	static final SslContextFactory.Client clientSslContextFactory;
	
	static {
		clientSslContextFactory = new SslContextFactory.Client();
		clientSslContextFactory.setValidateCerts(false);
	}
	
	public static SslContextFactory.Client getClientSslContextFactory() {
		return clientSslContextFactory;
	}

}
