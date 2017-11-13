class Triangle implements Figure {

	private double[] size = new double[3];

    Triangle (double[] size) {
        System.arraycopy(size, 0, this.size, 0, 3);
    }

    /*
    the array 'point[i][j]' stores the coordinates of the input points
    'i' - point number
    'j' - (=0) - X coordinate, (=1) - Y coordinate
    */
    Triangle (double[][] point) {
        this.size[0] = Math.sqrt(Math.pow(point[0][0] - point[1][0], 2) + Math.pow(point[0][1] - point[1][1], 2));
        this.size[1] = Math.sqrt(Math.pow(point[1][0] - point[2][0], 2) + Math.pow(point[1][1] - point[2][1], 2));
        this.size[2] = Math.sqrt(Math.pow(point[2][0] - point[0][0], 2) + Math.pow(point[2][1] - point[0][1], 2));
    }

    @Override
    public double calcArea() {
        //Heron's Formula
        double halfPerimeter = calcPerimeter()/2;
        return Math.sqrt(halfPerimeter*(halfPerimeter - size[0])*(halfPerimeter - size[1])*(halfPerimeter - size[2]));
    }

    @Override
    public double calcPerimeter() {
        return this.size[0] + this.size[1] + this.size[2];
    }

    @Override
    public String toString() {
        return "Triangle\nFirst side is " + size[0] + "\nSecond side is " + size[1] + "\nThird side is " + size[2]
                + "\nArea is  " + calcArea() + "\nPerimeter is " + calcPerimeter();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Triangle triangle = (Triangle) obj;
        return (this.size[0] == triangle.size[0] || this.size[1] == triangle.size[1] || this.size[2] == triangle.size[2]);
    }
}