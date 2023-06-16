package advancedjava;

import java.awt.Color;
import java.awt.Font;
import java.beans.*;

public class que14 {

    // Bean Properties
    private String message = "Hello World!";
    private Color backgroundColor = Color.WHITE;
    private Color foregroundColor = Color.BLACK;
    private int fontSize = 12;

    // Getters and Setters for Bean Properties
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public Color getForegroundColor() {
        return foregroundColor;
    }

    public void setForegroundColor(Color foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    // BeanInfo for Customization
    public static class Que14BeanInfo extends SimpleBeanInfo {
        @Override
        public PropertyDescriptor[] getPropertyDescriptors() {
            try {
                PropertyDescriptor messageProp = new PropertyDescriptor("message", que14.class);
                PropertyDescriptor bgProp = new PropertyDescriptor("backgroundColor", que14.class);
                PropertyDescriptor fgProp = new PropertyDescriptor("foregroundColor", que14.class);
                PropertyDescriptor sizeProp = new PropertyDescriptor("fontSize", que14.class);
                return new PropertyDescriptor[]{messageProp, bgProp, fgProp, sizeProp};
            } catch (IntrospectionException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    // Custom Method to Display Greeting Message
    public void displayMessage() {
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN, fontSize);
        System.out.println("Message: " + message);
        System.out.println("Background Color: " + backgroundColor);
        System.out.println("Foreground Color: " + foregroundColor);
        System.out.println("Font Size: " + fontSize);
    }
}
