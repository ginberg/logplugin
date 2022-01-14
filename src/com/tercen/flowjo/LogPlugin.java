package com.tercen.flowjo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

import com.treestar.flowjo.engine.utility.ParameterOptionHolder;
import com.treestar.lib.core.ExportFileTypes;
import com.treestar.lib.core.ExternalAlgorithmResults;
import com.treestar.lib.core.PopulationPluginInterface;
import com.treestar.lib.xml.SElement;

public class LogPlugin extends ParameterOptionHolder implements PopulationPluginInterface {
	
	private static final Logger logger = LogManager.getLogger();
	
	public LogPlugin() {	
		LoggerContext context = (org.apache.logging.log4j.core.LoggerContext) LogManager.getContext(false);
		File file = new File("src/main/resources/log4j2.xml");
		context.setConfigLocation(file.toURI());
		logger.debug("Init logger plugin....");
	}

	@Override
	public String getName() {
		return "Logger";
	}

	@Override
	public List<String> getParameters() {
		return new ArrayList<String>();
	}

	@Override
	public ExternalAlgorithmResults invokeAlgorithm(SElement arg0, File arg1, File arg2) {
		return new ExternalAlgorithmResults();
	}

	@Override
	public ExportFileTypes useExportFileType() {
		return ExportFileTypes.CSV_CHANNEL;
	}

}
