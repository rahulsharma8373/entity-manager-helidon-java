package com.f.myproject;

import io.helidon.microprofile.server.Server;

public class RahulMyMainApp {

	public static void main(String[] args) {
		Server server = startServer();
		System.out.println("http://localhost:" + server.port());
	}

	static Server startServer() {
		return Server.create().start();	

	}

}
