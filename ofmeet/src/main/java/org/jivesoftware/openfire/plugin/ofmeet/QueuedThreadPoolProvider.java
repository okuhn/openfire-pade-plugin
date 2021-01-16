package org.jivesoftware.openfire.plugin.ofmeet;

import org.eclipse.jetty.util.thread.QueuedThreadPool;

public class QueuedThreadPoolProvider {

	static final QueuedThreadPool queuedThreadPool;
	
	static {
		queuedThreadPool = new QueuedThreadPool(1024);
		queuedThreadPool.setName("ProxyConnection-HttpClient");
	}

	public static QueuedThreadPool getQueuedThreadPool() {
		return queuedThreadPool;
	}
}
