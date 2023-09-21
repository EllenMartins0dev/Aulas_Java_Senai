/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package restaurante;

import classes.ItemPedido;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class CadastroItemPedido2 extends javax.swing.JFrame {

    private JSONArray itemPedidoBancoDeDados = new JSONArray();
    private String caminhoDoArquivo = System.getProperty("user.dir") +
           "/src/arquivos/ItensDoPedido.json";
    private List<ItemPedido> itemPedidos = new ArrayList<>();
    private DefaultTableModel tabelaItemPedido;
    private String acao = "calcular";

    public CadastroItemPedido2() {
        initComponents();
        
     this.tabelaItemPedido = (DefaultTableModel) jTableInformaçãoPedido.getModel();
  jTableInformaçãoPedido.setRowHeight(30);
    }

   
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldProduto = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        jComboBoxQuantidade = new javax.swing.JComboBox<>();
        jToggleButtonConfirmar = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jTextFieldTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableInformaçãoPedido = new javax.swing.JTable();
        jComboBoxProduto = new javax.swing.JComboBox<>();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Produto", "Qtd.", "Total", "Data"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("DejaVu Serif", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Produto:");

        jLabel3.setFont(new java.awt.Font("DejaVu Serif", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Valor:");

        jLabel4.setFont(new java.awt.Font("DejaVu Serif", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Quantidade:");

        jTextFieldValor.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldValor.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorActionPerformed(evt);
            }
        });

        jComboBoxQuantidade.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxQuantidade.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBoxQuantidade.setForeground(new java.awt.Color(102, 102, 102));
        jComboBoxQuantidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBoxQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxQuantidadeActionPerformed(evt);
            }
        });

        jToggleButtonConfirmar.setBackground(new java.awt.Color(0, 0, 102));
        jToggleButtonConfirmar.setFont(new java.awt.Font("DejaVu Serif", 3, 12)); // NOI18N
        jToggleButtonConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButtonConfirmar.setText("Confirmar Pedido");
        jToggleButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonConfirmarActionPerformed(evt);
            }
        });

        jToggleButton2.setBackground(new java.awt.Color(204, 0, 0));
        jToggleButton2.setFont(new java.awt.Font("DejaVu Serif", 3, 12)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton2.setText("Limpar Pedido");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jTextFieldTotal.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("DejaVu Serif", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Total:");

        jTableInformaçãoPedido.setBackground(new java.awt.Color(255, 255, 255));
        jTableInformaçãoPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Valor", "Qtde.", "Status", "Total"
            }
        ));
        jScrollPane3.setViewportView(jTableInformaçãoPedido);

        jComboBoxProduto.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxProduto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBoxProduto.setForeground(new java.awt.Color(102, 102, 102));
        jComboBoxProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Refrigerante em lata", "Garrafa refrigerante (600ml)", "Garrafa refrigerante (1L)", "Garrafa refrigerante (2L)", "Suco (500ml)", "Suco (1L)", "Água", "Lata de cerveja", "Marmita pequena tradicional", "Marmita média tradicional", "Marmita grande tradicional", "Marmita pequena vegetariana", "Marmita média vegetariana", "Marmita grande vegetariana", "Marmita pequena vegana", "Marmita média vegana", "Marmita grande vegana", "Marmita pequena churrasco", "Marmita média churrasco", "Marmita grande churrasco", " ", " ", " " }));
        jComboBoxProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProdutoActionPerformed(evt);
            }
        });

        jTextFieldPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPesquisar.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldPesquisar.setText("Pesquisar...");
        jTextFieldPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldPesquisarMouseClicked(evt);
            }
        });
        jTextFieldPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisarActionPerformed(evt);
            }
        });
        jTextFieldPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPesquisarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jToggleButtonConfirmar)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton2))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 441, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        jLabel1.setFont(new java.awt.Font("DejaVu Serif", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Itens do Pedido");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisaritemPedidos(String produto) {
          List <ItemPedido> itemPedidosFiltrados = new ArrayList<>();
        
        for (int i = 0; i < itemPedidos.size(); i++) {
            
            ItemPedido itemPedidoLinha = itemPedidos.get(i);
            
            if (itemPedidoLinha.getProduto().toLowerCase().contains(produto)) {
                itemPedidosFiltrados.add(itemPedidoLinha);
            }
        }
        
        limparTabela();
        System.out.println("Filtro" + itemPedidosFiltrados);
        mostrarItensNaTabela(itemPedidosFiltrados);
    }

    public JSONObject criarObjeto(ItemPedido itemPedido){
        JSONObject item = new JSONObject();
     item.put("produto", itemPedido.getProduto());
     item.put("valor", itemPedido.getValor());
     item.put("quantidade", itemPedido.getQuantidade());
     item.put("total", itemPedido.getTotal());
     item.put("status", itemPedido.getStatus());
     item.put("descricao", itemPedido.getDescricao());
     item.put("id", itemPedido.getId());
        
        return item;
    }
    
    
    public void lerArquivoDeClientes() throws org.json.simple.parser.ParseException{
        //verificar se o arquivo existe
        File file = new File (this.caminhoDoArquivo);
        
        if (file.exists()) {
            //ler o arquivo
            JSONParser conversor = new JSONParser();
            FileReader leitor = null;
            
            
            try {
                leitor = new FileReader(this.caminhoDoArquivo);
                JSONArray conteudo = (JSONArray) conversor.parse(leitor);
                
                for (int i = 0; i < conteudo.size(); i++) {
                    JSONObject itemArray = (JSONObject) conteudo.get(i);
                    
                    String produto = (String) itemArray.get("produto");
                    String valor = (String) itemArray.get("valor");
                    String quantidade = (String) itemArray.get("quantidade");
                    String total = (String) itemArray.get("total");
                    String status = (String) itemArray.get("status");
                    String descricao = (String) itemArray.get("descricao");
                    String id = (String) itemArray.get("id");
                    
                    ItemPedido itemPedido = new ItemPedido(i, acao, ERROR, WIDTH, NORMAL, produto, total);
                    // JSONObject item = this.criarObjeto(itemPedido);
                    
                    // adicionar as informações na variável  JSONArray
                  //  this.itemPedidoBancoDeDados.add(item);
                    
                    // adicionar dados na tabela
                    Object[] itemPedidoVetor = {
                       itemPedido.getProduto(), itemPedido.getValor(), itemPedido.getQuantidade(), itemPedido.getDescricao(), itemPedido.getId(), itemPedido.getTotal(), itemPedido.getStatus()
                    };
                    
                }
            } catch (IOException e) {
            } finally {
                try {
                    if (leitor != null)
                        leitor.close(); {
                        
                    }
                } catch (IOException e) {
                }
            }
        } else {
                  System.out.println("Arquivo não existe");  }
    }
   
    
    public void lerArquivo() {
        // verificar se o arquivo existe
        // ler o arquivo
        // adicionar as informações na tabela
        // adicionar as informações na variável JSON Array
      String caminho = System.getProperty("user.dir") + 
                "/src/arquivos/ClientesPedidos.json";
    }
    
    
      public void escreverArquivo(ItemPedido itemPedido) {
        String caminho = System.getProperty("user.dir") +
           "/src/arquivos/ItensDoPedido.json";
        JSONArray arquivo = new JSONArray();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(caminho);
            String conteudoSalvar = arquivo.toJSONString();
            fileWriter.write(conteudoSalvar);
        } catch (IOException e) {
            System.out.println("Erro ao escrever arquivo");
            System.err.println(e.getMessage());
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.out.println("Erro o fechar o arquivo");
                System.err.println(e.getMessage());
            }
        }
    } 
      
          private void mostrarItensNaTabela (List<ItemPedido> itemPedidos) {
        for (int i = 0; i < itemPedidos.size(); i++) {

            ItemPedido itemPedidoLinha = itemPedidos.get(i);

            Object[] itemPedidoVetor = {
               itemPedidoLinha.getProduto(),
               itemPedidoLinha.getValor(),
               itemPedidoLinha.getQuantidade(),
               itemPedidoLinha.getTotal(),
               itemPedidoLinha.getDescricao(),
               itemPedidoLinha.getId(),
               itemPedidoLinha.getStatus(),
        };
            

            tabelaItemPedido.addRow(itemPedidoVetor);
        }
    }
     
     private void limparTabela() {
        while (tabelaItemPedido.getRowCount() > 0) {
           tabelaItemPedido.removeRow(0);
        }
    }
    
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextFieldPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarKeyPressed
        // TODO add your handling code here:
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String produto = jComboBoxProduto.getSelectedItem().toString();
            
            if (produto.isEmpty()) {
                limparTabela();
                mostrarItensNaTabela(itemPedidos);
            } else {
               // pesquisaritemPedidos(produto);
            }
        }
    }//GEN-LAST:event_jTextFieldPesquisarKeyPressed

    private void jTextFieldPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisarActionPerformed

    private void jTextFieldPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarMouseClicked
        // TODO add your handling code here:
        jTextFieldPesquisar.setText("");
    }//GEN-LAST:event_jTextFieldPesquisarMouseClicked

    private void jComboBoxProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProdutoActionPerformed
        // TODO add your handling code here:
        String TipoProduto = jComboBoxProduto.getModel().getSelectedItem().toString();

        if (TipoProduto == "Refrigerante em lata") {
            jTextFieldValor.setText("05.00");
        }
        if (TipoProduto == "Garrafa refrigerante (600ml)") {
            jTextFieldValor.setText("07.50");
        }
        if (TipoProduto == "Garrafa refrigerante (1L)") {
            jTextFieldValor.setText("10.00");
        }
        if (TipoProduto == "Garrafa refrigerante (2L)") {
            jTextFieldValor.setText("14.00");
        }
        if (TipoProduto == "Suco (500ml)") {
            jTextFieldValor.setText("06.00");
        }
        if (TipoProduto == "Suco (1L)") {
            jTextFieldValor.setText("10.00");
        }
        if (TipoProduto == "Água") {
            jTextFieldValor.setText("05.00");
        }
        if (TipoProduto == "Lata de cerveja") {
            jTextFieldValor.setText("05.59");
        }
        if (TipoProduto == "Marmita pequena tradicional") {
            jTextFieldValor.setText("15.50");
        }
        if (TipoProduto == "Marmita média tradicional") {
            jTextFieldValor.setText("24.90");
        }
        if (TipoProduto == "Marmita grande tradicional") {
            jTextFieldValor.setText("29.99");
        }
        if (TipoProduto == "Marmita pequena vegetariana") {
            jTextFieldValor.setText("16.50");
        }
        if (TipoProduto == "Marmita média vegetariana") {
            jTextFieldValor.setText("25.90");
        }
        if (TipoProduto == "Marmita grande vegetariana") {
            jTextFieldValor.setText("31.00");
        }
        if (TipoProduto == "Marmita pequena vegana") {
            jTextFieldValor.setText("17.50");
        }
        if (TipoProduto == "Marmita média vegana") {
            jTextFieldValor.setText("26.90");
        }
        if (TipoProduto == "Marmita grande vegana") {
            jTextFieldValor.setText("32.00");
        }
        if (TipoProduto == "Marmita pequena churrasco") {
            jTextFieldValor.setText("18.50");
        }
        if (TipoProduto == "Marmita média churrasco") {
            jTextFieldValor.setText("28.90");
        }
        if (TipoProduto == "Marmita grande churrasco") {
            jTextFieldValor.setText("34.00");
        }

    }//GEN-LAST:event_jComboBoxProdutoActionPerformed

    private void jTextFieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalActionPerformed
        // TODO add your handling code here:
        double valor = Double.parseDouble(jTextFieldValor.getText());
        int quantidade = Integer.parseInt(jComboBoxQuantidade.getSelectedItem().toString());

        double total = valor * quantidade;

        jTextFieldTotal.setText(String.valueOf(total));
    }//GEN-LAST:event_jTextFieldTotalActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        this.acao = "limpar";
        jTextFieldValor.setText("");
        jTextFieldTotal.setText("");

        jComboBoxQuantidade.setSelectedIndex(0);
        jComboBoxProduto.setSelectedIndex(0);

    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonConfirmarActionPerformed
        // TODO add your handling code here:

        String produto = jComboBoxProduto.getSelectedItem().toString();
        double valor = Double.parseDouble(jTextFieldValor.getText());
        int quantidade = Integer.parseInt(jComboBoxQuantidade.getSelectedItem().toString());
        String status = "Em andamento";

        double total = valor * quantidade;

        jTextFieldTotal.setText(String.valueOf(total));

        ItemPedido itemPedido = new ItemPedido(WIDTH, status, valor, quantidade, total, produto, status);
        itemPedidos.add(itemPedido);

        adicionarItensPedidosNaTabela();

        Date date = new Date();
        long id = date.getTime();
        JOptionPane.showMessageDialog(rootPane, "Seu pedido foi reazliado com sucesso. \n" + "Id do pedido" + id);
        
        Object[] itemPedidoVetor = {
            itemPedido.getProduto(), itemPedido.getDescricao(), itemPedido.getId(), itemPedido.getQuantidade(), itemPedido.getStatus(), itemPedido.getTotal(), itemPedido.getValor()
        };
        
        this.tabelaItemPedido.addRow(itemPedidoVetor);
        
  
        
         // cria  itens e adiciona no JSON Array
         JSONObject item = this.criarObjeto(itemPedido);
    
       
       this.itemPedidoBancoDeDados.add(item);
        itemPedido.add(itemPedido);
       adicionarItensPedidosNaTabela();
    }//GEN-LAST:event_jToggleButtonConfirmarActionPerformed

    private void jComboBoxQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxQuantidadeActionPerformed

        if (this.acao != "limpar") {
            double valor = Double.parseDouble(jTextFieldValor.getText());
            int quantidade = Integer.parseInt(jComboBoxQuantidade.getSelectedItem().toString());

            double total = valor * quantidade;

            jTextFieldTotal.setText(String.valueOf(total));
        }
        this.acao = "calcular";
        
        FileWriter fileWriter = null;
        
             
        try {
            System.out.println("CLIENTES: " + this.itemPedidoBancoDeDados);
            fileWriter = new FileWriter(this.caminhoDoArquivo);
            String conteudoSalvar = itemPedidoBancoDeDados.toJSONString();
            fileWriter.write(conteudoSalvar);
        } catch (IOException e) {
            System.out.println("Erro ao escrever arquivo");
            System.err.println(e.getMessage());
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (Exception e) {
            }
        }
        
        //fechar o formulário
    }//GEN-LAST:event_jComboBoxQuantidadeActionPerformed

    private void jTextFieldValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroItemPedido2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroItemPedido2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroItemPedido2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroItemPedido2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroItemPedido2().setVisible(true);
            }
        });
    }

    private void adicionarItensPedidosNaTabela() {
        tabelaItemPedido = (DefaultTableModel) jTableInformaçãoPedido.getModel();

        limparTabela();

        mostrarItensNaTabela(itemPedidos);
    }

  

    private void pesquisaritemPedidos(long id) {

        List<ItemPedido> itemPedidosFiltrados = new ArrayList<>();

        for (int i = 0; i < itemPedidos.size(); i++) {

            ItemPedido pedidoLinha = itemPedidos.get(i);

            if (pedidoLinha.getId() == id) {
                itemPedidosFiltrados.add(pedidoLinha);
            }
        }

        limparTabela();
        System.out.println("Filtro: " + itemPedidosFiltrados);
        mostrarItensNaTabela(itemPedidosFiltrados);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxProduto;
    private javax.swing.JComboBox<String> jComboBoxQuantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTableInformaçãoPedido;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldProduto;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTextField jTextFieldValor;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButtonConfirmar;
    // End of variables declaration//GEN-END:variables
}
