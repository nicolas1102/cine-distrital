/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package vista;

import modelo.MdlFuncion;
import modelo.MdlSnacks;
import modelo.MdlInicioSesion;
import modelo.MdlRegistroUsuarios;
import modelo.MdlMenuEmpleado;
import control.logica.CtrMenuEmpleado;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class VtnMenuEmpleado extends javax.swing.JFrame {

    private final MdlMenuEmpleado mdlMenuEmpleado;
    private CtrMenuEmpleado ctrMenuEmpleado;

    /**
     *
     * @param modelo
     */
    public VtnMenuEmpleado(MdlMenuEmpleado modelo) {
        this.mdlMenuEmpleado = modelo;
        initComponents();
        setLocationRelativeTo(null);
        capturarEventos();
    }

    /**
     *
     * @return
     */
    public CtrMenuEmpleado getCtrMenuEmpleado() {
        if (ctrMenuEmpleado == null) {
            ctrMenuEmpleado = new CtrMenuEmpleado(this);
        }
        return ctrMenuEmpleado;
    }

    /**
     * 
     */
    private void capturarEventos() {
        btnComprarBoletos.addActionListener(getCtrMenuEmpleado());
        btnComprarSnacks.addActionListener(getCtrMenuEmpleado());
        btnRegistrarClientes.addActionListener(getCtrMenuEmpleado());
        btnCerrarSesion.addActionListener(getCtrMenuEmpleado());
    }

    /**
     * 
     * @param multi 
     */
    public void MostrarSeleccion(String multi) {
        MdlFuncion m;
        m = new MdlFuncion();
        m.iniciar(multi);
    }

    /**
     * 
     * 
     * @param multi 
     */
    public void mostrarSnacks(String multi) {
        MdlSnacks s;
        s = new MdlSnacks();
        s.iniciar(multi);
    }

    /**
     * 
     */
    public void mostrarRegistro() {
        MdlRegistroUsuarios r;
        r = new MdlRegistroUsuarios();
        r.iniciar();
    }

    public MdlMenuEmpleado getMdlMenuEmpleado() {
        return mdlMenuEmpleado;
    }

    public JButton getBotonSnacks() {
        return btnComprarSnacks;
    }

    public JButton getBotonSeleccion() {
        return btnComprarBoletos;
    }

    public JButton getBotonRegistro() {
        return btnRegistrarClientes;
    }

    public JButton getBotonSesion() {
        return btnCerrarSesion;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnComprarBoletos = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnRegistrarClientes = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnComprarSnacks = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnComprarBoletos.setBackground(new java.awt.Color(204, 255, 255));
        btnComprarBoletos.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        btnComprarBoletos.setForeground(new java.awt.Color(94, 174, 253));
        btnComprarBoletos.setText("Boletos");
        btnComprarBoletos.setBorder(null);
        btnComprarBoletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarBoletosActionPerformed(evt);
            }
        });
        jPanel2.add(btnComprarBoletos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 200, 50));

        btnCerrarSesion.setBackground(new java.awt.Color(51, 51, 51));
        btnCerrarSesion.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setBorder(null);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        jPanel2.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 200, 50));

        btnRegistrarClientes.setBackground(new java.awt.Color(204, 255, 255));
        btnRegistrarClientes.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        btnRegistrarClientes.setForeground(new java.awt.Color(94, 174, 253));
        btnRegistrarClientes.setText("Registrar cliente");
        btnRegistrarClientes.setBorder(null);
        btnRegistrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClientesActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 200, 50));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setText("Cine Distrital");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 220, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/palomitas-de-maiz.png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 100, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 100));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Avatar_Container.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 110, 70));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(73, 80, 87));
        jLabel7.setText("Menu vendedor");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 220, 60));

        btnComprarSnacks.setBackground(new java.awt.Color(204, 255, 255));
        btnComprarSnacks.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        btnComprarSnacks.setForeground(new java.awt.Color(94, 174, 253));
        btnComprarSnacks.setText("Tienda de Snacks");
        btnComprarSnacks.setBorder(null);
        btnComprarSnacks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarSnacksActionPerformed(evt);
            }
        });
        jPanel2.add(btnComprarSnacks, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 200, 50));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cerrar-sesion (1).png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 80, 80));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/snack (1).png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 80, 70));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ticket (1).png"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 80, 70));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 740, 510));

        jPanel1.setBackground(new java.awt.Color(244, 243, 243));
        jPanel1.setForeground(new java.awt.Color(60, 63, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/Ellipse 209.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 450, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/Union.png"))); // NOI18N
        jLabel1.setText("re");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 0, 1280, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprarBoletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarBoletosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComprarBoletosActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MdlInicioSesion mdlInicioSesion;
        mdlInicioSesion = new MdlInicioSesion();
        mdlInicioSesion.iniciar();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnRegistrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarClientesActionPerformed

    private void btnComprarSnacksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarSnacksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComprarSnacksActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnComprarBoletos;
    private javax.swing.JButton btnComprarSnacks;
    private javax.swing.JButton btnRegistrarClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}