package node.org.ops.connector;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.knime.core.node.defaultnodesettings.DefaultNodeSettingsPane;
import org.knime.core.node.defaultnodesettings.DialogComponentStringSelection;
import org.knime.core.node.defaultnodesettings.SettingsModelString;

import io.swagger.client.ApiException;
import io.swagger.models.Path;
import io.swagger.models.Swagger;
import io.swagger.parser.SwaggerParser;

/**
 * <code>NodeDialog</code> for the "Connector" Node.
 * 
 *
 * This node dialog derives from {@link DefaultNodeSettingsPane} which allows
 * creation of a simple dialog with standard components. If you need a more 
 * complex dialog please derive directly from 
 * {@link org.knime.core.node.NodeDialogPane}.
 * 
 * @author Openphacts
 */
public class ConnectorNodeDialog extends DefaultNodeSettingsPane {

    /**
     * New pane for configuring Connector node dialog.
     * This is just a suggestion to demonstrate possible default dialog
     * components.
     * @throws ApiException 
     */
    protected ConnectorNodeDialog() {
        super();
      
	   Swagger swagger = new SwaggerParser().read("http://techliners.com/ops_2_1.json");

  	   io.swagger.models.parameters.QueryParameter parameter = (io.swagger.models.parameters.QueryParameter) swagger.getPaths().get("/compound").getGet().getParameters().get(3);
	 	 
   	   System.out.println(parameter.getEnum()+" "+parameter.getName());

   	   System.out.println(parameter.getRequired());
   	
	
   	  /***** ALL PATHS *******/
       List<String> callNames = new ArrayList<String>();

       Map<String, Path>	paths =  swagger.getPaths();
   	  paths.forEach((k, v) -> {
   		  
   		  callNames.add(k.toString());

   	  	}
   	  
   	   );
   	  

		String[] stockArr = new String[callNames.size()];
		stockArr = (String[]) callNames.toArray(stockArr);

        addDialogComponent(new DialogComponentStringSelection(
                new SettingsModelString(ConnectorNodeModel.STRSEL, null),
                "Your choice:", stockArr));

    }
    

}

