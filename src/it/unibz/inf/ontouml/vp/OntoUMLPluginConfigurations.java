package it.unibz.inf.ontouml.vp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.vp.plugin.ApplicationManager;

public class OntoUMLPluginConfigurations {
	
	private static final String CONFIGS_FILE_NAME = ".ontouml.config.json";
	private static final String IS_PLUGIN_ENABLED = "isPluginEnabled";
	// TODO Apply OntoUML automatic color profile.
	
	private static final OntoUMLPluginConfigurations INSTANCE = new OntoUMLPluginConfigurations();
	
	private String projectId;
	private File configsFile;
	private JSONObject configsObj;
	private JSONObject projConfigObj;
	
	//OntoUMLPluginConfigurations(String workspacePath, String projectId) {
	private void updateInstance() {
		String workspacePath = ApplicationManager.instance().getWorkspaceLocation().getAbsolutePath();

		this.projectId = ApplicationManager.instance().getProjectManager().getProject().getId();
		this.configsFile = new File(workspacePath + File.separator + CONFIGS_FILE_NAME);
		
		try {
			if(this.configsFile.createNewFile()) {
				FileWriter writer = new FileWriter(this.configsFile);
				writer.write((new JSONObject()).toJSONString());
				writer.flush();
				writer.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		loadConfigurations();
	}
	
	public static OntoUMLPluginConfigurations getInstance() {
		OntoUMLPluginConfigurations configs = INSTANCE;
		
		if (configs.projectId == null
				|| !configs.projectId.equals(ApplicationManager.instance().getProjectManager().getProject().getId())) {
			configs.updateInstance();
		}
		
		return configs;
	}
	
	@SuppressWarnings("unchecked")
	private void loadConfigurations() {
        JSONParser jsonParser = new JSONParser();
        
        try (FileReader reader = new FileReader(configsFile))
        {
            configsObj = (JSONObject) jsonParser.parse(reader);
            projConfigObj = (JSONObject) configsObj.get(projectId);
            
            if(projConfigObj == null) {
            		projConfigObj = getDefaultConfig(projectId);
            		configsObj.put(projectId, projConfigObj);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            configsObj = new JSONObject();
        }
	}
	
	@SuppressWarnings("unchecked")
	private JSONObject getDefaultConfig(String projectId2) {
		JSONObject defaultConfig = new JSONObject();
		
		defaultConfig.put(IS_PLUGIN_ENABLED, false);
		
		return defaultConfig;
	}
	
	private String getProjectId() {
		return projectId;
	}

	public void saveConfigurations() {
		try (FileWriter writer = new FileWriter(configsFile)) {
			writer.write(configsObj.toJSONString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Boolean isPluginEnabled() {
		return (Boolean) projConfigObj.get(IS_PLUGIN_ENABLED);
	}

	@SuppressWarnings("unchecked")
	public void setPluginEnabled(boolean isPluginEnabled) {
		projConfigObj.put(IS_PLUGIN_ENABLED, isPluginEnabled);
	}
	
}
