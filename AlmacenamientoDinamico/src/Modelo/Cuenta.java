package Modelo;

public class Cuenta {
    private String numero;
    private String tipo;//Corriente/Ahorro/Debito
    private int saldo;

    public Cuenta() { }

    public Cuenta(String numero, String tipo, int saldo) {
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public String getNumero()            {  return numero;  }
    public void setNumero(String numero) {  this.numero = numero;   }

    public String getTipo()              {  return tipo;    }
    public void setTipo(String tipo)     {  this.tipo = tipo;    }

    public int getSaldo()                {  return saldo;    }
    public void setSaldo(int saldo)      {  this.saldo = saldo;  }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numero='" + numero + '\'' +
                ", tipo='" + tipo + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
