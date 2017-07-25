package BaiTap;

import java.awt.Component;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * Lớp dùng để hiển thị hình ảnh trong ô của table
 */

public class TableCellImageRenderer extends DefaultTableCellRenderer {  
    private static final long serialVersionUID = -7959113581100753271L;  
    private final int imageWidth;  private final int imageHeight; 
    
    public TableCellImageRenderer(int imageWidth, int imageHeight) {   
        this.imageWidth = imageWidth;   
        this.imageHeight = imageHeight;  
    }   

    @Override  
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);   
        setHorizontalAlignment(CENTER);
        try {
            if(value!=null){
                URL url = new URL("file:" + value);  
                if(value.toString().startsWith("http:")){
                    url = new URL(value.toString());  
                }
                if(!url.getFile().isEmpty()){
                    ImageIcon icon = new ImageIcon(url);
                    icon.setImage(icon.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_DEFAULT));
                    setIcon(icon);    
                    setText("");
                }
                else{
                    setIcon(null);
                    setText("[No image]");
                }
            }
        } catch (IOException e) {
            setIcon(null);
            setText("[Error image]");
        }
        return this;  
    }  
} 
