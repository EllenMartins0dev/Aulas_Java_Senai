/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package restaurante;

import classes.Cliente;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Aluno
 */
public class CadastroCliente extends javax.swing.JFrame {

    private JSONArray clientesBancoDeDados = new JSONArray();
    private String caminhoDoArquivo = System.getProperty("user.dir")
            + "/src/arquivos/ClientesPedidos.json";
    private List<Cliente> clientes = new ArrayList<>();
    private DefaultTableModel tabelaClienteForms;
    private String acao = "calcular";

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        initComponents();

        this.tabelaClienteForms = (DefaultTableModel) jTableClienteForms.getModel();
        jTableClienteForms.setRowHeight(30);

        //lerArquivoDeClientes();
    }

    public void lerArquivoDeClientes() throws org.json.simple.parser.ParseException {
        //verificar se o arquivo existe
        File file = new File(this.caminhoDoArquivo);

        if (file.exists()) {
            //ler o arquivo
            JSONParser conversor = new JSONParser();
            FileReader leitor = null;

            try {
                leitor = new FileReader(this.caminhoDoArquivo);
                JSONArray conteudo = (JSONArray) conversor.parse(leitor);

                for (int i = 0; i < conteudo.size(); i++) {
                    JSONObject itemArray = (JSONObject) conteudo.get(i);

                    String nome = (String) itemArray.get("nome");
                    String email = (String) itemArray.get("email");
                    String telefone = (String) itemArray.get("telefone");
                    String Cpf = (String) itemArray.get("cpf");

                    Cliente cliente = new Cliente(nome, telefone, email, Cpf);
                    JSONObject item = this.criarObjeto(cliente);

                    // adicionar as informações na variável  JSONArray
                    this.clientesBancoDeDados.add(item);

                    // adicionar dados na tabela
                    Object[] clienteVetor = {
                        cliente.getNome(), cliente.getEmail(), cliente.getTelefone(), cliente.getCpf()
                    };

                }
            } catch (IOException e) {
            } finally {
                try {
                    if (leitor != null) {
                        leitor.close();
                    }
                    {

                    }
                } catch (IOException e) {
                }
            }
        } else {
            System.out.println("Arquivo não existe");
        }
    }

    public void escreverArquivo(Cliente cliente) {
        String caminho = System.getProperty("user.dir")
                + "/src/arquivos/ClientesPedidos.json";
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

    public JSONObject criarObjeto(Cliente cliente) {
        JSONObject item = new JSONObject();
        item.put("nome", cliente.getNome());
        item.put("email", cliente.getEmail());
        item.put("telefone", cliente.getTelefone());
        item.put("cpf", cliente.getCpf());

        return item;
    }

    public void lerArquivo() {
        // verificar se o arquivo existe
        // ler o arquivo
        // adicionar as informações na tabela
        // adicionar as informações na variável JSON Array
        String caminho = System.getProperty("user.dir")
                + "/src/arquivos/ClientesPedidos.json";
    }

    private void pesquisarClientes(String nome) {
        List<Cliente> clientesFiltrados = new ArrayList<>();

        for (int i = 0; i < clientes.size(); i++) {

            Cliente clienteLinha = clientes.get(i);

            if (clienteLinha.getNome().toLowerCase().contains(nome)) {
                clientesFiltrados.add(clienteLinha);
            }
        }

        limparTabela();
        System.out.println("Filtro" + clientesFiltrados);
        mostrarClientesNaTabela(clientesFiltrados);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldTelefone = new javax.swing.JTextField();
        jTextFieldCpf = new javax.swing.JTextField();
        jToggleButtonConfirmar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClienteForms = new javax.swing.JTable();
        jButtonLimpar = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jTextFieldPesquisar = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("DejaVu Serif", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cadastro do Cliente");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("DejaVu Serif", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nome:");

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("DejaVu Serif", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("E-mail:");

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("DejaVu Serif", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Telefone:");

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("DejaVu Serif", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Cpf:");

        jTextFieldNome.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNome.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldEmail.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEmail.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldTelefone.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTelefone.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldCpf.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCpf.setForeground(new java.awt.Color(0, 0, 0));

        jToggleButtonConfirmar.setBackground(new java.awt.Color(0, 0, 102));
        jToggleButtonConfirmar.setFont(new java.awt.Font("DejaVu Serif", 3, 14)); // NOI18N
        jToggleButtonConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButtonConfirmar.setText("Cadastrar");
        jToggleButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonConfirmarActionPerformed(evt);
            }
        });

        jTableClienteForms.setBackground(new java.awt.Color(255, 255, 255));
        jTableClienteForms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Email", "CPF", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(jTableClienteForms);

        jButtonLimpar.setBackground(new java.awt.Color(204, 0, 0));
        jButtonLimpar.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jButtonLimpar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonFechar.setBackground(new java.awt.Color(204, 0, 0));
        jButtonFechar.setFont(new java.awt.Font("DejaVu Serif", 3, 14)); // NOI18N
        jButtonFechar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(jTextFieldNome)
                            .addComponent(jTextFieldTelefone)
                            .addComponent(jTextFieldCpf)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jToggleButtonConfirmar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonFechar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                            .addComponent(jTextFieldPesquisar))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonFechar))
                .addGap(18, 18, 18)
                .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(447, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonConfirmarActionPerformed
        String mensagem = "Seus dados foram cadastrados com sucesso.";
        JOptionPane.showMessageDialog(null, mensagem);
        String nome = jTextFieldNome.getText();
        String email = jTextFieldEmail.getText();
        String telefone = jTextFieldTelefone.getText();
        String CPF = jTextFieldCpf.getText();

        Cliente cliente = new Cliente(nome, telefone, email, CPF);

        Object[] clienteVetor = {
            cliente.getNome(), cliente.getEmail(), cliente.getTelefone(), cliente.getCpf()
        };

        this.tabelaClienteForms.addRow(clienteVetor);

        //limpar os campos
        jTextFieldNome.setText("");
        jTextFieldEmail.setText("");
        jTextFieldTelefone.setText("");
        jTextFieldCpf.setText("");

        // cria  itens e adiciona no JSON Array
        JSONObject item = this.criarObjeto(cliente);

        this.clientesBancoDeDados.add(item);
        clientes.add(cliente);
        adicionarClientesNaTabela();
    }//GEN-LAST:event_jToggleButtonConfirmarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        // TODO add your handling code here:
        jTextFieldNome.setText("");
        jTextFieldEmail.setText("");
        jTextFieldTelefone.setText("");
        jTextFieldCpf.setText("");
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        // TODO add your handling code here:
        FileWriter fileWriter = null;

        try {
            System.out.println("CLIENTES: " + this.clientesBancoDeDados);
            fileWriter = new FileWriter(this.caminhoDoArquivo);
            String conteudoSalvar = clientesBancoDeDados.toJSONString();
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
        dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jTextFieldPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarMouseClicked
        // TODO add your handling code here:
        jTextFieldPesquisar.setText("");
    }//GEN-LAST:event_jTextFieldPesquisarMouseClicked

    private void jTextFieldPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String nome = jTextFieldPesquisar.getText().toLowerCase();

            if (nome.isEmpty()) {
                limparTabela();
                mostrarClientesNaTabela(clientes);
            } else {
                pesquisarClientes(nome);
            }
        }
    }//GEN-LAST:event_jTextFieldPesquisarKeyPressed

    private void jTextFieldPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    private void mostrarClientesNaTabela(List<Cliente> clientes) {
        for (int i = 0; i < clientes.size(); i++) {

            Cliente clienteLinha = clientes.get(i);

            Object[] clientesVetor = {
                clienteLinha.getNome(),
                clienteLinha.getEmail(),
                clienteLinha.getTelefone(),
                clienteLinha.getCpf()};

            tabelaClienteForms.addRow(clientesVetor);
        }
    }

    private void adicionarClientesNaTabela() {
        tabelaClienteForms = (DefaultTableModel) jTableClienteForms.getModel();

        limparTabela();

        mostrarClientesNaTabela(clientes);
    }

    private void limparTabela() {
        while (tabelaClienteForms.getRowCount() > 0) {
            tabelaClienteForms.removeRow(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClienteForms;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JToggleButton jToggleButtonConfirmar;
    // End of variables declaration//GEN-END:variables
}
