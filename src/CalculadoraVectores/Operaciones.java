
package CalculadoraVectores;


public class Operaciones {
public String result;
    public void calcsuma(double Xa, double Ya,double Za, double Xb,double Yb, double Zb,double Xc, double Yc,double Zc){
    double a= (Xa+Xb+Xc);
    double b= (Ya+Yb+Yc);
    double c= (Za+Zb+Zc);
    result= "("+a+" , "+b+" , "+c+")";
 }
    public void calcresta(double Xa, double Ya,double Za, double Xb,double Yb, double Zb,double Xc, double Yc,double Zc){
    double a= (Xa-Xb-Xc);
    double b= (Ya-Yb-Yc);
    double c= (Za-Zb-Zc);
    result= "("+a+" , "+b+" , "+c+")";
 }
    public void calcTriple(double Xa, double Ya,double Za, double Xb,double Yb, double Zb,double Xc, double Yc,double Zc){
    double a= ((Xa*Yb*Zc)+(Xb*Yc*Za)+(Xc*Ya*Zb))-((Za*Yb*Xc)+(Zb*Yc*Xa)+(Zc*Ya*Xb));
    //double b= Xb*Yc*Za;
    //double c= Xc*Ya*Zb;
    //double d= Za*Yb*Xc;
    //double e= Zb*Yc*Xa;
    //double f= Zc*Ya*Xb;
    result= "" +a;
 }
    
}
