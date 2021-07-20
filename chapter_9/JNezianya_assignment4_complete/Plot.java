
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

    // Creates default values
    public Plot() {
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.depth = 1;
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
        boolean plotEncompasses = true;

        if (plot.getX() >= getX() && plot.getX() + plot.getWidth() >= getX() + getWidth()
                && plot.getX() + plot.getDepth() >= getX() + getDepth()
                && plot.getX() + plot.getDepth() + plot.getWidth() >= getX() + getDepth() + getWidth()
                && plot.getX() + plot.getDepth() + plot.getWidth() + plot.getDepth() >= getX() + getDepth() + getWidth()
                        + getDepth()
                && plot.getX() + plot.getDepth() >= getX() + getDepth() && plot.getX() < getX()
                && plot.getX() + plot.getWidth() < getWidth() + getX() && plot.getY() < getX()
                && plot.getY() < getY() + getWidth()) {
            plotEncompasses = false;
        }
        return plotEncompasses;
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
