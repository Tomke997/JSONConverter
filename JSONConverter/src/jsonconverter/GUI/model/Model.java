
package jsonconverter.GUI.model;

import java.util.ArrayList;
import java.util.HashMap;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import jsonconverter.BLL.BLLManager;
import jsonconverter.DAL.readAndSave.IConverter;


public class Model {
    private BLLManager manager = new BLLManager();
    
    /* contains configs from the database which can be chosen in the choiceBox */
    private ObservableList<String> configChoiceBoxItems = FXCollections.observableArrayList();

    
    /* importing configs from the database and then adding them to the configChoiceBoxItems ObservableArrayList */
    public void addConfigsToConfigChoiceBox() {
        configChoiceBoxItems.addAll("First", "Second", "Third"); // !temporary
    }
   
    
    /* calling the method which is responsible for adding items to observableArrayList and then getting this observableArrayList*/
    public ObservableList<String> getConfigChoiceBoxItems() {
        addConfigsToConfigChoiceBox();
        return configChoiceBoxItems;
    }

    public HashMap<String, Integer> getCSVHeaders(IConverter converter)
    {
        return manager.getCSVHeaders(converter);
    }
    
    public ArrayList<String> getCSVValues(IConverter converter)
    {
        return manager.getCSVValues(converter);
    }
}
