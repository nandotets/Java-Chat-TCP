/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import javax.swing.JOptionPane;
import javax.swing.JScrollBar;

/**
 *
 * @author Fernando
 */
public class ServerScreen extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public ServerScreen() {
        initComponents();

        areaSend.setEditable(false);
        areaReceive.setEditable(false);
        areaOnline.setEditable(false);
        areaReady.setEditable(false);

        areaSend.setLineWrap(true);
        areaReceive.setLineWrap(true);
        areaOnline.setLineWrap(true);
        areaReady.setLineWrap(true);
        
    }

    public static void setScrollMaximum() {
        JScrollBar x = paneReceive.getVerticalScrollBar();
        x.setValue(x.getMaximum());
        paneReceive.setVerticalScrollBar(x);

        x = paneSend.getVerticalScrollBar();
        x.setValue(x.getMaximum());
        paneSend.setVerticalScrollBar(x);

        x = paneOnline.getVerticalScrollBar();
        x.setValue(x.getMaximum());
        paneOnline.setVerticalScrollBar(x);

        x = paneReady.getVerticalScrollBar();
        x.setValue(x.getMaximum());
        paneReady.setVerticalScrollBar(x);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneReceive = new javax.swing.JScrollPane();
        areaReceive = new javax.swing.JTextArea();
        paneSend = new javax.swing.JScrollPane();
        areaSend = new javax.swing.JTextArea();
        paneOnline = new javax.swing.JScrollPane();
        areaOnline = new javax.swing.JTextArea();
        paneReady = new javax.swing.JScrollPane();
        areaReady = new javax.swing.JTextArea();
        SEND_MESSAGES = new javax.swing.JLabel();
        RECEIVE_MESSAGES = new javax.swing.JLabel();
        ONLINE_CLIENTS = new javax.swing.JLabel();
        READY_CLIENTS = new javax.swing.JLabel();
        COUNTDOWN = new javax.swing.JLabel();
        contador = new javax.swing.JLabel();
        paneReady1 = new javax.swing.JScrollPane();
        tenho = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(647, 497));
        setMinimumSize(new java.awt.Dimension(647, 497));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        areaReceive.setColumns(20);
        areaReceive.setRows(5);
        paneReceive.setViewportView(areaReceive);

        areaSend.setColumns(20);
        areaSend.setRows(5);
        paneSend.setViewportView(areaSend);

        areaOnline.setColumns(20);
        areaOnline.setRows(5);
        paneOnline.setViewportView(areaOnline);

        areaReady.setColumns(20);
        areaReady.setRows(5);
        paneReady.setViewportView(areaReady);

        SEND_MESSAGES.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SEND_MESSAGES.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SEND_MESSAGES.setLabelFor(areaSend);
        SEND_MESSAGES.setText("SEND MESSAGES");

        RECEIVE_MESSAGES.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RECEIVE_MESSAGES.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RECEIVE_MESSAGES.setLabelFor(areaReceive);
        RECEIVE_MESSAGES.setText("RECEIVE MESSAGES");

        ONLINE_CLIENTS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ONLINE_CLIENTS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ONLINE_CLIENTS.setLabelFor(areaOnline);
        ONLINE_CLIENTS.setText("ONLINE CLIENTS");

        READY_CLIENTS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        READY_CLIENTS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        READY_CLIENTS.setLabelFor(areaReady);
        READY_CLIENTS.setText("READY CLIENTS");

        COUNTDOWN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        COUNTDOWN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        COUNTDOWN.setLabelFor(contador);
        COUNTDOWN.setText("<html> COUNTDOWN<br> START GAME</html>");
        COUNTDOWN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        contador.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        contador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contador.setText("30");

        tenho.setColumns(20);
        tenho.setRows(5);
        paneReady1.setViewportView(tenho);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneSend)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(paneOnline, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(ONLINE_CLIENTS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(paneReady, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(READY_CLIENTS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(COUNTDOWN)
                            .addComponent(contador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addComponent(paneReceive)
                    .addComponent(RECEIVE_MESSAGES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SEND_MESSAGES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paneReady1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(SEND_MESSAGES)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneSend, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RECEIVE_MESSAGES)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneReceive, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(READY_CLIENTS, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ONLINE_CLIENTS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paneReady, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(COUNTDOWN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(contador)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(paneReady1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int confirm = JOptionPane.showConfirmDialog(null, "Confirm to close server?", "EXIT", JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            System.exit(1);
        } else {
            System.out.flush();
        }
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel COUNTDOWN;
    private javax.swing.JLabel ONLINE_CLIENTS;
    private javax.swing.JLabel READY_CLIENTS;
    private javax.swing.JLabel RECEIVE_MESSAGES;
    private javax.swing.JLabel SEND_MESSAGES;
    public static javax.swing.JTextArea areaOnline;
    public static javax.swing.JTextArea areaReady;
    public static javax.swing.JTextArea areaReceive;
    public static javax.swing.JTextArea areaSend;
    public static javax.swing.JLabel contador;
    public static javax.swing.JScrollPane paneOnline;
    public static javax.swing.JScrollPane paneReady;
    public static javax.swing.JScrollPane paneReady1;
    public static javax.swing.JScrollPane paneReceive;
    public static javax.swing.JScrollPane paneSend;
    public static javax.swing.JTextArea tenho;
    // End of variables declaration//GEN-END:variables
}