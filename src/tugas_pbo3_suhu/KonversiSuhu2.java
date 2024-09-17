package tugas_pbo3_suhu;
public class KonversiSuhu2 extends KonversiSuhu {
    public void fahrenheitToReamur(float fahrenheit){
        reamur = (fahrenheit - 32) * 4/9;
        System.out.println("\nFahrenheit\t: " + fahrenheit + "\nTo Reamur\t: " + reamur);
    } 
}
