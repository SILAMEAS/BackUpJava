/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customize_table;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rog
 */
public class customizeTable extends JTable{

    /**
     *
     * @param row
     */
    public void AddRowl(Object... row ){
        DefaultTableModel mod=(DefaultTableModel)this.getModel();
        mod.addRow(row);
        
   } 
   public Object[] Get1Row(int row){
       Object[] r=new Object[this.getColumnCount()];
       for(int i=0;i<r.length;i++){
           r[i]=this.getValueAt(row, i);
       }
       
       return r;
       
   }
   public Object[] Get1Column(int Columne){
       Object[] c=new Object[this.getRowCount()];
       for(int i=0;i<c.length;i++){
           c[i]=this.getValueAt(i, Columne);
       }
       
       return c;
       
   }
   public void RemoveAt(int row){
       DefaultTableModel mod=(DefaultTableModel)this.getModel();
       mod.removeRow(row);
   }
   public void RemoveWhenSelectRow(){
       int index[]=this.getSelectedRows();
       for(int i=index.length-1;i>=0;i--){
           RemoveAt(index[i]);
           
          
           
       }
   }
   public List<Object[]> WhenSelectedRow(){
       List<Object[]> arr=new ArrayList<>();
       int []index=this.getSelectedRows();
       for(int i=0;i<index.length;i++){
           Object[] ar=this.Get1Row(index[i]);
           arr.add(ar);
           
       }
       
       
       return arr;
       
   }
       
       
}
