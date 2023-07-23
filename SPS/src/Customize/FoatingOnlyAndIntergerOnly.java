/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customize;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;

/**
 *
 * @author Rog
 */
public class FoatingOnlyAndIntergerOnly extends JTextField{

    /**
     * @return the intergeronly
     */
    public boolean isIntergeronly() {
        return intergeronly;
    }

    /**
     * @param intergeronly the intergeronly to set
     */
    public void setIntergeronly(boolean intergeronly) {
        this.intergeronly = intergeronly;
        if(intergeronly)
            setFoatingonly(false);
    }

    /**
     * @return the foatingonly
     */
    public boolean isFoatingonly() {
        return foatingonly;
    }

    /**
     * @param foatingonly the foatingonly to set
     */
    public void setFoatingonly(boolean foatingonly) {
        this.foatingonly = foatingonly;
        if(foatingonly)
            setIntergeronly(false);
    }

    public FoatingOnlyAndIntergerOnly() {
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                txtkeyTyped(e);
              
            }
            
        } );
        
    }
    private void txtkeyTyped(KeyEvent d){
        String st=this.getText().trim();
        if(intergeronly){//only interger
            if(digit<=-1){
                if(!Character.isDigit(d.getKeyChar()))
                    d.consume();
                
            }else{
                if(st.length()>digit){
                    d.consume();
                }else{
                    if(!Character.isDigit(d.getKeyChar()))
                        d.consume();
                }
                
            }
            
        }else if(foatingonly){//only foating
            if(digit<=-1){
                if(d.getKeyChar()=='.'){
                    
                    if(st.contains(".")){
                       d.consume();
                        
                    }else if(st.equals("")){
                        this.setText("..");
                        d.consume();
                        
           
                }
                    
                }
                else{
                     if(!Character.isDigit(d.getKeyChar()))
                     d.consume();
                }
               
                
                    
                    
            }
            else{
                
                if(st.length()>digit){
                    d.consume();
                }else{
                   
                    if(d.getKeyChar()=='.'){
                        
                    if(st.contains(".")){
                       d.consume();
                        
                    }else if(st.equals("")){
                        this.setText("0.");
                        d.consume();
                        
                    }
                    else if(!st.contains(".")){
                        digit+=1;
                        
                    }
                }
                else{
                     if(!Character.isDigit(d.getKeyChar()))
                     d.consume();
                }
                    
                }
                
                    
            }
            
        }else{// any thing
            
        }
         
        
    }
    
    

    /**
     * @return the digit
     */
    public int getDigit() {
        return digit;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        this.digit = digit-1;
    }
    private int digit=-1;
    private boolean intergeronly=false;
    private boolean foatingonly=false;
    
}
