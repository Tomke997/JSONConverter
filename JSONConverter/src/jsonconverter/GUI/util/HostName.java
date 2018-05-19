/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonconverter.GUI.util;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Samuel
 */
public class HostName {

    String hostname = "Unknown";
    String userName = System.getProperty("user.name");
    private Date localDateTime;

    public void takeUserInfo() throws ParseException {
        TimeZone tz = TimeZone.getTimeZone("Europe/Copenhagen");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(tz);
        localDateTime = sdf.parse(sdf.format(new Date()));

        try {
            InetAddress addr;
            addr = InetAddress.getLocalHost();
            hostname = addr.getHostName();
        } catch (UnknownHostException ex) {
            System.out.println("Hostname can not be resolved");
        }

        System.out.println("Host name: " + hostname);
        System.out.println("User name: " + userName);
        System.out.println("Time: " + localDateTime );
        
        
       
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(Date localDateTime) {
        this.localDateTime = localDateTime;
    }
}