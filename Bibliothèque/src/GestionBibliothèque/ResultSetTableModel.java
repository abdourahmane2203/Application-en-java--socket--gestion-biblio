/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionBibliothèque;

import javax.swing.table.AbstractTableModel;
import java.sql.*;

/**
 *
 * @author Ousmane
 */
public class ResultSetTableModel extends AbstractTableModel{
  private ResultSet rs;

    public ResultSetTableModel(ResultSet rs) {
        this.rs = rs;
        fireTableDataChanged();
    }
  @Override
  public int getColumnCount(){
      try {
          if (rs==null) {
              return 0;
          } else {
          return rs.getMetaData().getColumnCount();
          }
      } catch (SQLException e) {
          System.out.println("getcolumn;;;;;;");
          System.out.println(e.getMessage());
          return 0;
      }
  }
  public int getRowCount(){
      try {
          if (rs==null) {
              return 0;
          } else {
              rs.last();
          return rs.getRow();
          }
      } catch (SQLException e) {
          System.out.println("getRows;;;;;;");
          System.out.println(e.getMessage());
          return 0;
      }
  }
  @Override
  public Object getValueAt(int RowIndex,int ColumnIndex){
  if (RowIndex < 0 || RowIndex > getRowCount() || ColumnIndex < 0 || ColumnIndex > getColumnCount() ) {
      return null;
          }
  try {
          if (rs==null) {
              return null;
          } else {
              rs.absolute(RowIndex + 1);
          return rs.getObject(ColumnIndex + 1);
          }
      } catch (SQLException e) {
          System.out.println("getValueAt;;;;;;");
          System.out.println(e.getMessage());
          return null;
      }
      }
  @Override
  public String getColumnName(int ColumnIndex){
  try {
          return rs.getMetaData().getColumnName( ColumnIndex + 1);
          }
       catch ( SQLException e) {
          System.out.println("getcolumnname;;;;;;");
          System.out.println(e.getMessage());
          
      }
    return super.getColumnName(ColumnIndex);
  }
}
