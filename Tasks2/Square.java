class Square implements Figure {

	protected double size;

    Square (double size) {
        this.size = size;
    }

    /*
    the array 'point[i][j]' stores the coordinates of the input points
    'i' - point number
    'j' - (=0) - X coordinate, (=1) - Y coordinate
    */
    Square (double[][] point) {
        this.size = Math.sqrt(Math.pow(point[0][0] - point[1][0], 2) + Math.pow(point[0][1] - point[1][1], 2));
    }

    @Override
    public double calcArea() {
        return Math.pow(this.size, 2);
    }

    @Override
    public double calcPerimeter() {
        return this.size * 4;
    }

    @Override
    public String toString() {
        return "Square\nIts side is " + size + "\nArea is  " + calcArea() + "\nPerimeter is " + calcPerimeter();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Square square = (Square) obj;
        return (this.size == square.size);
    }
}