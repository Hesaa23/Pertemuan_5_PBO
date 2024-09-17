package tugas_pbo3_suhu;
public class KonversiSuhu {
    float reamur, fahrenheit;
    
    public void celciusToFahrenheit(float celcius){
        fahrenheit = (celcius * 9/5  )+ 32;
        System.out.println("Celcius\t\t: " + celcius + "\nTo fahrenheit\t: " + fahrenheit);
    }
    
    public void celciusToReamur(float celcius){
        reamur = celcius * 4/5 ;
        System.out.println("\nCelcius\t\t: " + celcius + "\nTo Reamur\t: " + reamur);
    }
}
