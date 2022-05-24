package Vista;
//port com.formdev.flatlaf.FlaDarkLaf;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;
import java.time.LocalDate;
import javax.swing.UIManager;


public class MenuPrincipal extends javax.swing.JFrame {

    Login login = new Login(this, true);
    Registrar registrar = new Registrar(this, true);
    PanelAdmin panelAdmin = new PanelAdmin();

    public MenuPrincipal() {
        login.setModal(true);
        login.setVisible(true);
        login.toFront();
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/icon.png")));
        setTitle("HELIX");
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", " Septiembre",
            "Octubre", "Noviembre", "Diciemrbre"};
        fecha.setText("Hoy es " + dia + " de " + meses[month - 1] + " de " + year);
    }

    /*
    public void mostrarPanelVendedor() {
        MPESCRITORIO.add(panelVend);
        panelVend.setVisible(true);
        panelVend.toFront();
        panelVend.setLocation(MPESCRITORIO.getWidth() / 2 - panelVend.getWidth() / 2, MPESCRITORIO.getHeight() / 2 - panelVend.getHeight() / 2);
        fecha.setVisible(false);
    }
     */
    public void mostrarPanelAdmin() throws PropertyVetoException {
        MPESCRITORIO.add(panelAdmin);
        panelAdmin.setVisible(true);
        panelAdmin.toFront();
        panelAdmin.setMaximum(true);
        panelAdmin.setUI(null);
        panelAdmin.setBorder(null);
        panelAdmin.setLocation(MPESCRITORIO.getWidth() / 2 - panelAdmin.getWidth() / 2, MPESCRITORIO.getHeight() / 2 - panelAdmin.getHeight() / 2);
        fecha.setVisible(false);
        background.setVisible(false);
        admin.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MPESCRITORIO = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        fecha = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        admin = new javax.swing.JButton();
        MENUBAR = new javax.swing.JMenuBar();
        jSesion = new javax.swing.JMenu();
        jRegistrar = new javax.swing.JMenuItem();
        jLogin = new javax.swing.JMenuItem();
        jCerrar = new javax.swing.JMenuItem();
        jSalir = new javax.swing.JMenu();
        jSalirAplicacion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 700));

        MPESCRITORIO.setPreferredSize(new java.awt.Dimension(1200, 700));

        fecha.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setText(" ");

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bg.png"))); // NOI18N

        admin.setText("ADMIN");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(background)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(fecha))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(510, 510, 510)
                        .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(fecha)
                .addGap(123, 123, 123)
                .addComponent(admin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(background))
        );

        MPESCRITORIO.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout MPESCRITORIOLayout = new javax.swing.GroupLayout(MPESCRITORIO);
        MPESCRITORIO.setLayout(MPESCRITORIOLayout);
        MPESCRITORIOLayout.setHorizontalGroup(
            MPESCRITORIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MPESCRITORIOLayout.setVerticalGroup(
            MPESCRITORIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jSesion.setText("Sesion");

        jRegistrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/register.png"))); // NOI18N
        jRegistrar.setText("Registrar");
        jRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegistrarActionPerformed(evt);
            }
        });
        jSesion.add(jRegistrar);

        jLogin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login.png"))); // NOI18N
        jLogin.setText("Login");
        jLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginActionPerformed(evt);
            }
        });
        jSesion.add(jLogin);

        jCerrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logout.png"))); // NOI18N
        jCerrar.setText("Cerrar Sesion");
        jCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCerrarActionPerformed(evt);
            }
        });
        jSesion.add(jCerrar);

        MENUBAR.add(jSesion);

        jSalir.setText("Salir");

        jSalirAplicacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jSalirAplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        jSalirAplicacion.setText("Salir de la Aplicacion");
        jSalirAplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirAplicacionActionPerformed(evt);
            }
        });
        jSalir.add(jSalirAplicacion);

        MENUBAR.add(jSalir);

        setJMenuBar(MENUBAR);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MPESCRITORIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MPESCRITORIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginActionPerformed
        login.setModal(true);
        login.setVisible(true);
        login.toFront();
    }//GEN-LAST:event_jLoginActionPerformed

    private void jSalirAplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirAplicacionActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jSalirAplicacionActionPerformed

    private void jRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegistrarActionPerformed
        registrar.setModal(true);
        registrar.setVisible(true);
        registrar.toFront();
    }//GEN-LAST:event_jRegistrarActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        try {
            mostrarPanelAdmin();
        } catch (PropertyVetoException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_adminActionPerformed

    private void jCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCerrarActionPerformed
        panelAdmin.dispose();
        MPESCRITORIO.remove(panelAdmin);
        fecha.setVisible(true);
        background.setVisible(true);
        admin.setVisible(true);
    }//GEN-LAST:event_jCerrarActionPerformed

    public static void main(String args[]) {

        try {
           //UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MENUBAR;
    private javax.swing.JDesktopPane MPESCRITORIO;
    private javax.swing.JButton admin;
    private javax.swing.JLabel background;
    private javax.swing.JLabel fecha;
    private javax.swing.JMenuItem jCerrar;
    private javax.swing.JMenuItem jLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jRegistrar;
    private javax.swing.JMenu jSalir;
    private javax.swing.JMenuItem jSalirAplicacion;
    private javax.swing.JMenu jSesion;
    // End of variables declaration//GEN-END:variables
}
