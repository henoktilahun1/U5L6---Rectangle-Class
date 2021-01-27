class Rectangle {
	double length;
	double width;

	public Rectangle(double initLength, double initWidth) {
		length = initLength;
		width = initWidth;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public void setLength(double newLength) {
		length = newLength;
	}

	public void setWidth(double newWidth) {
		width = newWidth;
	}

	public String toString() {
		return "Rectangle with length" + length + "and width " + width;
	}

  //As a mutator, scaleLength is a void that multiplies
  //the length of the rectange
  public void scaleLength(double scale)
  {
    double scaleLength = length*scale;
  }

  //scaleWidth multiplies the width of the rectangle
  public void scaleWidth(double scale)
  {
    double scaleWidth = width*scale;
  }

  //scale both uses the length and width to scale both of them.
  public void scaleBoth(double scaleLen, double scaleWid)
  {
    double scaleBoth = length*scaleLen + width* scaleWid;
     
  }
}
