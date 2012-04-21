/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.varman.desktopapp.callbrowser;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author varman
 */
public class CallBrowserFrame extends JFrame{
    
    // the constant declaration
    private final static String TITLE = "Call browser from Java";
    private final static String ABOUT_TITLE = "About";
    private final static String CAMDEV_TITLE = "CAMDEV";
    private final static String CAMDEV_URL = 
            "https://www.facebook.com/groups/khcamdev/";
    
    public CallBrowserFrame() {
        
        super(TITLE);
        
        JMenuItem groupMenuItem = new JMenuItem(CAMDEV_TITLE);
        groupMenuItem.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                      Desktop desktop = Desktop.getDesktop();
                      desktop.browse(new URI(CAMDEV_URL));
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
                
        );
        
        JMenu     aboutMenu = new JMenu(ABOUT_TITLE);
        aboutMenu.add(groupMenuItem);
        
        JMenuBar  menuBar = new JMenuBar();
        menuBar.add(aboutMenu);
        
        setJMenuBar(menuBar);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
    }
}
