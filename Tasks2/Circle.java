class Circle implements Figure {

	private double radius;

    Circle (double radius) {
        this.radius = radius;
    }

    /*
    the array 'point[i][j]' stores the coordinates of the input points
    'i' - point number
    'j' - (=0) - X coordinate, (=1) - Y coordinate
    */
    Circle (double[][] point) {
        this.radius = Math.sqrt(Math.pow(point[0][0] - point[1][0], 2) + Math.pow(point[0][1] - point[1][1], 2));
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle\nRadius is " + radius + "\nArea is  " + calcArea() + "\nPerimeter is " + calcPerimeter();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Circle circle = (Circle) obj;
        return (this.radius == circle.radius);
    }
}