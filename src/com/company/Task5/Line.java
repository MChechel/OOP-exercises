package com.company.Task5;

import com.company.Task1.Point2D;

public class Line {
    private Point2D beginPoint;
    private Point2D endPoint;

    public Line(Point2D beginPoint, Point2D endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }

    public Line(float x1, float y1, float x2, float y2) {
        this.beginPoint = new Point2D(x1,y1);
        this.endPoint = new Point2D(x2,y2);
    }

    public Point2D getBeginPoint() {
        return beginPoint;
    }

    public void setBeginPoint(Point2D beginPoint) {
        this.beginPoint = beginPoint;
    }

    public Point2D getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point2D endPoint) {
        this.endPoint = endPoint;
    }
    public double length(){
        return Math.pow((Math.pow((beginPoint.getX()-endPoint.getX()),2)+
                Math.pow((beginPoint.getY()-endPoint.getY()),2)),0.5);
    }
    public Point2D middlePoint(){
        float xMid = (beginPoint.getX()+endPoint.getX())/2;
        float yMid = (beginPoint.getY()+endPoint.getY())/2;
        return new Point2D(xMid,yMid);
    }
}
