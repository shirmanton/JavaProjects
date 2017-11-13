class Rectangle extends Square {

    private double[] size = new double[2];

    Rectangle(double[] size) {
        super(size[0]);
        this.size[1] = size[1];
    }

    /*
    the array 'point[i][j]' stores the coordinates of the input points
    'i' - point number
    'j' - (=0) - X coordinate, (=1) - Y coordinate
    */
    Rectangle(double[][] point) {
        super(point);
        this.size[1] = Math.sqrt(Math.pow(point[2][0] - point[3][0], 2) + Math.pow(point[2][1] - point[3][1], 2));
    }

    @Override
    public double calcArea() {
        return super.size * this.size[1];
    }

    @Override
    public double calcPerimeter() {
        return (2 * super.size) + (2 * this.size[1]);
    }

    @Override
    public String toString() {
        return "Rectangle\nFirst side is " + super.size + "\nSecond side is " + this.size[1]
                + "\nArea is  " + calcArea() + "\nPerimeter is " + calcPerimeter();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Rectangle rectangle = (Rectangle) obj;
        return (size == rectangle.size || this.size[1] == rectangle.size[1]);
    }
}