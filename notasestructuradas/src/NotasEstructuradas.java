import javax.swing.JOptionPane;

public class NotasEstructuradas {
    public static void main(String[] args) throws Exception {
        for(int est = 1; est <=2; est++) { 
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante");
            float nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota 1 del estudiante"));
            float nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota 2 del estudiante"));
            float notaFinal = (nota1 + nota2) / 2;
            JOptionPane.showInternalMessageDialog(null, "Informacion del estudiante\nnombre: " + nombre + " Nota Final: " + notaFinal);
            if(notaFinal <= 3 ) {
                JOptionPane.showInputDialog(null, "El estudiante reprobo el curso");
            }else {
                JOptionPane.showInputDialog(null, "El estudiante aprobo el curso");
            }
        }
    }
}
