package restaurante;

import classes.Pedido;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.plaf.metal.MetalBorders;
import javax.swing.table.DefaultTableModel;
import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;
import net.sourceforge.barbecue.output.OutputException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Aluno
 */
public class InformacaoPedido extends javax.swing.JFrame {

    private Pedido pedido;
    private JSONArray pedidosBancoDeDados = new JSONArray();
    private String caminhoDoArquivo = System.getProperty("user.dir")
            + "/src/arquivos/Pedidos.json";

    private List<Pedido> pedidos = new ArrayList<>();
    private DefaultTableModel tabelaDePedido;

    /**
     * Creates new form restaurante
     */
    public InformacaoPedido() {
        initComponents();
        pedido = new Pedido();
        long id = System.currentTimeMillis();
        jTextFieldId.setText(String.valueOf(id));
        pedido.setId(id);
        
        this.exibirDataAtual();
        

        this.tabelaDePedido = (DefaultTableModel) jTablePedido.getModel();
        jTablePedido.setRowHeight(30);

    }

    public void exibirDataAtual() {
        Date agora = new Date();
        pedido.setData(agora);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.format(agora);
        try {
            String dataAtual = sdf.format(agora);
            jTextFieldData.setText(dataAtual);
            System.out.println("DATA " + dataAtual);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void exibirImagem(String caminho) {
        File arquivo = new File(caminho);

        try {
            BufferedImage bi = ImageIO.read(arquivo);
            ImageIcon image = new ImageIcon(bi);
            jLabelImagem.setIcon(image);
        } catch (IOException e) {
            System.out.println("Erro ao exibir código");
            System.err.println(e.getMessage());
        } finally {
        }
    }

    public void lerArquivoDoPedido() throws org.json.simple.parser.ParseException {
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

                    long id = (Long) itemArray.get("id");
                    double total = (Double) itemArray.get("total");
                    Date data = (Date) itemArray.get("data");

                    JSONObject item = this.criarObjeto(pedido);

                    // adicionar as informações na variável  JSONArray
                    this.pedidosBancoDeDados.add(item);

                    // adicionar dados na tabela
                    Object[] pedidoVetor = {
                        pedido.getId(), pedido.getTotal(), pedido.getData()
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
    
     public JSONObject criarObjeto(Pedido pedido) {
        JSONObject item = new JSONObject();
        item.put("id", pedido.getId());
        item.put("total", pedido.getTotal());
        item.put("data", pedido.getData());

        return item;
    }

    public void escreverArquivo(Pedido pedido) {
        String caminho = System.getProperty("user.dir")
                + "/src/arquivos/Pedidos.json";
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
   public void lerArquivo() {
        // verificar se o arquivo existe
        // ler o arquivo
        // adicionar as informações na tabela
        // adicionar as informações na variável JSON Array
        String caminho = System.getProperty("user.dir")
                + "/src/arquivos/Pedidos.json";
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JSeparator();
        jRadioButton1 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jButtonConfirmar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePedido = new javax.swing.JTable();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelImagem = new javax.swing.JLabel();
        jLabelCodigo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldData = new javax.swing.JTextField();
        jButtonAdicionarItens = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        jMenu1.setText("jMenu1");

        jRadioButton1.setText("jRadioButton1");

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("DejaVu Serif", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Id:");

        jTextFieldId.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldId.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });

        jButtonConfirmar.setBackground(new java.awt.Color(0, 0, 102));
        jButtonConfirmar.setFont(new java.awt.Font("DejaVu Serif", 3, 14)); // NOI18N
        jButtonConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("DejaVu Serif", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Total:");

        jTextFieldTotal.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTotal.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalActionPerformed(evt);
            }
        });

        jTablePedido.setBackground(new java.awt.Color(255, 255, 255));
        jTablePedido.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTablePedido.setForeground(new java.awt.Color(0, 0, 0));
        jTablePedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Data", "Total"
            }
        ));
        jTablePedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePedidoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePedido);

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

        jLabel3.setFont(new java.awt.Font("DejaVu Serif", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Código de Barras do pedido");

        jLabel5.setFont(new java.awt.Font("DejaVu Serif", 2, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Código do pedido");

        jLabel6.setFont(new java.awt.Font("DejaVu Serif", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Data:");

        jTextFieldData.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldData.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataActionPerformed(evt);
            }
        });

        jButtonAdicionarItens.setBackground(new java.awt.Color(0, 0, 102));
        jButtonAdicionarItens.setFont(new java.awt.Font("DejaVu Serif", 3, 14)); // NOI18N
        jButtonAdicionarItens.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAdicionarItens.setText("Adicionar Itens");
        jButtonAdicionarItens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarItensActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonConfirmar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonAdicionarItens)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonFechar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                            .addComponent(jTextFieldPesquisar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmar)
                    .addComponent(jButtonAdicionarItens)
                    .addComponent(jButtonFechar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("DejaVu Serif", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pedido");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(253, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(251, 251, 251))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        // TODO add your handling code here:
        pedido.setTotal(Double.parseDouble(jTextFieldTotal.getText()));
        Long id = Long.valueOf(jTextFieldId.getText());
        Date agora = new Date();
        String agoraS = agora.toString();
        jTextFieldData.setText(agoraS);
        Double total = Double.parseDouble(jTextFieldTotal.getText());
        String mensagem = "Seu pedido foi efetuado com sucesso!!";
        JOptionPane.showMessageDialog(null, mensagem);
        
        String identificador = String.valueOf(System.currentTimeMillis());
        jLabelCodigo.setText(identificador);
        String nomeDaImagem = identificador + ".png";
        Barcode codigoBarras = null;

           Object[] pedidoVetor = {
            pedido.getId(), pedido.getTotal(), pedido.getData()
        };

        this.tabelaDePedido.addRow(pedidoVetor);

        // cria  itens e adiciona no JSON Array
        JSONObject item = this.criarObjeto(pedido);

        this.pedidosBancoDeDados.add(item);
        pedidos.add(pedido);
        adicionarPedidoNaTabela();
        String caminho = System.getProperty("user.dir")
                + "/src/Bibliotecas/CodigoBarras/" + nomeDaImagem;

        try {
            codigoBarras = BarcodeFactory.createCode128(identificador);
            File imagem = new File(caminho);
            BarcodeImageHandler.savePNG(codigoBarras, imagem);
            this.exibirImagem(caminho);
        } catch (BarcodeException | OutputException e) {
            System.out.println("Erro ao gerar código de barras");
            System.err.println(e.getMessage());
        } finally {
        }
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    public InformacaoPedido(DefaultTableModel tabelaDePedido, JButton jButtonConfirmar, JCheckBox jCheckBox1, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JLabel jLabel4, JMenu jMenu1, JPanel jPanel1, JPanel jPanel2, JRadioButton jRadioButton1, JScrollPane jScrollPane1, JSeparator jSeparator1, JTable jTablePedido, JTextField jTextFieldData, JTextField jTextFieldId, JTextField jTextFieldPesquisar, JTextField jTextFieldTotal) throws HeadlessException {
        this.tabelaDePedido = tabelaDePedido;
        this.jButtonConfirmar = jButtonConfirmar;
        this.jCheckBox1 = jCheckBox1;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jLabel4 = jLabel4;
        this.jMenu1 = jMenu1;
        this.jPanel1 = jPanel1;
        this.jPanel2 = jPanel2;
        this.jRadioButton1 = jRadioButton1;
        this.jScrollPane1 = jScrollPane1;
        this.jSeparator1 = jSeparator1;
        this.jTablePedido = jTablePedido;
        this.jTextFieldData = jTextFieldData;
        this.jTextFieldId = jTextFieldId;
        this.jTextFieldPesquisar = jTextFieldPesquisar;
        this.jTextFieldTotal = jTextFieldTotal;
    }

    private void jTextFieldPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String nome = jTextFieldPesquisar.getText().toLowerCase();

            if (nome.isEmpty()) {
                limparTabela();
                mostrarPedidoNaTabela(pedidos);
            } else {
                pesquisarPedido(WIDTH);
            }
        }
    }//GEN-LAST:event_jTextFieldPesquisarKeyPressed

    private void jTablePedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePedidoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTablePedidoMouseClicked

    private void jTextFieldPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarMouseClicked
        // TODO add your handling code here:
        jTextFieldPesquisar.setText("");
    }//GEN-LAST:event_jTextFieldPesquisarMouseClicked

    private void jTextFieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTotalActionPerformed

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        // TODO add your handling code here:
        Date date = new Date();
        long id = date.getTime();


    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void jTextFieldDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDataActionPerformed

    private void jTextFieldPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextFieldPesquisarActionPerformed

    private void jButtonAdicionarItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarItensActionPerformed
        FileWriter fileWriter = null;

        try {
            System.out.println("CLIENTES: " + this.pedidosBancoDeDados);
            fileWriter = new FileWriter(this.caminhoDoArquivo);
            String conteudoSalvar = pedidosBancoDeDados.toJSONString();
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
            }        // TODO add your handling code here:
        }
         dispose();
    }//GEN-LAST:event_jButtonAdicionarItensActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        // TODO add your handling code here:
        System.exit(0);

     
    }//GEN-LAST:event_jButtonFecharActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacaoPedido().setVisible(true);
            }
        });
    }

    private void adicionarPedidoNaTabela() {
        tabelaDePedido = (DefaultTableModel) jTablePedido.getModel();

        limparTabela();

        mostrarPedidoNaTabela(pedidos);
    }

    private void limparTabela() {
        while (tabelaDePedido.getRowCount() > 0) {
            tabelaDePedido.removeRow(0);
        }
    }

    private void mostrarPedidoNaTabela(List<Pedido> pedidos) {
        for (int i = 0; i < pedidos.size(); i++) {

            Pedido pedidoLinha = pedidos.get(i);

            Object[] pedidoVetor = {
                pedidoLinha.getId(),
                pedidoLinha.getData(),
                pedidoLinha.getTotal(),};

            tabelaDePedido.addRow(pedidoVetor);
        }
    }

    private void pesquisarPedido(long id) {

        List<Pedido> pedidosFiltrados = new ArrayList<>();

        for (int i = 0; i < pedidos.size(); i++) {

            Pedido pedidoLinha = pedidos.get(i);

            if (pedidoLinha.getId() == id) {
                pedidosFiltrados.add(pedidoLinha);
            }
        }

        limparTabela();
        System.out.println("Filtro: " + pedidosFiltrados);
        mostrarPedidoNaTabela(pedidosFiltrados);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarItens;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelImagem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTablePedido;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables
}
