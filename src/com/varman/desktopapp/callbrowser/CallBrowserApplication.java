/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.varman.desktopapp.callbrowser;

/**
 *
 * @author varman
 */
public class CallBrowserApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(
            new Runnable() {
            @Override
            public void run() {
                CallBrowserFrame callBrowserFrame = 
                        new CallBrowserFrame();
                callBrowserFrame.setVisible(true);
            }
        }
                
        );
    }
}
