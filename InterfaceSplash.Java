
package interfaces;
// interface splash é para abertura de sistemas

public class SplashScreen extends javax.swing.JFrame {

  
    public SplashScreen() {
        initComponents();
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
                         }
                    }

                 }catch (InterruptedException ex) { // esse fecha o try
                 }
            }
        }.start(); // fecha a therad
    }

