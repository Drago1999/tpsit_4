
package corsa;

import java.applet.*;
import java.awt.*;
    
//definizone della classe
//ed estensione delle proprietà alla sottoclasse
public class Suono extends Applet
{
  //inizializzazione
  public void init()
  {
    try
    {
      //caricamento del file audio
      AudioClip music=getAudioClip(getDocumentBase(), "/Corsa/Start.mp3");
    
      //riproduzione audio del file
      //music.play();
        
      //arresto della riproduzione
      //music.stop();
                 
      //riproduzione a ciclo continuo
      music.loop();
    }
        
    //notifica delle eccezioni
    catch (Exception e)
    {
    }
  }
}