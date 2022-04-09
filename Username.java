/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupproject1;
import java.util.*;
/**
 *
 * @author Conor
 */
public class Username {
    private String username;
    private ArrayList<String> al = new ArrayList(); 
    
    public Username(String s)
    {
        username = s;
    }
    public Boolean isUsernameUnique()
    {
        if(!al.contains(username))
        {
            al.add(username);
        }
        return al.contains(username);
    }
    public String getUsername()
    {
        return username;
    }
}
