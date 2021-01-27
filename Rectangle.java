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

  //scaleLength is how much we multiple the length
  public double scaleLength(double scale)
  {
    scaleLength = length*scale;
    return scaleLength;
  }

  //scaleWidth is how much we multiple the width
  public double scaleWidth(double scale)
  {
    scaleWidth = width*scale;
    return scaleWidth;
  }

  //scale both uses the length and width to scale both of them.
  public double scaleBoth(double scale)
  {
    scaleBoth = scaleLength*scaleWidth;
    return scaleBoth;
  }
}
