package com.example.P2P_FileSharing_System;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DownloadApplication {


	public  void startServer(int port){
		String[] args = new String[] {"--server.port="+port};
		SpringApplication.run(DownloadApplication.class, args);
	}


}
