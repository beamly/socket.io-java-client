/*
 * io.socket IOTransport.java
 *
 * Copyright (c) 2011, Enno Boland
 * io.socket is a implementation of the socket.io protocol in Java.
 * 
 * See LICENSE file for more information
 */
package io.socket;

import java.io.IOException;

public interface IOTransport {
	void connect();
	void disconnect();
	void send(String text) throws IOException;
	boolean canSendBulk();
	void sendBulk(String[] texts) throws IOException;
}