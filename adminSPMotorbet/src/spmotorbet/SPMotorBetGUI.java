package spmotorbet;


import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




public class SPMotorBetGUI extends javax.swing.JFrame {

    
     Cliente cliente;
     Conto conto;
     public float saldo=0;
     Movimento movimento;
private    SPMotorBet SPMotorBet;



    public SPMotorBetGUI() {
        initComponents();
        initPannel();
       
      SPMotorBet = SPMotorBet.getInstance(); 
    }

    
 
 
  private void  initPannel(){
    PannInsCliente2.setVisible(false);
    passlabel.setVisible(false);
    password.setVisible(false);
    msgcompletata.setVisible(false);
    riepilogo.setVisible(false);
    monitor.setVisible(false);
    PannInsCliente1.setVisible(false);
    PannInsCliente2.setVisible(false);
    PannModConto.setVisible(false);
    
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PannModConto = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        importo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        accredita = new javax.swing.JButton();
        Preleva = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        CodFisc = new javax.swing.JTextField();
        home = new javax.swing.JButton();
        SaldoAttuale = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        PannInsCliente1 = new javax.swing.JPanel();
        nome = new javax.swing.JTextField();
        codice_fiscale = new javax.swing.JTextField();
        data_nascita = new javax.swing.JTextField();
        indirizzo = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        prosegui = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cognome = new javax.swing.JTextField();
        home1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        PannInsCliente2 = new javax.swing.JPanel();
        riepilogo = new javax.swing.JLabel();
        home2 = new javax.swing.JButton();
        conferma = new javax.swing.JButton();
        labUsername = new javax.swing.JLabel();
        indietro = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        msgcompletata = new javax.swing.JLabel();
        passlabel = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        monitor = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        PannPrincipale = new javax.swing.JPanel();
        titolo = new javax.swing.JLabel();
        labelAdmin = new javax.swing.JLabel();
        aggiungi = new javax.swing.JButton();
        modConto = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1820, 850));
        setPreferredSize(new java.awt.Dimension(1820, 850));

        PannModConto.setPreferredSize(new java.awt.Dimension(1600, 900));
        PannModConto.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("MODIFICA CONTO");
        PannModConto.add(jLabel10);
        jLabel10.setBounds(710, 170, 250, 29);

        importo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importoActionPerformed(evt);
            }
        });
        PannModConto.add(importo);
        importo.setBounds(190, 360, 70, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Importo €");
        PannModConto.add(jLabel11);
        jLabel11.setBounds(110, 370, 70, 15);

        accredita.setText("Accredita");
        accredita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accreditaActionPerformed(evt);
            }
        });
        PannModConto.add(accredita);
        accredita.setBounds(590, 360, 111, 23);

        Preleva.setText("Preleva");
        Preleva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrelevaActionPerformed(evt);
            }
        });
        PannModConto.add(Preleva);
        Preleva.setBounds(590, 400, 111, 23);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Codice Fiscale");
        PannModConto.add(jLabel12);
        jLabel12.setBounds(90, 330, 90, 15);
        PannModConto.add(CodFisc);
        CodFisc.setBounds(190, 320, 146, 30);

        home.setText("HOME");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        PannModConto.add(home);
        home.setBounds(100, 790, 90, 23);
        PannModConto.add(SaldoAttuale);
        SaldoAttuale.setBounds(190, 400, 70, 30);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spmotorbet/S&p.png"))); // NOI18N
        PannModConto.add(jLabel20);
        jLabel20.setBounds(20, 10, 370, 150);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Saldo €");
        PannModConto.add(jLabel13);
        jLabel13.setBounds(130, 410, 50, 20);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spmotorbet/subaru-impreza-wrc.png"))); // NOI18N
        PannModConto.add(jLabel19);
        jLabel19.setBounds(0, 0, 1600, 900);

        PannInsCliente1.setMinimumSize(new java.awt.Dimension(1886, 850));
        PannInsCliente1.setPreferredSize(new java.awt.Dimension(1886, 850));
        PannInsCliente1.setLayout(null);

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        PannInsCliente1.add(nome);
        nome.setBounds(290, 370, 99, 20);

        codice_fiscale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codice_fiscaleActionPerformed(evt);
            }
        });
        PannInsCliente1.add(codice_fiscale);
        codice_fiscale.setBounds(290, 430, 99, 20);
        PannInsCliente1.add(data_nascita);
        data_nascita.setBounds(290, 460, 99, 20);
        PannInsCliente1.add(indirizzo);
        indirizzo.setBounds(290, 490, 99, 20);
        PannInsCliente1.add(telefono);
        telefono.setBounds(290, 520, 99, 20);

        prosegui.setText("Prosegui");
        prosegui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proseguiActionPerformed(evt);
            }
        });
        PannInsCliente1.add(prosegui);
        prosegui.setBounds(1190, 790, 90, 30);

        jButton2.setText("Reset");
        jButton2.setAlignmentX(0.5F);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        PannInsCliente1.add(jButton2);
        jButton2.setBounds(1290, 790, 90, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome");
        PannInsCliente1.add(jLabel1);
        jLabel1.setBounds(160, 370, 90, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cognome");
        PannInsCliente1.add(jLabel2);
        jLabel2.setBounds(160, 400, 100, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cod.Fiscale");
        PannInsCliente1.add(jLabel3);
        jLabel3.setBounds(160, 430, 90, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Data di nascita");
        PannInsCliente1.add(jLabel4);
        jLabel4.setBounds(160, 460, 110, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("gg/mm/aaaa");
        PannInsCliente1.add(jLabel5);
        jLabel5.setBounds(390, 460, 80, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Indirizzo");
        PannInsCliente1.add(jLabel6);
        jLabel6.setBounds(160, 490, 100, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefono");
        PannInsCliente1.add(jLabel7);
        jLabel7.setBounds(160, 520, 100, 15);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("INSERIMENTO NUOVO UTENTE");
        PannInsCliente1.add(jLabel8);
        jLabel8.setBounds(600, 70, 380, 30);

        cognome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cognomeActionPerformed(evt);
            }
        });
        PannInsCliente1.add(cognome);
        cognome.setBounds(290, 400, 99, 20);

        home1.setText("HOME");
        home1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home1ActionPerformed(evt);
            }
        });
        PannInsCliente1.add(home1);
        home1.setBounds(160, 790, 90, 30);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spmotorbet/S&p.png"))); // NOI18N
        PannInsCliente1.add(jLabel16);
        jLabel16.setBounds(0, 20, 350, 130);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spmotorbet/spmotorbet.jpg"))); // NOI18N
        PannInsCliente1.add(jLabel15);
        jLabel15.setBounds(0, 0, 1820, 850);

        PannInsCliente2.setMinimumSize(new java.awt.Dimension(1820, 850));
        PannInsCliente2.setLayout(null);

        riepilogo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        riepilogo.setForeground(new java.awt.Color(255, 255, 255));
        riepilogo.setText("RIEPILOGO");
        PannInsCliente2.add(riepilogo);
        riepilogo.setBounds(890, 230, 100, 30);

        home2.setText("HOME");
        home2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home2ActionPerformed(evt);
            }
        });
        PannInsCliente2.add(home2);
        home2.setBounds(90, 760, 110, 23);

        conferma.setText("Conferma");
        conferma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confermaActionPerformed(evt);
            }
        });
        PannInsCliente2.add(conferma);
        conferma.setBounds(1289, 760, 130, 23);

        labUsername.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labUsername.setForeground(new java.awt.Color(255, 255, 255));
        labUsername.setText("Username  Utente:");
        PannInsCliente2.add(labUsername);
        labUsername.setBounds(480, 290, 120, 15);

        indietro.setText("Indietro");
        indietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietroActionPerformed(evt);
            }
        });
        PannInsCliente2.add(indietro);
        indietro.setBounds(1150, 760, 130, 23);

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        PannInsCliente2.add(username);
        username.setBounds(630, 280, 131, 30);

        msgcompletata.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        msgcompletata.setForeground(new java.awt.Color(204, 0, 0));
        msgcompletata.setText("REGISTRAZIONE COMPLETATA");
        PannInsCliente2.add(msgcompletata);
        msgcompletata.setBounds(492, 440, 300, 22);

        passlabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        passlabel.setForeground(new java.awt.Color(255, 255, 255));
        passlabel.setText("Password:");
        PannInsCliente2.add(passlabel);
        passlabel.setBounds(530, 360, 90, 15);

        password.setEditable(false);
        PannInsCliente2.add(password);
        password.setBounds(630, 350, 122, 30);

        monitor.setColumns(20);
        monitor.setRows(5);
        jScrollPane1.setViewportView(monitor);

        PannInsCliente2.add(jScrollPane1);
        jScrollPane1.setBounds(810, 280, 255, 181);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spmotorbet/S&p.png"))); // NOI18N
        PannInsCliente2.add(jLabel18);
        jLabel18.setBounds(0, 0, 400, 180);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spmotorbet/spmotorbet.jpg"))); // NOI18N
        jLabel17.setPreferredSize(new java.awt.Dimension(1600, 900));
        PannInsCliente2.add(jLabel17);
        jLabel17.setBounds(0, 0, 1600, 900);

        PannPrincipale.setPreferredSize(new java.awt.Dimension(1820, 850));
        PannPrincipale.setLayout(null);

        titolo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titolo.setForeground(new java.awt.Color(255, 255, 255));
        titolo.setText("S&P MotorBet");
        PannPrincipale.add(titolo);
        titolo.setBounds(700, 300, 168, 29);

        labelAdmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelAdmin.setForeground(new java.awt.Color(255, 255, 255));
        labelAdmin.setText("Admin");
        PannPrincipale.add(labelAdmin);
        labelAdmin.setBounds(1690, 780, 39, 15);

        aggiungi.setText("NUOVO CLIENTE");
        aggiungi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggiungiActionPerformed(evt);
            }
        });
        PannPrincipale.add(aggiungi);
        aggiungi.setBounds(560, 430, 148, 23);

        modConto.setText("MODIFICA CONTO");
        modConto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modContoActionPerformed(evt);
            }
        });
        PannPrincipale.add(modConto);
        modConto.setBounds(850, 430, 150, 23);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spmotorbet/spmotorbet.png"))); // NOI18N
        PannPrincipale.add(jLabel14);
        jLabel14.setBounds(0, 0, 1820, 850);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1886, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PannModConto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PannInsCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PannInsCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 1820, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PannPrincipale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PannModConto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PannInsCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PannInsCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PannPrincipale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proseguiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proseguiActionPerformed
       
        if(!(nome.getText().trim().isEmpty()||cognome.getText().trim().isEmpty()||indirizzo.getText().trim().isEmpty()||codice_fiscale.getText().trim().isEmpty()||telefono.getText().trim().isEmpty()||data_nascita.getText().trim().isEmpty())){
          if(nome.getText().matches(".*\\d.*")||cognome.getText().matches(".*\\d.*")){
            JOptionPane.showMessageDialog(null, "Errore: immettere valori validi per nome e/o cognome", "Error", JOptionPane.ERROR_MESSAGE);
            
            nome.setText("");
            cognome.setText("");
          } else{
        if(!telefono.getText().matches(".*\\D.*")){
        
     
                int controllo=SPMotorBet.InsNuovoCliente(nome.getText(), cognome.getText(),  indirizzo.getText(), codice_fiscale.getText(),telefono.getText(),data_nascita.getText());
                if(controllo==1){
                  
                        PannPrincipale.setVisible(false);
                        PannInsCliente1.revalidate();
                        PannInsCliente1.updateUI();
                        PannInsCliente1.setVisible(false);
                        PannInsCliente2.setVisible(true);
                        PannInsCliente2.revalidate();
                        PannInsCliente2.updateUI();
                    
                }
                else{ 
                    if(controllo==2){JOptionPane.showMessageDialog(null, "Errore: cliente già esistente", "Error", JOptionPane.ERROR_MESSAGE);
                    nome.setText("");
                            cognome.setText("");
                            codice_fiscale.setText("");
                            telefono.setText("");
                            indirizzo.setText("");
                            data_nascita.setText("");
              }else{JOptionPane.showMessageDialog(null, "Errore: immettere la data nel formato corretto gg/mm/aaaa", "Error", JOptionPane.ERROR_MESSAGE);
           data_nascita.setText(""); }
                        }
         
         }else{JOptionPane.showMessageDialog(null, "Errore:immettere valori validi per numero di telefono", "Error", JOptionPane.ERROR_MESSAGE);  }
        telefono.setText(""); } 
        }else{
        
        JOptionPane.showMessageDialog(null, "Errore: immettere i dati mancanti.", "Error", JOptionPane.ERROR_MESSAGE);
        }
         
    }//GEN-LAST:event_proseguiActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void codice_fiscaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codice_fiscaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codice_fiscaleActionPerformed

    private void cognomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cognomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cognomeActionPerformed

    private void confermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confermaActionPerformed
    
        
    if(!(username.getText().trim().isEmpty())){
    DateFormat format2 = new SimpleDateFormat("dd/MM/yyyy");
    boolean res=SPMotorBet.ConfermaIscrizione(username.getText(), format2);
    if(res){
    msgcompletata.setVisible(true);
    indietro.setEnabled(false);
    conferma.setEnabled(false);
    riepilogo.setVisible(true);
    password.setText(SPMotorBet.cliente.getPassword());
    monitor.setVisible(true);  
    passlabel.setVisible(true);
    password.setVisible(true);
    monitor.setText("COGNOME: "+ SPMotorBet.cliente.getCognome()+"\nNOME: "+ SPMotorBet.cliente.getNome()+"\nCODICE FISCALE: "+ SPMotorBet.cliente.getCodicefiscale()+"\nDATA DI NASCITA: "+format2.format( SPMotorBet.cliente.getData_di_nascita())+"\nINDIRIZZO: "+ SPMotorBet.cliente.getIndirizzo()+"\nTELEFONO: "+ SPMotorBet.cliente.getTelefono());
    }else{JOptionPane.showMessageDialog(null, "Errore: Inserimento Fallito.", "Error", JOptionPane.ERROR_MESSAGE);}
        
     }else{JOptionPane.showMessageDialog(null, "Errore: immettere username valido.", "Error", JOptionPane.ERROR_MESSAGE);}
        
        
    }//GEN-LAST:event_confermaActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void indietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietroActionPerformed
       
         username.setText("");
         password.setText("");
         riepilogo.setText("");
         data_nascita.setText("");
         PannInsCliente2.setVisible(false);
         PannInsCliente1.setVisible(true);
         PannInsCliente1.revalidate();
         PannInsCliente1.updateUI();
    }//GEN-LAST:event_indietroActionPerformed

    private void modContoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modContoActionPerformed
        PannModConto.setVisible(true);
        PannPrincipale.setVisible(false);
    }//GEN-LAST:event_modContoActionPerformed

    private void aggiungiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggiungiActionPerformed
         PannPrincipale.setVisible(false);
         PannInsCliente1.setVisible(true);
         PannInsCliente1.revalidate();
         PannInsCliente1.updateUI();
       
    }//GEN-LAST:event_aggiungiActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
         PannPrincipale.setVisible(true);
         PannModConto.setVisible(false);
         CodFisc.setText("");
         importo.setText("");
         SaldoAttuale.setText("");
         
    }//GEN-LAST:event_homeActionPerformed

    private void home1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home1ActionPerformed
        PannPrincipale.setVisible(true);
        PannInsCliente1.setVisible(false);
        PannPrincipale.revalidate();
        PannPrincipale.updateUI();
        nome.setText("");
        cognome.setText("");
        codice_fiscale.setText("");
        indirizzo.setText("");
        telefono.setText("");
    }//GEN-LAST:event_home1ActionPerformed

    private void home2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home2ActionPerformed
        nome.setText("");
        cognome.setText("");
        codice_fiscale.setText("");
        indirizzo.setText("");
        telefono.setText("");
        data_nascita.setText("");
        conferma.setEnabled(true);
        indietro.setEnabled(true);
        passlabel.setVisible(false);
        monitor.setVisible(false);
        msgcompletata.setVisible(false);
        password.setVisible(false);
        riepilogo.setVisible(false);
        username.setText("");
        password.setText("");
        riepilogo.setText("");
        PannPrincipale.setVisible(true);
        PannInsCliente1.setVisible(false);
        PannInsCliente2.setVisible(false);
        PannPrincipale.revalidate();
        PannPrincipale.updateUI();
    }//GEN-LAST:event_home2ActionPerformed

    
    
    
    
    private void accreditaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accreditaActionPerformed

 DecimalFormat df = new DecimalFormat("#.00");
        df.setGroupingSize(3);
        
        if(!(CodFisc.getText().trim().isEmpty()||importo.getText().trim().isEmpty())){
            //try{
                try{
                    String impformatted = df.format(Float.parseFloat(importo.getText())); //Stringa di appoggio per effettuare il troncamento a due cifre decimali e la sostituzione di , con .
                    impformatted = impformatted.replace(",", ".");
                    float imp = Float.parseFloat(impformatted);
                    float saldoFin = SPMotorBet.accredita(CodFisc.getText(), imp);
                    if (saldoFin == -1){
                        JOptionPane.showMessageDialog(null, "Errore: codice fiscale non presente nel sistema.", "Error", JOptionPane.ERROR_MESSAGE);
                        CodFisc.setText("");
                         SaldoAttuale.setText("");
                    }else{
                    SaldoAttuale.setText(Float.toString(saldoFin));}
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Errore: inserire importo numerico", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
        }else{
            JOptionPane.showMessageDialog(null, "Errore: immettere i dati mancanti.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_accreditaActionPerformed

    private void PrelevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrelevaActionPerformed
        DecimalFormat df = new DecimalFormat("#.00");
        df.setGroupingSize(3);
        
        if(!(CodFisc.getText().trim().isEmpty()||importo.getText().trim().isEmpty())){
            //try{
                try{
                    String impformatted = df.format(Float.parseFloat(importo.getText())); //Stringa di appoggio per effettuare il troncamento a due cifre decimali e la sostituzione di , con .
                    impformatted = impformatted.replace(",", ".");
                    float imp = Float.parseFloat(impformatted);
                    float saldoFin = SPMotorBet.preleva(CodFisc.getText(), imp);
                    if (saldoFin == -1){
                        
                    JOptionPane.showMessageDialog(null, "Errore: codice fiscale non presente nel sistema.", "Error", JOptionPane.ERROR_MESSAGE);
                    CodFisc.setText("");
                    SaldoAttuale.setText("");
                    }else{
                         if (saldoFin == -2){
                    JOptionPane.showMessageDialog(null, "Errore: saldo insufficiente a coprire il prelievo", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    }else{
                    SaldoAttuale.setText(Float.toString(saldoFin));
                    }
                    
                    }
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Errore: inserire importo numerico", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
        }else{
            JOptionPane.showMessageDialog(null, "Errore: immettere i dati mancanti.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        
        
           
    }//GEN-LAST:event_PrelevaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        nome.setText("");
        cognome.setText("");
        codice_fiscale.setText("");
        indirizzo.setText("");
        telefono.setText("");
        data_nascita.setText("");        // TODO add your handling code here:
          
          
          
          
          
    }//GEN-LAST:event_jButton2ActionPerformed

    private void importoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_importoActionPerformed

  
    public static void main(String args[])  {
  
        
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SPMotorBetGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CodFisc;
    private javax.swing.JPanel PannInsCliente1;
    private javax.swing.JPanel PannInsCliente2;
    private javax.swing.JPanel PannModConto;
    private javax.swing.JPanel PannPrincipale;
    private javax.swing.JButton Preleva;
    private javax.swing.JTextField SaldoAttuale;
    private javax.swing.JButton accredita;
    private javax.swing.JButton aggiungi;
    private javax.swing.JTextField codice_fiscale;
    private javax.swing.JTextField cognome;
    private javax.swing.JButton conferma;
    private javax.swing.JTextField data_nascita;
    private javax.swing.JButton home;
    private javax.swing.JButton home1;
    private javax.swing.JButton home2;
    private javax.swing.JTextField importo;
    private javax.swing.JButton indietro;
    private javax.swing.JTextField indirizzo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labUsername;
    private javax.swing.JLabel labelAdmin;
    private javax.swing.JButton modConto;
    private javax.swing.JTextArea monitor;
    private javax.swing.JLabel msgcompletata;
    private javax.swing.JTextField nome;
    private javax.swing.JLabel passlabel;
    private javax.swing.JTextField password;
    private javax.swing.JButton prosegui;
    private javax.swing.JLabel riepilogo;
    private javax.swing.JTextField telefono;
    private javax.swing.JLabel titolo;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
