package advancedjava;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.beans.*;

public class que13 extends java.awt.Panel {
    
    private Color bgColor = Color.WHITE;
    private Color fgColor = Color.BLACK;
    int size = 50;
    
    public que13() {
        setPreferredSize(new java.awt.Dimension(size, size));
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(bgColor);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(fgColor);
        g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
    }
    
    public void setBackgroundColor(Color bgColor) {
        this.bgColor = bgColor;
        repaint();
    }
    
    public Color getBackgroundColor() {
        return bgColor;
    }
    
    public void setForegroundColor(Color fgColor) {
        this.fgColor = fgColor;
        repaint();
    }
    
    public Color getForegroundColor() {
        return fgColor;
    }
    
    public void setSize(int size) {
        this.size = size;
        setPreferredSize(new java.awt.Dimension(size, size));
        repaint();
    }
    
    public int getSize() {
        return size;
    }
    
    public static class Que13BeanInfo extends SimpleBeanInfo {
        
        public PropertyDescriptor[] getPropertyDescriptors() {
            try {
                PropertyDescriptor bgColor = new PropertyDescriptor("backgroundColor", que13.class);
                bgColor.setDisplayName("Background Color");
                PropertyDescriptor fgColor = new PropertyDescriptor("foregroundColor", que13.class);
                fgColor.setDisplayName("Foreground Color");
                PropertyDescriptor size = new PropertyDescriptor("size", que13.class);
                size.setDisplayName("Size");
                return new PropertyDescriptor[] { bgColor, fgColor, size };
            } catch (IntrospectionException e) {
                e.printStackTrace();
                return null;
            }
        }
        
        public java.awt.Image getIcon(int iconKind) {
            if (iconKind == BeanInfo.ICON_COLOR_16x16) {
                return new java.awt.image.BufferedImage(16, 16, java.awt.image.BufferedImage.TYPE_INT_RGB);
            }
            return null;
        }
        
        public java.awt.Image getIcon(Rectangle iconBounds) {
            return new java.awt.image.BufferedImage(iconBounds.width, iconBounds.height, java.awt.image.BufferedImage.TYPE_INT_RGB);
        }
        
    }
    
}
