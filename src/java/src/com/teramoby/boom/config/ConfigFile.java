package com.teramoby.boom.config;

public class ConfigFile {
	
	private static ConfigFile _config;
	
	private ConfigFile() {
		
	}
	
	public static ConfigFile getInstance() {
		if (_config == null) {
			_config = new ConfigFile();
		}
		return _config;
	}

}
