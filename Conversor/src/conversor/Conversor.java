package conversor;

import javax.swing.JOptionPane;

public class Conversor {

    public static void main(String[] args) {
        int seleccion = 0;
        double valor, resultado;
        final double dolares = 0.00021, euro = 4.62, librasEsterlinas = 4.06, yenJapones = 654.05, wonCoreano = 6485.76;
        final double dolarPeso = 4677, euroPeso = 5058.04, librasEsterlinasPeso = 5758.53, yenJaponesPeso = 35.77, wonCoreanoPeso = 3.61;
        try {
            while (seleccion != 11) {
                seleccion = Integer.parseInt(JOptionPane.showInputDialog(null, "BIENVENIDO AL CONVERSOR DE MONEDA\nSeleccione opcion para relizar la conversion: \n1. Convertir de pesos a Dólares\n2. Convertir de la pesos a Euros\n3. Convertir de pesos  a Libras Esterlinas\n4. Convertir de pesos a Yen Japonés\n5. Convertir de pesos a Won sul-coreano\n6. Convertir de Dólares a pesos\n7. Convertir de Euros a pesos\n8. Convertir de Libras Esterlinas a pesos\n9. Convertir de Yen Japonés a pesos\n10. Convertir de Won sul-coreano a pesos\n11. SALIR"));
                switch (seleccion) {
                    case 1:
                        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor que desea convertir"));
                        resultado = valor * dolares;
                        JOptionPane.showMessageDialog(null, "El valor en dolares es:" + resultado);
                        confirmacion();
                        break;
                    case 2:
                        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor que desea convertir"));
                        resultado = valor * euro;
                        JOptionPane.showMessageDialog(null, "El valor en euros es:" + resultado);
                        confirmacion();
                        break;
                    case 3:
                        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor que desea convertir"));
                        resultado = valor * librasEsterlinas;
                        JOptionPane.showMessageDialog(null, "El valor en dolares es:" + resultado);
                        confirmacion();
                        break;
                    case 4:
                        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor que desea convertir"));
                        resultado = valor * yenJapones;
                        JOptionPane.showMessageDialog(null, "El valor en yen Japoones es:" + resultado);
                        confirmacion();
                        break;
                    case 5:
                        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor que desea convertir"));
                        resultado = valor * wonCoreano;
                        JOptionPane.showMessageDialog(null, "El valor en Won Coreano es:" + resultado);
                        confirmacion();
                        break;
                    case 6:
                        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor que desea convertir"));
                        resultado = valor * dolarPeso;
                        JOptionPane.showMessageDialog(null, "El valor en pesos es:" + resultado);
                        confirmacion();
                        break;
                    case 7:
                        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor que desea convertir"));
                        resultado = valor * euroPeso;
                        JOptionPane.showMessageDialog(null, "El valor en pesos es:" + resultado);
                        confirmacion();
                        break;
                    case 8:
                        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor que desea convertir"));
                        resultado = valor * librasEsterlinasPeso;
                        JOptionPane.showMessageDialog(null, "El valor en pesos es:" + resultado);
                        confirmacion();
                        break;
                    case 9:
                        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor que desea convertir"));
                        resultado = valor * yenJaponesPeso;
                        JOptionPane.showMessageDialog(null, "El valor en pesos es:" + resultado);
                        confirmacion();
                        break;
                    case 10:
                        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor que desea convertir"));
                        resultado = valor * wonCoreanoPeso;
                        JOptionPane.showMessageDialog(null, "El valor en pesos es:" + resultado);
                        confirmacion();
                        break;
                    case 11:
                        JOptionPane.showMessageDialog(null, "Aplicacion terminada");
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no valida, intente de nuevo");
                        break;
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    static void confirmacion() {
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
        if (JOptionPane.OK_OPTION == respuesta) {
            System.out.println("Selecciona opción Afirmativa");
        } else {
            JOptionPane.showMessageDialog(null, "Programa terminado");
        }
    }
}
