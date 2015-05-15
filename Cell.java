public class Cell extends BoardItem {
    protected boolean isWall = false;
    protected boolean hasPacDot = false;

    public Cell(int x, int y, boolean isWall, boolean hasPacDot) {
        super(x, y);
        if (isWall && hasPacDot)

            this.isWall = isWall;
        this.hasPacDot = hasPacDot;
    }

    public boolean isWall() {
        return isWall;
    }

    public boolean hasPacDot() {
        return hasPacDot;
    }

    public void eatPacDot() throws Exception {
        if (!hasPacDot) {
            throw new Exception("There is no PacDot in this Cell");

        }

        hasPacDot = false;
    }

    public void drawWall() {
        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.filledRectangle(x - 0.5, y - 0.5, 1, 1);
    }

    public void drawPacDot() {
        StdDraw.setPenColor(StdDraw.MAGENTA);
        StdDraw.filledCircle(x, y, 0.1);
    }
}
