package oops;
class point2D
{
        float a=0.0f;
        float b=0.0f;

point2D(float x,float y)
{
        this.a=x;
        this.b=y;
}
point2D()
{
        this.a=a;
        this.b=b;
}
void setx(float x)
{
      x=2.2f;
}
float getx()
{
     return a;
}
void sety(float y)
{
y=3.4f;
}
float gety()
{
return b;
}
public float[]getxy()
{
    float[]arr=new float[2];
    arr[0]= 2.2f;
    arr[1]= 3.4f;
    return arr;
}
public String toString()
        {
          return "x value:"+a+"y value:"+b;  
        }
}
class point3D extends point2D
{
    public float z;
    public point3D()
    {
        super();
        this.z=0.0f;
    }

    
    
    public                                                                                                                                                                                                     float getz()
    {
        return this.z;
    }
    public void setz(float z)
    {
        this.z=z;
    }
    point3D(float x,float y,float z)
    {
        setx(x);
        sety(y);
        this.z=z;
    }
    @Override
  public String toString()
          {
              return "values:"+a+"values:"+b+"values:"+z;
          }
            
}
    public class oops{

    public static void main(String[] args) {
        point3D obj=new point3D();
        point3D obj1;
        obj1 = new point3D(2.2,3.4,5.6);
        System.out.println(obj);
    }
    
}

    




