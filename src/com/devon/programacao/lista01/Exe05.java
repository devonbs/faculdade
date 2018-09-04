package com.devon.programacao.lista01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Marcel
 */
public class Exe05 extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 8965435175945787628L;
	private ArrayList<Forma> formas;
    private final Path pathArq= Paths.get("formas.dat");
    /**
     * Creates new form Exe5
     */
    public Exe05() {
        initComponents();
        formas = PersistenciaFormas.carregarFormas(pathArq);
        jTextArea1.setText("Formas carregadas:\n");
        for (Forma f: formas){
            jTextArea1.append(f.toString()+"\n");
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista 1 - Exerc�cio 5");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Circulo");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Ret�ngulo");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Tri�ngulo");

        jButton1.setText("Criar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3))
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2))
                        .addGap(45, 45, 45)
                        .addComponent(jButton1)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Forma f;
        if (jRadioButton1.isSelected()){
            f = new Circulo(Integer.parseInt(jTextField1.getText()));
        }
        else {
            if (jRadioButton2.isSelected()){
                f = new Retangulo(Integer.parseInt(jTextField1.getText()),
                                  Integer.parseInt(jTextField2.getText()));
            }
            else{
                f = new Triangulo(Integer.parseInt(jTextField1.getText()),
                                  Integer.parseInt(jTextField2.getText()),
                                  Integer.parseInt(jTextField3.getText()));
                
            }
        }
        formas.add(f);
        jTextArea1.append(f.toString()+"\n");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        PersistenciaFormas.salvarFormas(formas, pathArq);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Exe05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exe05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exe05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exe05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exe05().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}

/*
    N�o � uma boa pr�tica de programa��o colocar todas as classes
    em um mesmo arquivo .java.
    Foi feito desta maneira para:
        1) demonstrar que � poss�vel
        2) facilitar a publica��o da solu��o no AVA
*/

class PersistenciaFormas{
    public static ArrayList<Forma> carregarFormas(Path path){
        ArrayList<Forma> formas;
        try {
            ObjectInputStream file = new ObjectInputStream(new FileInputStream(path.toFile()));
            // l� o objeto de ArrayList, trazendo todo seu cont�udo
            formas = (ArrayList<Forma>)file.readObject();
            file.close();
        } catch (FileNotFoundException fnfe){
            Logger.getLogger(Exe05.class.getName()).log(Level.WARNING, "N�o encontrou. Deve ser a primeira execu��o. Logo ser� criado.");
            formas = new ArrayList();
        } catch (IOException ioe){
            Logger.getLogger(Exe05.class.getName()).log(Level.SEVERE, null, ioe);
            formas = new ArrayList();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Exe05.class.getName()).log(Level.SEVERE, null, ex);
            formas = new ArrayList();
        }
        return formas;
    }
    
    public static void salvarFormas(ArrayList<Forma> formas, Path path){
        try {
            ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream(path.toFile()));
            // grava um �nico objeto: o ArrayList, que agrega todos os objetos criados
            file.writeObject(formas);
            file.close();
        } catch (IOException ex) {
            Logger.getLogger(Exe05.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
}

//=======================
abstract class Forma implements Serializable{
    
}

//========================
class Circulo extends Forma{
    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }
    
    public String toString(){
        return "C�rculo de raio "+this.raio;
    }
    
}

//========================
class Retangulo extends Forma{
    private int lado, altura;

    public Retangulo(int lado, int altura) {
        this.lado = lado;
        this.altura = altura;
    }
    public String toString(){
        return "Ret�ngulo de lado "+this.lado +" e altura "+this.altura;
    }
    
}

//========================
class Triangulo extends Forma {
    private int lado1, lado2, lado3;

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public String toString(){
        return "Tri�ngulo de lados "+this.lado1+", "+this.lado2+", "+this.lado3;
    }
    
}