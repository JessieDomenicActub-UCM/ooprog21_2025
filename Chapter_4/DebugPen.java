public class DebugPen
{
    private String color;
    private String point;

    public DebugPen()
    {
        this.color = "black";
        this.point = "fine";
    }

    public DebugPen(String color, String point)
    {
        // Fix: Use 'this' to correctly assign parameters to instance variables
        this.color = color;
        this.point = point;
    }

    public String getColor()
    {
        return color;
    }

    public String getPoint()
    {
        return point; 
    } // <-- FIX: Closing brace for the getPoint() method body added.

} // <-- FIX: Closing brace for the DebugPen class added.