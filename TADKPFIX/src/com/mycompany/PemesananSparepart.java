
package com.mycompany;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Stack;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author hatephysics
 */
public class PemesananSparepart extends javax.swing.JFrame {

    /**
     * Creates new form PemesananSparepart
     */
    NumberFormat nf = NumberFormat.getNumberInstance(new Locale("in", "ID"));
    public PemesananSparepart() {
        initComponents();
        setContentPane(jPanel1);
        setTitle("Toko Game");
        setVisible(true);
        setLocationRelativeTo(null);
        codeitem kode = new codeitem();
        kode.Laptop(); kode.RAM(); kode.SSD();
        kuncifield obj = new kuncifield();
        obj.kunci();
    }
public class kuncifield {
    private void kunci(){
        txtTotalprice.setEditable(false);
        txtTax.setEditable(false);
        txtChange.setEditable(false);
        txtBonus.setEditable(false);
    }
}

public class codeitem{
private void Laptop() {
    txtItemcode.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            updateLaptopDetails();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            updateLaptopDetails();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        private void updateLaptopDetails() {
            String Kodebarang;
            Kodebarang = (String) txtItemcode.getText();

            switch (Kodebarang) {
                case "A1":
                    setOrderDetails("Acer Nitro 5", 10000000);
                    txtQty.grabFocus();
                    break;

                case "A2":
                    setOrderDetails("Asus ROG Zephyrus 15", 32000000);
                    txtQty.grabFocus();
                    break;
            }
        }
    });
}

private void RAM() {
        txtItemcode.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateRAMDetails();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateRAMDetails();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            private void updateRAMDetails() {
                String Kodebarang;
                Kodebarang = (String) txtItemcode.getText();

                switch (Kodebarang) {
                    case "B1":
                        setOrderDetails("Corsair Vengeance 2666Mhz DDR4", 2800000);
                        txtQty.grabFocus();
                        break;

                    case "B2":
                        setOrderDetails("Hyper-x 3200Mhz DDR4", 3600000);
                        txtQty.grabFocus();
                        break;
                }
            }
        });
    }

    private void SSD() {
        txtItemcode.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateSSDDetails();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateSSDDetails();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            private void updateSSDDetails() {
                String Kodebarang;
                Kodebarang = (String) txtItemcode.getText();

                switch (Kodebarang) {
                    case "C1":
                        setOrderDetails("Samsung 980Pro 512Gb", 6500000);
                        txtQty.grabFocus();
                        break;

                    case "C2":
                        setOrderDetails("Team Elite NvME 3.0 256Gb", 4100000);
                        txtQty.grabFocus();
                        break;
                }
            }
        });
    }
}
private void setOrderDetails(String orderName, double price) {
    txtOrdername.setText(orderName);
    txtPrice.setText(nf.format(price));
}

public String getOrderName() {
    return txtOrdername.getText();
}

public double getPrice() {
    String priceText = txtPrice.getText().replace(",", "");
    return Double.parseDouble(priceText);
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
        jPanel2 = new javax.swing.JPanel();
        jOrdername = new javax.swing.JLabel();
        jQTY = new javax.swing.JLabel();
        jPrice = new javax.swing.JLabel();
        jTotalprice = new javax.swing.JLabel();
        jPayment = new javax.swing.JLabel();
        txtItemcode = new javax.swing.JTextField();
        txtPayment = new javax.swing.JTextField();
        txtTotalprice = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        txtBonus = new javax.swing.JTextField();
        jbuttonpay = new javax.swing.JButton();
        Buttoninput = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        Buttonreset = new javax.swing.JButton();
        Buttonexit = new javax.swing.JButton();
        jChange = new javax.swing.JLabel();
        txtChange = new javax.swing.JTextField();
        jOrdername2 = new javax.swing.JLabel();
        txtOrdername = new javax.swing.JTextField();
        jOrdername3 = new javax.swing.JLabel();
        jOrdername4 = new javax.swing.JLabel();
        txtTax = new javax.swing.JTextField();
        jTotalprice1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jOrdername.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jOrdername.setForeground(new java.awt.Color(255, 255, 255));
        jOrdername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jOrdername.setText("Order Name");

        jQTY.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jQTY.setForeground(new java.awt.Color(255, 255, 255));
        jQTY.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jQTY.setText("QTY");
        jQTY.setToolTipText("");

        jPrice.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jPrice.setForeground(new java.awt.Color(255, 255, 255));
        jPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPrice.setText("Price");
        jPrice.setToolTipText("");

        jTotalprice.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jTotalprice.setForeground(new java.awt.Color(255, 255, 255));
        jTotalprice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTotalprice.setText("+Tax");

        jPayment.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jPayment.setForeground(new java.awt.Color(255, 255, 255));
        jPayment.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPayment.setText("Payment");

        txtItemcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemcodeActionPerformed(evt);
            }
        });

        txtPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaymentActionPerformed(evt);
            }
        });
        txtPayment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaymentKeyTyped(evt);
            }
        });

        txtTotalprice.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        txtTotalprice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalpriceActionPerformed(evt);
            }
        });

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPriceKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriceKeyTyped(evt);
            }
        });

        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });

        txtBonus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBonusActionPerformed(evt);
            }
        });

        jbuttonpay.setBackground(new java.awt.Color(153, 153, 153));
        jbuttonpay.setForeground(new java.awt.Color(0, 0, 204));
        jbuttonpay.setText("PAY");
        jbuttonpay.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), null, null));
        jbuttonpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonpayActionPerformed(evt);
            }
        });

        Buttoninput.setBackground(new java.awt.Color(153, 153, 153));
        Buttoninput.setForeground(new java.awt.Color(0, 0, 204));
        Buttoninput.setText("INPUT");
        Buttoninput.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), null, null));
        Buttoninput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtoninputActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Order Name", "QTY", "Price", "Total Price"
            }
        ));
        jScrollPane1.setViewportView(table);

        Buttonreset.setBackground(new java.awt.Color(153, 153, 153));
        Buttonreset.setForeground(new java.awt.Color(0, 0, 204));
        Buttonreset.setText("RESET");
        Buttonreset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), null, null));
        Buttonreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonresetActionPerformed(evt);
            }
        });

        Buttonexit.setBackground(new java.awt.Color(153, 153, 153));
        Buttonexit.setForeground(new java.awt.Color(0, 0, 204));
        Buttonexit.setText("EXIT");
        Buttonexit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), null, null));
        Buttonexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonexitActionPerformed(evt);
            }
        });

        jChange.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jChange.setForeground(new java.awt.Color(255, 255, 255));
        jChange.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jChange.setText("Change");

        txtChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChangeActionPerformed(evt);
            }
        });

        jOrdername2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jOrdername2.setForeground(new java.awt.Color(255, 255, 255));
        jOrdername2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jOrdername2.setText("Item Code");

        txtOrdername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrdernameActionPerformed(evt);
            }
        });

        jOrdername3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jOrdername3.setForeground(new java.awt.Color(255, 255, 255));
        jOrdername3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jOrdername3.setText("Bonus");

        jOrdername4.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jOrdername4.setForeground(new java.awt.Color(255, 255, 255));
        jOrdername4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jOrdername4.setText("Tax 10%");

        txtTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaxActionPerformed(evt);
            }
        });

        jTotalprice1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        jTotalprice1.setForeground(new java.awt.Color(255, 255, 255));
        jTotalprice1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTotalprice1.setText("Total Price");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jOrdername, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jChange, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jOrdername2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jOrdername3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jOrdername4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Buttonreset, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Buttonexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Buttoninput, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                    .addComponent(jbuttonpay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPayment)
                    .addComponent(txtPrice)
                    .addComponent(txtItemcode, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBonus)
                    .addComponent(txtChange)
                    .addComponent(txtOrdername)
                    .addComponent(txtTax))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTotalprice1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotalprice, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTotalprice, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalprice, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTotalprice1))
                        .addComponent(jTotalprice)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jOrdername2)
                            .addComponent(txtItemcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jOrdername)
                            .addComponent(txtOrdername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrice)
                            .addComponent(jPrice))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buttoninput)
                            .addComponent(jQTY))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jOrdername4)
                            .addComponent(txtTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jOrdername3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPayment))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbuttonpay, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jChange)
                            .addComponent(txtChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Buttonexit)
                            .addComponent(Buttonreset))
                        .addGap(36, 36, 36))))
        );

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/107765.png"))); // NOI18N
        jLabel1.setText("         iFIXIT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaymentActionPerformed

    private void txtTotalpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalpriceActionPerformed

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtyActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtItemcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemcodeActionPerformed

    private void txtBonusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBonusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBonusActionPerformed

    private void txtChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChangeActionPerformed

    private void ButtoninputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtoninputActionPerformed
        
        if (txtQty.getText().isEmpty() || txtItemcode.getText().isEmpty() || txtOrdername.getText().isEmpty() || txtPrice.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Mohon isi dengan lengkap!");
        }

        else {
            int HargaTotal = Integer.parseInt(txtPrice.getText().replace(".", "")) * Integer.parseInt(txtQty.getText());
            int harga = Integer.parseInt(txtPrice.getText().replace(".", ""));
                DefaultTableModel tbl = (DefaultTableModel) table.getModel();

                tbl.addRow(new Object[]{
                    txtItemcode.getText(),
                    txtOrdername.getText(),
                    txtQty.getText(),
                    nf.format(harga),
                    nf.format(HargaTotal)
                });
                double totalHargaTotal = 0.0;
                    int rowCount = tbl.getRowCount();
                    for (int i = 0; i < rowCount; i++) {
                        double hargaTotal = Double.parseDouble(tbl.getValueAt(i, 4).toString().replace(".", ""));
                        totalHargaTotal += hargaTotal;
                        double totalPajak = totalHargaTotal*0.1;
                        
                        txtTotalprice.setText(nf.format(totalHargaTotal + totalPajak));
                        txtTax.setText(nf.format(totalPajak));


    }//GEN-LAST:event_ButtoninputActionPerformed
            }
        
    }
       
    
    private void jbuttonpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonpayActionPerformed
       String total = (txtTotalprice.getText().replace(".", "")); 
       String bayar = (txtPayment.getText().replace(".", ""));
        
       if (bayar.isEmpty()){
           JOptionPane.showMessageDialog(null, "Mohon Masukan Nominal Pembayaran!");
       }
       else if (Integer.parseInt(bayar) < Integer.parseInt(total)){
           JOptionPane.showMessageDialog(null, "Uang anda tidak cukup");
               }
       else { 
       int TotalPrice = Integer.parseInt(txtTotalprice.getText().replace(".", ""));
       int Payment = Integer.parseInt(txtPayment.getText().replace(".", ""));
       txtChange.setText(nf.format(Payment - TotalPrice));
        
        
       Stack<String> stack = new Stack<>();

            if (TotalPrice < 5000000 && TotalPrice >= 2000000) {
                stack.push("Rexus Daxa 2 Pro");
            }
            if (TotalPrice >= 5000000 && TotalPrice < 15000000) {
                stack.push("Logitech MX MASTER 2S");
            }
            if (TotalPrice >= 15000000 && TotalPrice <30000000){
                stack.push("ADATA DDR5 PC41600 32GB ");
            }
            if (TotalPrice>=30000000){
                stack.push("Zotac RTX 4060TI");
            }

            String bonus;
            if (!stack.isEmpty()) {
                bonus = stack.pop();
            } 
            else {
                bonus = "No Bonus";
            }

        txtBonus.setText(bonus);  
    }//GEN-LAST:event_jbuttonpayActionPerformed
    }

    
    private void ButtonresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonresetActionPerformed
        DefaultTableModel tbl = (DefaultTableModel) table.getModel();
        
        txtItemcode.setText("");
        txtOrdername.setText("");
        txtPrice.setText("");
        txtQty.setText("");
        txtTotalprice.setText("");
        txtPayment.setText("");
        txtChange.setText("");
        txtBonus.setText("");
        txtTax.setText("");
        tbl.setRowCount(0);
    
    }//GEN-LAST:event_ButtonresetActionPerformed

    private void ButtonexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonexitActionPerformed
    System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonexitActionPerformed

    private void txtOrdernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrdernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrdernameActionPerformed

    private void txtTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaxActionPerformed

    private void txtPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceKeyPressed

    private void txtPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyTyped
                                                          
    char enter = evt.getKeyChar();
    if (!(Character.isDigit(enter) || enter == '.')) {
        evt.consume();
    }  
      // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceKeyTyped

    private void txtPaymentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaymentKeyTyped
        char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter) || enter == '.')) {
        evt.consume();
    }
    }//GEN-LAST:event_txtPaymentKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
            
            
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PemesananSparepart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PemesananSparepart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PemesananSparepart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PemesananSparepart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PemesananSparepart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buttonexit;
    private javax.swing.JButton Buttoninput;
    private javax.swing.JButton Buttonreset;
    private javax.swing.JLabel jChange;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jOrdername;
    private javax.swing.JLabel jOrdername2;
    private javax.swing.JLabel jOrdername3;
    private javax.swing.JLabel jOrdername4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jPayment;
    private javax.swing.JLabel jPrice;
    private javax.swing.JLabel jQTY;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jTotalprice;
    private javax.swing.JLabel jTotalprice1;
    private javax.swing.JButton jbuttonpay;
    public javax.swing.JTable table;
    private javax.swing.JTextField txtBonus;
    private javax.swing.JTextField txtChange;
    private javax.swing.JTextField txtItemcode;
    private javax.swing.JTextField txtOrdername;
    private javax.swing.JTextField txtPayment;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtTax;
    private javax.swing.JTextField txtTotalprice;
    // End of variables declaration//GEN-END:variables
            }
