package software.cadastropecas;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import java.util.*;

/**
 *
 * @author Vinicius Schreiner
 */

public class Frame1 extends javax.swing.JFrame {

    ArrayList <PecaRecorrente> listapecas;
    TreeSet<PecaRecorrente> treepecas;
    
    //Organizando o cabecalho da lista e criando as variaveis de linahe coluna
    String header[] = new String[]{"Nome", "Código", "Quandidade", "Valor", "Vida útil", "Data da troca"};
    DefaultTableModel dtm;
    int lin, col;
    
    public Frame1() {
        initComponents();
        listapecas = new ArrayList<>();
        Comparator<PecaRecorrente> nomeComparator = Comparator.comparing(PecaRecorrente::getNome);
        TreeSet<PecaRecorrente> treepecas = new TreeSet<>(nomeComparator);
        dtm = new DefaultTableModel(header,0);
        jTable1.setModel(dtm);
        // Adiciona algumas peças de teste
        listapecas.add (new PecaRecorrente("Biela", 002, 35, Float.parseFloat("99.5"), 0, "Sem Data"));
        listapecas.add (new PecaRecorrente("Filtro de Pólen", 004, 12, Float.parseFloat("49.9"), 365, "14/02/2022"));
        listapecas.add (new PecaRecorrente("Pistão", 001, 24, Float.parseFloat("125"), 0, "Sem Data"));
        listapecas.add (new PecaRecorrente("Rebimboca da Parafuseta", 005, 777, Float.parseFloat("615"), 0, "Sem Data"));
        listapecas.add (new PecaRecorrente("Virabrequim", 003, 4, Float.parseFloat("998"), 0, "Sem Data"));
        // Printa as peças de teste
        for (int i= 0; i < listapecas.size(); i++){
                    Object[] objs = {listapecas.get(i).nome, listapecas.get(i).codigo, listapecas.get(i).quantidade, listapecas.get(i).valor, listapecas.get(i).tempoTroca, listapecas.get(i).data};
                    dtm.addRow(objs);
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

        cadastroLabel = new javax.swing.JLabel();
        tituloLabel = new javax.swing.JLabel();
        panelData = new javax.swing.JPanel();
        nomeLabel = new javax.swing.JLabel();
        nomeInput = new javax.swing.JTextField();
        codigoLabel = new javax.swing.JLabel();
        codigoInput = new javax.swing.JTextField();
        quantidadeLabel = new javax.swing.JLabel();
        quantidadeInput = new javax.swing.JTextField();
        valorLabel = new javax.swing.JLabel();
        valorInput = new javax.swing.JTextField();
        tempoLabel = new javax.swing.JLabel();
        tempoInput = new javax.swing.JTextField();
        dataLabel = new javax.swing.JLabel();
        dataInput = new javax.swing.JTextField();
        panelButtons = new javax.swing.JPanel();
        adicionarButton = new javax.swing.JButton();
        buscarButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        atualizarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cadastroLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cadastroLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cadastroLabel.setText("Cadastro de Peças");

        tituloLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tituloLabel.setText("Menu Principal");

        nomeLabel.setText("Nome:");

        codigoLabel.setText("Código:");

        quantidadeLabel.setText("Quantidade:");

        valorLabel.setText("Valor:");

        valorInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorInputActionPerformed(evt);
            }
        });

        tempoLabel.setText("Vida útil (dias):");

        dataLabel.setText("Data de Troca:");

        javax.swing.GroupLayout panelDataLayout = new javax.swing.GroupLayout(panelData);
        panelData.setLayout(panelDataLayout);
        panelDataLayout.setHorizontalGroup(
            panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataLabel)
                    .addComponent(tempoLabel)
                    .addComponent(valorLabel)
                    .addComponent(codigoLabel)
                    .addComponent(nomeLabel)
                    .addComponent(quantidadeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataInput)
                    .addComponent(valorInput)
                    .addComponent(tempoInput)
                    .addComponent(nomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoInput)
                    .addComponent(quantidadeInput))
                .addContainerGap())
        );
        panelDataLayout.setVerticalGroup(
            panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(nomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoLabel)
                    .addComponent(codigoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantidadeLabel)
                    .addComponent(quantidadeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorLabel)
                    .addComponent(valorInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempoLabel)
                    .addComponent(tempoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataLabel)
                    .addComponent(dataInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        adicionarButton.setText("Adicionar Peça");
        adicionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarButtonActionPerformed(evt);
            }
        });

        buscarButton.setText("Buscar Peça");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        removerButton.setText("Remover Peça");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerButtonActionPerformed(evt);
            }
        });

        atualizarButton.setText("Atualizar Peça");
        atualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButtonsLayout = new javax.swing.GroupLayout(panelButtons);
        panelButtons.setLayout(panelButtonsLayout);
        panelButtonsLayout.setHorizontalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buscarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adicionarButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(atualizarButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelButtonsLayout.setVerticalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adicionarButton)
                .addGap(8, 8, 8)
                .addComponent(buscarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atualizarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removerButton)
                .addContainerGap())
        );

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Código", "Quantidade", "Valor", "Vida útil", "Data da Troca"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cadastroLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panelData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(tituloLabel)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelButtons, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cadastroLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tituloLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void limpaInputs(){
        // Funcao que limpa os campos imput
        nomeInput.setText("");
        codigoInput.setText("");
        quantidadeInput.setText("");
        valorInput.setText("");
        tempoInput.setText("");
        dataInput.setText("");
    }
    
    private void valorInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorInputActionPerformed
  
    private String excecaoVazio(String campo) throws ExcecaoPecas{
        // Metodo da excecao para campos vazios
        if (campo.equals("")){
            throw new ExcecaoPecas("O campo Input está vaziu!");
        }
        return campo;
    }
    private String excecaoNaoClicado() throws ExcecaoPecas{
        // Metodo da excecao de deletar um item nao selecionado
        if (lin <= 0){
            throw new ExcecaoPecas("Exceção: Você tentou excluir um produto inexistente!");
        }
        return "Erro";
    }
    
    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // Callback de clique na tabela responsável por preencher automaticamente os campos quando clicado um objeto
        // Recebe a linha e coluna via callback da tabela da linha clicada com o mouse
        lin = jTable1.getSelectedRow();
        col = jTable1.getColumnCount();
        // Seta os campos de input de acordo com a linha clicada
        nomeInput.setText(dtm.getValueAt(lin, 0).toString());
        codigoInput.setText(dtm.getValueAt(lin, 1).toString());
        quantidadeInput.setText(dtm.getValueAt(lin, 2).toString());
        valorInput.setText(dtm.getValueAt(lin, 3).toString());
        tempoInput.setText(dtm.getValueAt(lin, 4).toString());
        dataInput.setText(dtm.getValueAt(lin, 5).toString());   
    }//GEN-LAST:event_jTable1MouseClicked

    private void atualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarButtonActionPerformed
        // Acao do botao atualizar
        // Pega os dados atualizados do campo input
        String newnome = nomeInput.getText();
        Integer newcodigo = Integer.parseInt(codigoInput.getText());
        Integer newquantidade = Integer.parseInt(quantidadeInput.getText());
        Float newvalor = Float.parseFloat(valorInput.getText());
        Integer newtempoTroca = Integer.parseInt(tempoInput.getText());
        String newdata = dataInput.getText();
        // Atualiza os dados na lista
        listapecas.get(lin).nome = newnome;
        listapecas.get(lin).codigo = newcodigo;
        listapecas.get(lin).quantidade = newquantidade;
        listapecas.get(lin).valor = newvalor;
        listapecas.get(lin).tempoTroca = newtempoTroca;
        listapecas.get(lin).data = newdata;
        dtm.setRowCount(0);
        // Printa a lista na table
        for (int i= 0; i < listapecas.size(); i++){
            Object[] objs = {listapecas.get(i).nome, listapecas.get(i).codigo, listapecas.get(i).quantidade, listapecas.get(i).valor, listapecas.get(i).tempoTroca, listapecas.get(i).data};
            dtm.addRow(objs);
        }
        JOptionPane.showMessageDialog(atualizarButton, "Item atualizado com sucesso!", "Atualização de Item", 2);
    }//GEN-LAST:event_atualizarButtonActionPerformed

    private void removerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerButtonActionPerformed
        // Acao do botao remover
        // Mostra o popup de aviso de realmente deseja remover
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Deseja realmente remover o campo selecionado?", "Confirmação de Remoção", dialogButton);
        // Caso clicar em sim roda a rotina caso o objeto a ser deletado tenha sido selecionado corretamente, caso contrario e gerada uma excecao
        if (dialogResult == 0){
            try{
                excecaoNaoClicado();
            }catch(ExcecaoPecas ex){
                System.out.println(ex.getMessage());
            }finally{
                // remove a linha da table e tambem da lista
                dtm.removeRow(lin);
                listapecas.remove(lin);
                dtm.setRowCount(0);
                // Printa a lista na table
                for (int i= 0; i < listapecas.size(); i++){
                    Object[] objs = {listapecas.get(i).nome, listapecas.get(i).codigo, listapecas.get(i).quantidade, listapecas.get(i).valor, listapecas.get(i).tempoTroca, listapecas.get(i).data};
                    dtm.addRow(objs);
                }

            }
        }
    }//GEN-LAST:event_removerButtonActionPerformed

    private void adicionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarButtonActionPerformed
        // Acao do botao adicionar
        // Trata as condições e impede de adicionar uma peca vazia 
        if(nomeInput.getText().equals("")){
            JOptionPane.showMessageDialog(new JFrame(), "O campo Nome não pode estar vazio!");
        }
        if(codigoInput.getText().equals("")){
            JOptionPane.showMessageDialog(new JFrame(), "O campo Código não pode estar vazio!");
        }
        if(quantidadeInput.getText().equals("")){
            JOptionPane.showMessageDialog(new JFrame(), "O campo Quantidade não pode estar vazio!");
        }
        if(valorInput.getText().equals("")){
            JOptionPane.showMessageDialog(new JFrame(), "O campo Valor não pode estar vazio!");
        }else{
            //Recebe os dados dos campos input e armazena nas variaveis
            String nome = nomeInput.getText();
            Integer codigo = Integer.parseInt(codigoInput.getText());
            Integer quantidade = Integer.parseInt(quantidadeInput.getText());
            Float valor = Float.parseFloat(valorInput.getText());
            Integer tempoTroca;
            String data;

            // Tratamento dos casos da peça ser recorrente ou normal
            if(tempoInput.getText().equals("")){
                tempoTroca = 0;
            }else{
                tempoTroca = Integer.parseInt(tempoInput.getText());
            }
            if(dataInput.getText().equals("")){
                data = "Sem Data";
            }else{
                data = dataInput.getText();
            }
            // Aloca os dados na lista
            listapecas.add (new PecaRecorrente(nome, codigo, quantidade, valor, tempoTroca, data));
            //treepecas.add (listapecas.get(0));
            //listapecas.clear();
            // Printa a lista na table
            dtm.setRowCount(0);
            for (int i= 0; i < listapecas.size(); i++){
                Object[] objs = {listapecas.get(i).nome, listapecas.get(i).codigo, listapecas.get(i).quantidade, listapecas.get(i).valor, listapecas.get(i).tempoTroca, listapecas.get(i).data};
                dtm.addRow(objs);
            }
        }
        limpaInputs();
    }//GEN-LAST:event_adicionarButtonActionPerformed

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        // // Acao do botao buscar
        String input = JOptionPane.showInputDialog(this, "Procurar Peça por Nome:", "Busca por Nome", 2 );
        // Varre a lista buscando pelo nome digitado
        for (int i = 0; i < listapecas.size(); i++){
            if(listapecas.get(i).nome.equalsIgnoreCase(input)){
                // Caso encontrar o item no estoque mostra o popup positivo
                JOptionPane.showMessageDialog(buscarButton, "Item encontrado no estoque!", "Busca por Nome", 2);
                // Preenche os campos input de acordo com a peça encontrada
                nomeInput.setText(listapecas.get(i).nome);
                codigoInput.setText(String.valueOf(listapecas.get(i).codigo));
                quantidadeInput.setText(String.valueOf(listapecas.get(i).quantidade));
                valorInput.setText(String.valueOf(listapecas.get(i).valor));
                tempoInput.setText(String.valueOf(listapecas.get(i).tempoTroca));
                dataInput.setText(listapecas.get(i).data);
                return;
            }
        }
        // Caso nao encontrar o item no estoque mostra o popup negativo
        JOptionPane.showMessageDialog(buscarButton, "Item não encontrado no estoque!", "Busca por Nome", 2);
    }//GEN-LAST:event_buscarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarButton;
    private javax.swing.JButton atualizarButton;
    private javax.swing.JButton buscarButton;
    private javax.swing.JLabel cadastroLabel;
    private javax.swing.JTextField codigoInput;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField dataInput;
    private javax.swing.JLabel dataLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nomeInput;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelData;
    private javax.swing.JTextField quantidadeInput;
    private javax.swing.JLabel quantidadeLabel;
    private javax.swing.JButton removerButton;
    private javax.swing.JTextField tempoInput;
    private javax.swing.JLabel tempoLabel;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JTextField valorInput;
    private javax.swing.JLabel valorLabel;
    // End of variables declaration//GEN-END:variables
}