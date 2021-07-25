
public class Plot {
    // declares variables
    private int x, y, width, depth;

    // creating constructor
    public Plot(int x, int y, int width, int depth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.depth = depth;
    }


    // Passes object as an argument for manipulation
    public Plot(Plot plot) {
        this.x = plot.x;
        this.y = plot.y;
        this.width = plot.width;
        this.depth = plot.depth;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getDepth() {
        return depth;
    }

    public boolean encompasses(Plot plot) {
        boolean eFlag = true;
        int plotsumXDepth = plot.getX() + plot.getDepth();
        int plotsumWidDepth = plot.getWidth() + plot.getDepth();
        int plotsumXWidth = plot.getX() + plot.getWidth();
        int defaultXDepthWid = getX() + getDepth() + getWidth();
        int defaultXDepth = getX() + getDepth();

        if (plot.getX() >= getX() && plotsumXWidth >= getX() + getWidth() && plotsumXDepth >= defaultXDepth
                && plotsumXDepth + plot.getWidth() >= defaultXDepthWid
                && plotsumXDepth + plotsumWidDepth >= defaultXDepthWid + getDepth() && plotsumXDepth >= defaultXDepth
                && plot.getX() < getX() && plotsumXWidth < getWidth() + getX() && plot.getY() < getX()
                && plot.getY() < getY() + getWidth()) {
            eFlag = false;
        }
        return eFlag;
    }

    public boolean overlaps(Plot plot) {
        int widthXSum = getX() + getWidth();
        int widthYSum = getY() + getWidth();
        int getX = plot.getX();
        int getY = plot.getY();
        boolean oFlag = true;

        if (widthXSum < getX && widthYSum < getY && widthYSum < getY && widthXSum < getX() && getX() > getY()
                && widthXSum > widthYSum && widthXSum > widthYSum && getX > getX()) {
            oFlag = false;
        }

        return oFlag;
    }

    public String toString() {
        return "Upper left: (" + getX() + "," + getY() + ");Width: " + getWidth() + "Depth: " + getDepth();
    }
}
