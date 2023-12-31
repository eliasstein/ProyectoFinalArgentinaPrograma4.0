package proyectofinal.vistas;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;


public class Main extends javax.swing.JFrame {

    public static boolean modoOscuro=false;
    public Main() {
        
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());    //Tema a utilizar
            UIManager.put( "Button.arc", 10 );                  //Bordes redondeados en los componentes
            UIManager.put( "Component.arc", 10 );               
            UIManager.put( "ProgressBar.arc", 10 );
            UIManager.put( "TextComponent.arc", 10 );
            SwingUtilities.updateComponentTreeUI(this);         //actualizamos el main
            
        } catch( Exception ex ) {
        //Error al cargar la libreria
            System.err.println("Se ha producido un error al cargar la Libreria flatlaf");
        }
        
        initComponents();
        jButton1.setIcon(new ImageIcon("src\\proyectofinal\\vistas\\Moon.png"));    //le asignamos una imagen al boton del tema oscuro
        this.setLocationRelativeTo(null);   //Hacemos que el formulario se instancie en el centro de la pantalla
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto final");
        setIconImages(null);
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jDesktopPane1.setToolTipText("");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/vistas/background.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setPreferredSize(new java.awt.Dimension(256, 256));

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39))
        );

        jMenu1.setText("Registrar");

        jMenuItem1.setText("Lector");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Libro");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem7.setText("Ejemplar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem3.setText("Prestamo");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Prestamos");

        jMenuItem4.setText("Devolucion");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        //Instanciar JInternalFrame RegistrarLector
        RegistrarLector wind = new RegistrarLector();
        int centerX = (this.getWidth() / 2) - (wind.getWidth() / 2);
        int centerY = (this.getHeight() / 2) - (wind.getHeight() / 2);
        wind.setBounds(centerX, centerY, wind.getWidth(), wind.getHeight());
        
        wind.setVisible(true);
        jDesktopPane1.add(wind);
        jDesktopPane1.moveToFront(wind);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        //Instanciar JInternalFrame RegistrarLibro
        RegistrarLibro wind = new RegistrarLibro();
        int centerX = (this.getWidth() / 2) - (wind.getWidth() / 2);
        int centerY = (this.getHeight() / 2) - (wind.getHeight() / 2);
        wind.setBounds(centerX, centerY, wind.getWidth(), wind.getHeight());
        wind.setVisible(true);
        jDesktopPane1.add(wind);
        jDesktopPane1.moveToFront(wind);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //Instanciar JInternalFrame RegistrarPrestamo
        RegistrarPrestamo wind = new RegistrarPrestamo();
        int centerX = (this.getWidth() / 2) - (wind.getWidth() / 2);
        int centerY = (this.getHeight() / 2) - (wind.getHeight() / 2);
        wind.setBounds(centerX, centerY, wind.getWidth(), wind.getHeight());
        wind.setVisible(true);
        jDesktopPane1.add(wind);
        jDesktopPane1.moveToFront(wind);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        //Instanciar JInternalFrame RegistrarEjemplar
        RegistrarEjemplar wind = new RegistrarEjemplar();
        int centerX = (this.getWidth() / 2) - (wind.getWidth() / 2);
        int centerY = (this.getHeight() / 2) - (wind.getHeight() / 2);
        wind.setBounds(centerX, centerY, wind.getWidth(), wind.getHeight());
        
        wind.setVisible(true);
        jDesktopPane1.add(wind);
        jDesktopPane1.moveToFront(wind);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if(modoOscuro==true){   //si el modo oscuro esta activado
                UIManager.setLookAndFeel(new FlatMacLightLaf());    //Aplicamos el tema claro
                SwingUtilities.updateComponentTreeUI(this);         //Actualizamos el tema
                modoOscuro=false;                                   //Ponemos el modo oscudo en desactivado
                //System.out.println("Working Directory = " + System.getProperty("user.dir"));  //para saber en que directorio se ejecuta el programa
                jButton1.setIcon(new ImageIcon("src\\proyectofinal\\vistas\\Moon.png"));    //cambiamos la imagen del boton
                jButton1.setText("");                                                       //colocamos un texto vacio
            }
            else{
                 UIManager.setLookAndFeel(new FlatMacDarkLaf());    //Aplicamos un tema oscuro
                 SwingUtilities.updateComponentTreeUI(this);        //Actualizamos  
                 modoOscuro=true;                                   //cambiamos el estado de modooscuro
                 jButton1.setIcon(new ImageIcon("src\\proyectofinal\\vistas\\Sun.png"));    //Cambiamos la imagen
                 jButton1.setText("");  //Ponemos un texto vacio en el boton
            }
        } catch( Exception ex ) {
        //Error al cargar la libreria
            System.err.println("Se ha producido un error al cargar la Libreria flatlaf");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        
        //Instanciar JInternalFrame DevolverPrestamo      
        DevolverPrestamo wind = new DevolverPrestamo(); //Guardamos el jinternal frame en una variable
        int centerX = (this.getWidth() / 2) - (wind.getWidth() / 2);    //Calculo para conseguir el centro de la pantalla en el eje x
        int centerY = (this.getHeight() / 2) - (wind.getHeight() / 2);  //Calculo para conseguir el centro de la pantalla en el eje y
        wind.setBounds(centerX, centerY, wind.getWidth(), wind.getHeight());    //Ajustamos la posicion del jinteralframe al centro de la pantalla
        
        wind.setVisible(true);                  //Hacemos visible el jinternal frame
        jDesktopPane1.add(wind);                //Lo añadimos al desktoppane
        jDesktopPane1.moveToFront(wind);        //y lo colocamos al frente para que se vea correctamente
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem7;
    // End of variables declaration//GEN-END:variables
}
