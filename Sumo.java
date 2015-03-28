import lejos.nxt.*;
public class Sumo{
	
  public static void main(String[] args) 
  {

   LightSensor light = new LightSensor (SensorPort.S1);

   Thread hilo = new Thread ();

   hilo.start();
 
   while (true) {

   if(light.getLightValue()>45) {

   	Motor.A.setSpeed(300);
   	Motor.A.backward();
   	Motor.C.setSpeed(300);
   	Motor.C.backward();
    Wait(500);
    Motor.A.forward();
    Motor.C.backward();
    Wait(500)
   	
   }

   else {

   	Motor.A.setSpeed(900);
   	Motor.A.forward();
   	Motor.C.setSpeed(900);
   	Motor.C.forward();
   	
   }
  	
  }

   public static  void Wait(int t){
      try{
   	  
        Thread.sleep(t); 
   		
   	  }catch (Exception e){}
    
    }
  
  }

}