package laundry_dilapy;

import java.io.File;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class Menu_Utama extends javax.swing.JFrame {
    private int id_user = 0, id_outlet = 0;
    String role = "";
    koneksi k = new koneksi();

    /**
     * Creates new form Menu_Utama
     */
    public Menu_Utama() {
        initComponents();
        k.connect();
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
        txtiduser.setText(""+id_user);
    }

    public void setId_outlet(int id_outlet) {
        this.id_outlet = id_outlet;
        txtidoutlet.setText(""+id_outlet);
    }

    public void setRole(String role) {
        this.role = role;
        if (this.role.equals("Admin")) {
            btn_user.setEnabled(true);
            btn_member.setEnabled(true);
            btn_paket.setEnabled(true);
            btn_outlet.setEnabled(true);
            btn_transaksi.setEnabled(true);
        }else if (this.role.equals("Kasir")) {
            btn_transaksi.setEnabled(true);
            btn_member.setEnabled(true);
        }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtiduser = new javax.swing.JTextField();
        txtidoutlet = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        btn_user = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btn_member = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btn_outlet = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btn_paket = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        btn_transaksi = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btn_cetak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("ID USER      :");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("ID OUTLET :");

        txtiduser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtiduser.setEnabled(false);

        txtidoutlet.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtidoutlet.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MENU UTAMA");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        logout.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(0, 0, 102));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Icon_Logout.png"))); // NOI18N
        logout.setText("LOGOUT");
        logout.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jToolBar1.setRollover(true);

        btn_user.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_user.setForeground(new java.awt.Color(0, 0, 102));
        btn_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Icon_MUser.png"))); // NOI18N
        btn_user.setText("USER");
        btn_user.setEnabled(false);
        btn_user.setPreferredSize(new java.awt.Dimension(150, 60));
        btn_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_userActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_user);
        jToolBar1.add(jSeparator1);

        btn_member.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_member.setForeground(new java.awt.Color(0, 0, 102));
        btn_member.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Icon_Member.png"))); // NOI18N
        btn_member.setText("MEMBER");
        btn_member.setEnabled(false);
        btn_member.setPreferredSize(new java.awt.Dimension(150, 60));
        btn_member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_memberActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_member);
        jToolBar1.add(jSeparator2);

        btn_outlet.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_outlet.setForeground(new java.awt.Color(0, 0, 102));
        btn_outlet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Icon_Outlet.png"))); // NOI18N
        btn_outlet.setText("OUTLET");
        btn_outlet.setEnabled(false);
        btn_outlet.setPreferredSize(new java.awt.Dimension(150, 60));
        btn_outlet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_outletActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_outlet);
        jToolBar1.add(jSeparator4);

        btn_paket.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_paket.setForeground(new java.awt.Color(0, 0, 102));
        btn_paket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Icon_Paket.png"))); // NOI18N
        btn_paket.setText("PAKET");
        btn_paket.setEnabled(false);
        btn_paket.setPreferredSize(new java.awt.Dimension(150, 60));
        btn_paket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paketActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_paket);

        jToolBar2.setRollover(true);

        btn_transaksi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_transaksi.setForeground(new java.awt.Color(0, 0, 102));
        btn_transaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Icon_Transaksi.png"))); // NOI18N
        btn_transaksi.setText("TRANSAKSI");
        btn_transaksi.setEnabled(false);
        btn_transaksi.setPreferredSize(new java.awt.Dimension(170, 60));
        btn_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transaksiActionPerformed(evt);
            }
        });
        jToolBar2.add(btn_transaksi);
        jToolBar2.add(jSeparator3);

        btn_cetak.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_cetak.setForeground(new java.awt.Color(0, 0, 102));
        btn_cetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Icon_Cetak.png"))); // NOI18N
        btn_cetak.setText("CETAK LAPORAN");
        btn_cetak.setPreferredSize(new java.awt.Dimension(213, 60));
        btn_cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cetakActionPerformed(evt);
            }
        });
        jToolBar2.add(btn_cetak);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtidoutlet, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtiduser, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logout))
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtiduser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtidoutlet, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        Login log = new Login();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void btn_paketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paketActionPerformed
        // TODO add your handling code here:
        Paket p = new Paket();
        p.setId_user(id_user);
        p.setId_outlet(id_outlet);
        p.setRole(role);
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_paketActionPerformed

    private void btn_outletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_outletActionPerformed
        // TODO add your handling code here:
        Outlet o = new Outlet();
        o.setId_user(id_user);
        o.setId_outlet(id_outlet);
        o.setRole(role);
        o.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_outletActionPerformed

    private void btn_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_userActionPerformed
        // TODO add your handling code here:
        User u = new User();
        u.setId_user(id_user);
        u.setId_outlet(id_outlet);
        u.setRole(role);
        u.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_userActionPerformed

    private void btn_cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cetakActionPerformed
        // TODO add your handling code here:
        try {
            File namafile = new File("src/laundry_dilapy/laporan.jasper");
            JasperPrint jp = JasperFillManager.fillReport(namafile.getPath(),null, k.getCon());
            JasperViewer.viewReport(jp,false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_cetakActionPerformed

    private void btn_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transaksiActionPerformed
        // TODO add your handling code here:
        Transaksi tr = new Transaksi();
        tr.setId_user(id_user);
        tr.setId_outlet(id_outlet);
        tr.setRole(role);
        tr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_transaksiActionPerformed

    private void btn_memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_memberActionPerformed
        // TODO add your handling code here:
        Member m = new Member();
        m.setId_user(id_user);
        m.setId_outlet(id_outlet);
        m.setRole(role);
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_memberActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cetak;
    private javax.swing.JButton btn_member;
    private javax.swing.JButton btn_outlet;
    private javax.swing.JButton btn_paket;
    private javax.swing.JButton btn_transaksi;
    private javax.swing.JButton btn_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JButton logout;
    private javax.swing.JTextField txtidoutlet;
    private javax.swing.JTextField txtiduser;
    // End of variables declaration//GEN-END:variables
}
