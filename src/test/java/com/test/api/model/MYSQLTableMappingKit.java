package com.test.api.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * The jfinal-ext3's JFinalConfigExt will load this file silently.
 * </pre>
 */
public class MYSQLTableMappingKit {
	
	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("user", "id", User.class);
	}
}
