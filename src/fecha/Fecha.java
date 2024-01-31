
package fecha;

import  javax.swing.JOptionPane;

public class Fecha {

    public static void main(String[] args) {
       
        int dia,mes,año;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dia : "));
        
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes: "));
        
        año=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año: "));
        
        if  ((dia>1)&&(dia<=30))
                {
                   if((mes>=1)  &&(mes<=12))                  
                   {
                    if(año!=0)
                    {
                        JOptionPane.showMessageDialog(null,"La fecha selecionada es correcta");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "año incorrecto");
                    }
                     
                      
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null,"Mes incorecto");
                   }
                }
        else
        {
            
           JOptionPane.showMessageDialog(null,"La fecha ingresada esta incorrecta: ");
            
        }
        
        
    }
    
}
