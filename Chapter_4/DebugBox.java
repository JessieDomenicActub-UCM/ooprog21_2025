public class DebugBox {
    private int width;
    private int length;
    private int height;

    public DebugBox() {
        this.width = 1;
        this.length = 1;
        this.height = 1;
    }

    public DebugBox(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public void showData() {
        System.out.println("Width: " + width + " Length: " + length + " Height: " + height);
    }

    public int getVolume() {
        return length * width * height;
    }
    
    public static void main(String[] args) {
        
        DebugBox box1 = new DebugBox();
        System.out.println("Box 1 :");
        box1.showData();
        System.out.println("Volume: " + box1.getVolume());
        System.out.println("---");

        DebugBox box2 = new DebugBox(5, 10, 20);
        System.out.println("Box 2 :");
        box2.showData();
        System.out.println("Volume: " + box2.getVolume());
    }
}
