package com.bridgelabz;

public class Line {
    Point point1 = new Point();
    Point point2 = new Point();

    public Double getLengthOfLine(){
        Double lineLength = Math.sqrt(Math.pow(point2.getX()- point1.getX(),2)+Math.pow(point2.getY()- point1.getY(),2));
        System.out.println(lineLength);
        return lineLength;
    }

    public void pointsInput(){
        System.out.println("Enter point1 co-ordinates : ");
        point1.getPoints();
        System.out.println("Enter point2 co-ordinates : ");
        point2.getPoints();
    }
    public static void compareByEquals(Line line1,Line line2){
        Double length1 = line1.getLengthOfLine();
        Double length2 = line2.getLengthOfLine();

        if (length1.equals(length2)){
            System.out.println("Line1 is equal to Line2");
        }else {
            System.out.println("Line1 is not equal to Line2");
        }
    }
    public static void compareByCompareTo(Line line1, Line line2){
        Double length1 = line1.getLengthOfLine();
        Double length2 = line2.getLengthOfLine();
        if (length1.compareTo(length2) == 0){
            System.out.println("Line1 is equal to Line2");
        } else if (length1.compareTo(length2) > 0) {
            System.out.println("Line1 is greater than Line2");
        }else {
            System.out.println("Line1 is less than Line2");
        }
    }
}
