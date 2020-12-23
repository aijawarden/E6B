public class E6B
{
   private double d; //desired course in degrees
   private double w; //wind direction in degrees
   private double va; //airspeed in knots 
   private double vw; //wind speed in knots
   
   public E6B()
   {
      d = 360;
      w = 270;
      va = 100;
      vw = 10;
   }
   
   public E6B( double pd, double w, double pva, double pvw )
   {
      d = pd;
      this.w = w;
      va = pva;
      vw = pvw;
   }
   
   public double getDesiredCourse()
   {
      return d;
   }
   
   public double windCorrectionAngle()
   {
   return w;
   }
   
   public double groundSpeed()
   {
   return va;
   }
   
   public double getWindSpeed()
   {
   return vw;
   }
   
}