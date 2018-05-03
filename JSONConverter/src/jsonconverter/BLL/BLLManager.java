/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonconverter.BLL;

import java.util.ArrayList;
import java.util.HashMap;
import jsonconverter.DAL.facade.DALFacade;
import jsonconverter.DAL.readAndSave.IConverter;

/**
 *
 * @author Samuel
 */
public class BLLManager {
    private DALFacade manager = new DALFacade();
    
    public HashMap<String, Integer> getCSVHeaders(IConverter converter)
    {
        return manager.getCSVHeaders(converter);
    }
    
    public ArrayList<String> getCSVValues(IConverter converter)
    {
        return manager.getCSVValues(converter);
    }
    
}
