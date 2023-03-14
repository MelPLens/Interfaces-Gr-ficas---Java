package interfaces;

public class SplashScreen extends javax.swing.JFrame {

  
    public SplashScreen() {
        initComponents();
        telalogin login= new telalogin();
    // criar metodo depois da chave
         new Thread(){ //
            public void run(){
                try{
                     for( int i=0;i<100; i++) {// barra carregar até 100%
                         Thread.sleep(100); // carregar mais lento a barra
                         jpbCarregando.setValue(i);     
                         if(jpbCarregando.getValue()<=25){
                                 LdrStatus.setText("Carregando sistema...");
                         } else if (jpbCarregando.getValue()<=50){
                                 LdrStatus.setText("Carregando banco de dados...");
                         }else if(jpbCarregando.getValue()<=75){
                                 LdrStatus.setText("Carregando tabela...");
                         }else if(jpbCarregando.getValue()<=99){
                                 LdrStatus.setText("O sistema está sendo iniciado..");
                         } else{
                             dispose(); // fecha atela de carregamento
                             login.setVisible(true); // pega a tela de login
                         }
                    }

                 }catch (InterruptedException ex) { // esse fecha o try
                 }
            }
        }.start(); // fecha a therad
    }

