package Tuan2;

import java.awt.Component;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ImageTableCellRenderer extends DefaultTableCellRenderer 
{
    private final int imageWidth;
    private final int imageHeight;
    public ImageTableCellRenderer(int imageWidth, int imageHeight)
    {
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
    }
    @Override
    public Component getTableCellRendererComponent(JTable table,Object value, boolean isSelected, boolean hasFocus,int row, int column) 
    {
        super.getTableCellRendererComponent(table, value,isSelected, hasFocus, row, column);
        try 
        {
            if(value!=null)    {
            URL url = new URL("file:" + value);
            ImageIcon img = new ImageIcon(url);
            img.setImage(img.getImage().getScaledInstance(imageWidth,imageHeight,Image.SCALE_DEFAULT));
            setIcon(img);
            setHorizontalAlignment(JLabel.CENTER);
            setText("");}
        }
        catch (Exception e) 
        {
            setText("[No image]");
        }
        return this;    
    }
}